package ar.edu.unlp.oo2.Ejer6ToDoItem;

import java.time.Duration;

public class ToDoItem {
	private State estado; 
	private String name; 
	private String coment; 
	
	public ToDoItem (String nombre, State estado) {
		this.estado = new Pending(); 
		this.name = nombre; 
		this.coment = "";
	}
	
	/**
	 * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	 * pending. Si se encuentra en otro estado, no hace nada.
	 */
	public void start() {
		this.estado.start(this);
	}
	
	/**
	 * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress
	 * si su estado es paused. Caso contrario (pending o finished) genera un
	 * error informando la causa específica del mismo.
	 */
     public void togglePause() {
    	 this.estado.togglePause(this);
     }


		/**
	 * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	 * in-progress o paused. Si se encuentra en otro estado, no hace nada.
	 */
     public void finish() {
    	 this.estado.finish(this);
     }

 	/**
  * Retorna el tiempo que transcurrió desde que se inició el ToDoItem 
  * (start) hasta que se finalizó. En caso de que no esté finalizado, el 
  * tiempo que haya transcurrido hasta el momento actual. Si el ToDoItem no 
  * se inició, genera un error informando la causa específica del mismo.
  */
   public Duration workedTime() {
	    return this.estado.workedTime(this);
   }

 /**
  * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado.
  * Caso contrario no hace nada.
  */
  public void addComment(String comment) {
	 setComent(comment); 
 }

 public String comentario() {
	 return this.coment;
 }
 public void setComent(String c) {
	 this.coment = this.coment + " " + c;
 }
  public void setState(State s) {
	  this.estado = s; 
  }
  public State getState() {
	  return this.estado; 
  }
}
