package ar.edu.unlp.oo2.Ejer6ToDoItem;

import java.time.Duration;

public class Pending implements State{
	
	/**
	 * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	 * pending. Si se encuentra en otro estado, no hace nada.
	 */
	public void start(ToDoItem item) {
		item.setState(new InProgress()); 
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
