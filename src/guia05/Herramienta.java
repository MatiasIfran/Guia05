package guia05;

public class Herramienta {

	private String nombre_herramienta;
	private double costo_herramienta;
	
	public Herramienta(String nombre_herramienta, double costo_herramienta) {
		this.costo_herramienta = costo_herramienta;
		this.nombre_herramienta = nombre_herramienta;
	}

	public String getNombre_herramienta() {
		return nombre_herramienta;
	}

	public void setNombre_herramienta(String nombre_herramienta) {
		this.nombre_herramienta = nombre_herramienta;
	}

	public double getCosto_herramienta() {
		return costo_herramienta;
	}

	public void setCosto_herramienta(double costo_herramienta) {
		this.costo_herramienta = costo_herramienta;
	}
	
	
}


