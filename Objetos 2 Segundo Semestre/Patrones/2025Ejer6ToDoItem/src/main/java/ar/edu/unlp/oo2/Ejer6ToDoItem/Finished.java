package ar.edu.unlp.oo2.Ejer6ToDoItem;

import java.time.Duration;

public class Finished implements State{

	@Override
	public void start(ToDoItem item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
		
	}

	@Override
	public void finish(ToDoItem item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Duration workedTime(ToDoItem item) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
