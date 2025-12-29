package ar.edu.unlp.oo2.Ejer6ToDoItem;

import java.time.Duration;

public class Paused implements State{

	@Override
	public void start(ToDoItem item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void togglePause(ToDoItem item) {
		item.setState(new InProgress());
		
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
