package guia05;

public abstract class Servicio {
	
	
	private static int horas_trabajo;
	private static Trabajo trabajo;
	public abstract Double costo();
	
	
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
	
	
	
	
	
	
	
	
	
	
}
