package guia05;

import java.util.List;

import guia05.Exception.AlquilerNoEsEntregadoException;

public class Usuario {

	private String nombre;
	private String apellido;
	private String DNI;
	private String email;
	private List<Contratable> itemsContratados;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Contratable> getItemsContratados() {
		return itemsContratados;
	}

	public void setItemsContratados(List<Contratable> itemsContratados) {
		this.itemsContratados = itemsContratados;
	}

	public void contratarServicio(Contratable contratable) {
		if(contratable.trabajo_a_realizar()==true) {
			this.itemsContratados.add(contratable);
		}
	}
	
	public void contratarAlquiler (Contratable contratable) throws AlquilerNoEsEntregadoException {
		int max_herramienta = 0;
		if(contratable.alquilerHer()==true) {
			for(int i=0; i<itemsContratados.size(); i++) {
				if(itemsContratados.get(i).finalizado()==false) {
					max_herramienta++;
				}
			}
			if(max_herramienta>2) {
				throw new AlquilerNoEsEntregadoException();
			}else this.itemsContratados.add(contratable);
		}
	}
	
}

