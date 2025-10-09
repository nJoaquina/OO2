package ar.edu.unlp.oo2.Ejer6ToDoItem;

import java.time.Duration;

public class InProgress implements State{
	
	public InProgress() {}

	@Override
	public void start(ToDoItem item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void togglePause(ToDoItem item) {
		item.setState(new Paused());
		
	}

	@Override
	public void finish(ToDoItem item) {
		item.setState(new Finished());
		
	}

	@Override
	public Duration workedTime(ToDoItem item) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
