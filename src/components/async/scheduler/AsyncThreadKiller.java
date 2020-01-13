package components.async.scheduler;

import java.util.LinkedList;
import java.util.List;

public class AsyncThreadKiller extends Thread {
	AsyncScheduler<?> scheduler;
	
	long maxTime; //millis
	boolean run = true;
	boolean pause = false;
	List<AsyncThread<?>> deadThreads = new LinkedList<>();
	
	public AsyncThreadKiller(AsyncScheduler<?> scheduler) {
		this.scheduler = scheduler;
	}
	
	@Override
	public void run() {
		while(run && maxTime > 0 && scheduler.getThreads() > 0) {
			try {
				Thread.sleep(maxTime);
			} catch (InterruptedException e1) {
				if(scheduler.shutdown)
					break;
			}
			
			for(AsyncThread<?> thread : scheduler.threads) {
				if(thread.timeStartExecute <= 0)
					continue;
				
				long millis = thread.getCurrentExecutionTime();
				System.out.println(millis);
				if(millis > maxTime) {
					thread.interruptExecute();
				}
			}
			
			for(AsyncThread<?> thread : scheduler.threads) {
				if(!thread.deadlock)
					continue;
				
				deadThreads.add(thread);
			}
			
			deadThreads.forEach(thread -> scheduler.restartThread(thread));
			deadThreads.clear();
			
			if(!scheduler.isSomethingRunning()) {
				if(scheduler.shutdown)
					break;
				else
					pause();
			}
			
			synchronized(this) {
				while(pause) {
					try {
						wait();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		run = false;
	}
	
	public void close() {
		run = false;
		proceed();
	}
	
	public boolean isClosed() {
		return !run;
	}
	
	public void pause() {
		synchronized(this){
			pause = true;
		}
	}
	
	public void proceed(){
		synchronized(this){
			if(pause){
				pause = false;
				notify();
			}
		}
	}
	
	public boolean isRunning(){
		return !pause;
	}
}
