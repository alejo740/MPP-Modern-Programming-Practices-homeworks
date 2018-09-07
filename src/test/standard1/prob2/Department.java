package test.standard1.prob2;

import java.util.logging.Logger;

public abstract class Department {
	private StringQueue queue = new StringQueue();

	public StringQueue getQueue() {
		return queue;
	}
	// implement
	
	public void addMessage(String msg) {
		queue.enqueue(msg);
	}
	
	public String nextMessage() {
		String result = "";
		try {
			result = queue.dequeue();
		} catch (EmptyQueueException e) {
			 Logger.getLogger("EmptyQueueException").warning(e.getMessage());
		} 
		
		return result;
	}
	
	abstract String getName();
}
