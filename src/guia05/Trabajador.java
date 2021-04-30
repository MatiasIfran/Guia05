package guia05;

import java.util.List;

import guia05.Exception.AgendaOcupadaException;
import guia05.Exception.OficioNoCoincideException;

public class Trabajador {

	private	String email;
	private String nombre;
	private Oficio oficio;
	private double costo_hora;
	private List<Trabajo> trabajosAsignados; 
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Oficio getOficio() {
		return oficio;
	}
	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}
	public double getCosto_hora() {
		return costo_hora;
	}
	public void setCosto_hora(double costo_hora) {
		this.costo_hora = costo_hora;
	}
	public List<Trabajo> getTrabajosAsignados() {
		return trabajosAsignados;
	}
	public void setTrabajosAsignados(List<Trabajo> trabajosAsignados) {
		this.trabajosAsignados = trabajosAsignados;
	}
	
		
	public void agregarTareas(Trabajo tarea) throws OficioNoCoincideException, AgendaOcupadaException {
		if(this.oficio.equals(tarea.getTrabajador().oficio)) {
			if(this.trabajosAsignados.isEmpty()) { //si esta vacia la lista de trabajos es porque puede trabajar
				this.trabajosAsignados.add(tarea);
			}
			else {
				throw new AgendaOcupadaException();
			}
				
		}
		else {
			throw new OficioNoCoincideException();
		}
	}
	
}
