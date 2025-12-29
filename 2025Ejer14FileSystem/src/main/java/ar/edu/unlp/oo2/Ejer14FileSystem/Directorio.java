package ar.edu.unlp.oo2.Ejer14FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem {

	private ArrayList<FileSystem> contenido;
	
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		this.contenido = new ArrayList<>();
	}

	@Override
	public int tamanoTotalOcupado() {
		return 32 + this.contenido.stream()
		        .mapToInt(t -> t.tamanoTotalOcupado())
		        .sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this.contenido.stream().map(arc -> arc.archivoMasGrande()) //coleccion de Archivos
							 .filter(archivo -> archivo != null) //en el caso de que el directorio este vacio 
							.max((tam1, tam2)-> Integer.compare(tam1.getTamBytes(), tam2.getTamBytes())) 
							  .orElse(null); 
	}
	
	@Override
	public Archivo archivoMasNuevo() {
	    return this.contenido.stream()
	        .map(arc -> arc.archivoMasNuevo())
	        .filter(archivo -> archivo != null) //en el caso de que el directorio este vacio
	        .max((fech1, fech2) -> fech1.getFechaCreacion().compareTo(fech2.getFechaCreacion()))
	        .orElse(null);
	}

	@Override
	public FileSystem buscar(String nombre) {
	    // 1. **Verificar el Directorio Actual:** Si el nombre coincide con el del propio Directorio, retorna 'this'.
	    if (this.getNombre().equals(nombre)) {
	        return this;
	    }

	    // 2. **Búsqueda Recursiva en el Contenido:**
	    //    a. Recorre todos los 'FileSystem' dentro de 'contenido'.
	    //    b. Llama recursivamente a 'fs.buscar(nombre)' en cada uno de ellos.
	    //    c. Filtra los resultados nulos (los que no encontraron nada).
	    //    d. Retorna el primer resultado NO NULO que encuentre.
	    return this.contenido.stream()
	        .map(fs -> fs.buscar(nombre)) // Llama recursivamente (podría retornar FileSystem o null)
	        .filter(resultado -> resultado != null) // Ignora los subárboles donde no se encontró nada
	        .findFirst() // Toma el primer resultado válido
	        .orElse(null); // Si el stream está vacío (no se encontró nada), retorna null
	}
	
	/* si en el metodo buscarTodos uso map en lugar de flatMap
 	this.contenido.stream().map(fs -> fs.buscarTodos(nombre)) // ERROR LOGICO
    // Resultado: Stream<List<FileSystem>> */
	
	/*@Override // este no incluye a los directorios .
	public List<FileSystem> buscarTodos(String nombre) {
	    return this.contenido.stream()
	        // Llama a buscarTodos() en cada componente (que ya incluye el filtrado SI SE LLAMAN IGUAL)
	        // flatMap se encarga de aplanar todas las Listas devueltas por la recursión
	        .flatMap(fs -> fs.buscarTodos(nombre).stream())
	        .collect(java.util.stream.Collectors.toList());
	}
	
	Opcion B que si funciona 
	@Override
	public List<FileSystem> buscarTodos(String nombre) {
	    return java.util.stream.Stream.concat(
	        // 1. Stream del Directorio Actual: Incluye 'this' si el nombre coincide.
	    		this.getNombre().equals(nombre) ? java.util.stream.Stream.of(this) : java.util.stream.Stream.empty(),
	        
	        // 2. Stream de Resultados Recursivos: Combina todos los resultados de los hijos.
	    				this.contenido.stream().flatMap(fs -> fs.buscarTodos(nombre).stream())).collect(java.util.stream.Collectors.toList()
	    );
	}
	}*/
	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> coinciden = new ArrayList<>();
		if(this.getNombre().equals(nombre))
			coinciden.add(this); 
	   // 2. Stream de Resultados Recursivos: Combina todos los resultados de los hijos.
	    this.contenido.stream().flatMap(fs -> fs.buscarTodos(nombre).stream()).forEach(fs -> coinciden.add(fs));
	    return coinciden;
	}
	@Override
	public String listadoDeContenido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addContenido(FileSystem fs) {
		this.contenido.add(fs);
		
	}

	@Override
	public void removeContenido(FileSystem fs) {
		this.contenido.remove(fs); 
		
	} 
}
