package guia05;

public abstract class Servicio {
	
	private static Oficio oficio; 
	private static int horas_trabajo;
	private static Trabajo trabajo;
	public abstract Double costo();
	private Boolean urgente;
	
	public Servicio(Oficio oficio, Boolean urgente) {
		this.oficio = oficio;
		this.urgente = urgente;
	}
	
	public static int getHoras_trabajo() {
		return horas_trabajo;
	}
	public static void setHoras_trabajo(int horas_trabajo) {
		Servicio.horas_trabajo = horas_trabajo;
	}

	public static Trabajo getTrabajo() {
		return trabajo;
	}

	public static void setTrabajo(Trabajo trabajo) {
		Servicio.trabajo = trabajo;
	}

	public static Oficio getOficio() {
		return oficio;
	}

	public static void setOficio(Oficio oficio) {
		Servicio.oficio = oficio;
	}

	public Boolean getUrgente() {
		return urgente;
	}

	public void setUrgente(Boolean urgente) {
		this.urgente = urgente;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
