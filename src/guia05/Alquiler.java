package guia05;

import java.time.Duration;
import java.time.Instant;

public class Alquiler implements Contratable {
	
	private Herramienta herramienta;
	private Instant fechaInicio;
	private Instant fechaEntrega;
	private Instant fechaDevolucionActual=null;
	
	public Alquiler(Herramienta herramienta, Instant fechaEntrega) {
		this.herramienta = herramienta;
		this.fechaInicio = Instant.now(); //suponiendo que cuando llamo a alquiler, estoy por alquilar algo
		this.fechaEntrega= fechaEntrega;
	}
	
	public Herramienta getHerramienta() {
		return herramienta;
	}
	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}
	
	public Alquiler(Instant fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public void fechaInicio(Instant fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/*public void fechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}*/
	public void fechaDevolucionActual(Instant fechaDevolucionActual) {
		this.fechaDevolucionActual = fechaDevolucionActual;
	}
	
	public Double precio() {
		return this.diasAlquilados()*herramienta.getCosto_herramienta();
	}
	
	public boolean finalizado() {
		if(this.fechaDevolucionActual!=null) {
			return true;
		}
		return false;
	}
	
	public long diasAlquilados() {
		return Duration.between(fechaInicio, fechaDevolucionActual).toDays();
	}
	public long diasAdeudados() {
		return Duration.between(fechaEntrega, fechaDevolucionActual).toDays();
	}
	
	public boolean enMora() {
		if((this.finalizado()==true && this.diasAdeudados()>0) || this.finalizado()==false) {
			return true; //significa que esta en mora 
		}
		return false;
	}
	
	public boolean alquilerHer() {
		return true;
	}
	public boolean trabajo_a_realizar() {
		return false;
	}
	
}
