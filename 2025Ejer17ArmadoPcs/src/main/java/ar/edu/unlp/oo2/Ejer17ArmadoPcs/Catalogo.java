package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	private List<Componente> componetes = new ArrayList<>() ;

	public Catalogo(List<Componente> componetes) {
		this.componetes = componetes;
	} 

	public Componente getComponente(String des) {
		return this.componetes.stream().filter(d -> d.getDes().equals(des)).findFirst().orElse(null);

	}

	
}