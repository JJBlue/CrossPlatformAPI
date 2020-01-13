package components.async.scheduler;

public class AsyncThread<E extends Object> extends Thread {
	private boolean working = true;
	private boolean pause = false;
	
	private AsyncScheduler<E> scheduler;
	long timeStartExecute = -1; //nanos
	boolean deadlock = false;
	
	public AsyncThread(AsyncScheduler<E> scheduler) {
		this.scheduler = scheduler;
	}
	
	@Override
	public void run() {
		while(working) {
			E object = scheduler.remove();
			
			timeStartExecute = System.nanoTime();
			scheduler.execute(object);
			timeStartExecute = -1;
			deadlock = false;
			
			if(scheduler.isEmpty()) {
				if(scheduler.shutdown)
					break;
				else
					pause();
			}
			
			//------------------------------------Sonstiges--------------------------------------------------------------------------------
			synchronized(this){
				while(!scheduler.shutdown && pause && working) {
					try {
						wait();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		scheduler.removeThread(this);
	}
	
	public long getCurrentExecutionTime() {
		if(timeStartExecute <= 0)
			return -1;
		
		return (System.nanoTime() - timeStartExecute) / 1000000;
	}
	
	public void interruptExecute() {
		synchronized (this) {
			if(!pause && timeStartExecute > 0) {
				this.interrupt();
				deadlock = true;
			}
		}
	}
	
	public void close() {
		working = false;
		scheduler.removeThread(this);
		proceed();
	}
	
	void closeByPass() {
		working = false;
		proceed();
	}
	
	public boolean isClosed() {
		return !working;
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
