package guia05;

import java.util.ArrayList;

import guia05.Exception.AlquilerNoEsEntregadoException;

public class Usuario {

	private String nombre;
	private String apellido;
	private String DNI;
	private String email;
	private ArrayList<Contratable> itemsContratados;
	
	public Usuario(String nombre, String apellido, String DNI, String email) {
		itemsContratados = new ArrayList<Contratable>();
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.email = email;
	}
	
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

	public ArrayList<Contratable> getItemsContratados() {
		return itemsContratados;
	}

	public void setItemsContratados(ArrayList<Contratable> itemsContratados) {
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
			if(max_herramienta>=2) {
				throw new AlquilerNoEsEntregadoException();

			}else this.itemsContratados.add(contratable);
		}
	}
	
}

