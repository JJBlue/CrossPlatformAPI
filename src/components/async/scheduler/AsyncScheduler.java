package components.async.scheduler;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AsyncScheduler<E extends Object> {
	List<AsyncThread<E>> threads = Collections.synchronizedList(new LinkedList<>());
	List<E> runnables = Collections.synchronizedList(new LinkedList<>());
	
	AsyncExecuter<E> executer;
	AsyncThreadKiller killer;
	
	boolean shutdown = false;
	int threadscount;
	
	public AsyncScheduler(int threadsamaount) {
		setThreads(threadsamaount);
	}
	
	//List runnables methods
	public void add(E runnable) {
		if(shutdown) return;
		
		runnables.add(runnable);
		proceedThread();
	}
	
	E remove() {
		synchronized (runnables) {
			if(runnables.isEmpty())
				return null;
			return runnables.remove(0);
		}
	}
	
	synchronized boolean isEmpty() {
		return runnables.isEmpty();
	}
	
	public int waitingPackets() {
		return runnables.size();
	}
	
	//Threads
	void proceedThread() {
		for(AsyncThread<?> thread : threads) {
			if(!thread.isRunning() && !thread.isClosed()) {
				thread.proceed();
				break;
			}
		}
		
		if(killer != null)
			killer.proceed();
	}
	
	void removeThread(AsyncThread<?> thread) {
		threads.remove(thread);
		
		if(threads.isEmpty())
			killer.close();
	}
	
	/**
	 * 
	 * @return true if a thread is active and execute something.
	 */
	public boolean isSomethingRunning() {
		synchronized (threads) {
			for(AsyncThread<?> thread : threads) {
				if(thread.isRunning() && thread.isAlive())
					return true;
			}
		}
		
		return false;
	}
	
	public int getRunningThreads() {
		int count = 0;
		
		synchronized (threads) {
			for(AsyncThread<?> thread : threads) {
				if(thread.isRunning() && thread.isAlive())
					count++;
			}
		}
		
		return count;
	}
	
	public void interruptAll() {
		threads.forEach(thread -> {
			if(thread.isRunning())
				thread.interrupt();
		});
	}
	
	@SuppressWarnings("deprecation")
	synchronized void restartThread(AsyncThread<?> thread) {
		threads.remove(thread);
		thread.stop();
		
		if(shutdown)
			return;
		
		createThread();
	}
	
	public void printInformation() {
		for(AsyncThread<E> ttt : threads) {
			System.out.println(
					"TCP:"
					+ "\n	isClosed: " + ttt.isClosed()
					+ "\n	Running: " + ttt.isRunning()
					+ "\n	State: " + ttt.getState()
					+ "\n	isAlive: " + ttt.isAlive()					
			);
		}
	}
	
	public boolean isThreadOfMe() {
		return threads.contains(Thread.currentThread());
	}
	
	//Executor
	public void execute(E object) {
		if(executer == null || object == null)
			return;
		
		try {
			executer.execute(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setExecuter(AsyncExecuter<E> executer) {
		this.executer = executer;
	}
	
	public AsyncExecuter<E> getExecuter() {
		return executer;
	}
	
	//Killer
	/**
	 * 
	 * @param time : If the execute of a Object didn't end if the time, it could be killed. time <= 0 is disabled
	 */
	public synchronized void setMaxExecuteTime(long time) {
		loadKiller(time);
		if(time > 0)
			killer.maxTime = time;
	}
	
	public long getMaxExecuteTime() {
		return killer != null ? killer.maxTime : -1;
	}
	
	synchronized void loadKiller(long time) {
		if(killer != null && !killer.isClosed())
			return;
		
		killer = new AsyncThreadKiller(this);
		killer.maxTime = time;
		killer.start();
	}
	
	//Shutdown
	public synchronized void shutdown() {
		shutdown = true;
		threads.forEach((thread) -> thread.proceed());
	}
	
	public synchronized void shutdownNow() {
		threads.forEach((thread) -> thread.closeByPass());
		shutdown();
		threads.clear();
	}
	
	//Threads init
	public synchronized void setThreads(int amount) {
		if(amount < 0 || amount == threadscount || shutdown)
			return;
		
		if(amount > threadscount) {
			for(int i = threadscount; i < amount; i++) {
				createThread();
			}
		} else {
			for(int i = threadscount; i > amount; i--) {
				AsyncThread<E> thread = threads.remove(0);
				thread.close();
				thread.proceed();
			}
		}
		
		threadscount = amount;
	}
	
	AsyncThread<E> createThread() {
		AsyncThread<E> thread = new AsyncThread<>(this);
		thread.start();
		threads.add(thread);
		return thread;
	}
	
	public int getThreads() {
		return threadscount;
	}
}
