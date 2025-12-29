/**
 * 
 */
package ar.edu.unlp.oo2.Ejer6ToDoItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	ToDoItem item;
	
	
	@BeforeEach
	void setUp() throws Exception {
		item = new ToDoItem("name", new Pending());
		
	}
    @Test //dio bien
    public void testComentarioeCompleto() {
    	item.addComment("comentario1");
        item.addComment("comentario2");
        assertEquals(" comentario1 comentario2", item.comentario());
    }
    
    @Test //dio bien
    public void testEstado() {
        assertTrue(item.getState() instanceof Pending);
        item.start();
        assertTrue(item.getState() instanceof InProgress);
    	item.togglePause();
    	assertTrue(item.getState() instanceof Paused);
    	
    }
}
