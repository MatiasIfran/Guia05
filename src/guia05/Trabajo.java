package guia05;

import java.time.Instant;

public class Trabajo implements Contratable {

	private Trabajador trabajador;
	private Servicio servicio;
	private Instant fechaFin;
	private double costoTrabajo;
	
	public Trabajo(Servicio servicio, Instant fechaFin, Trabajador trabajador) {
		this.servicio = servicio;
		this.fechaFin = fechaFin;
		this.trabajador = trabajador;
	}
	
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	public Instant getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Instant fechaFin) {
		this.fechaFin = fechaFin;
	}
	public double getCostoTrabajo() {
		return costoTrabajo;
	}
	public void setCostoTrabajo(double costoTrabajo) {
		this.costoTrabajo = costoTrabajo;
	}
	
	@Override
	public Double precio() { //devuelve el precio del trabajo hora hombre sin importar que sea estandar o personalizado
		this.costoTrabajo = this.trabajador.getCosto_hora()*Servicio.getHoras_trabajo();
		this.setCostoTrabajo(costoTrabajo);
		return this.getCostoTrabajo();
	}
	
	@Override
	public boolean finalizado() {
		if(this.fechaFin!=null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean alquilerHer() {
		return false;
	}
	@Override
	public boolean trabajo_a_realizar() {
		return true;
	}
	
	
}
