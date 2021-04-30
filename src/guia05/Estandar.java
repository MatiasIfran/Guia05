package guia05;

public class Estandar extends Servicio{
	
	double costoFijo;
	
	public Double costo() {
		
		if(Servicio.getTrabajo().isUrgente()==true) {
			return (Servicio.getTrabajo().precio()+this.costoFijo)*1.5;
		}else {
			return Servicio.getTrabajo().precio()+this.costoFijo;
		}
		
	}
	
	public double getCostoFijo() {
		return costoFijo;
	}

	public void setCostoFijo(double costoFijo) {
		this.costoFijo = costoFijo;
	}

	public Estandar (double costoFijo) {
		this.costoFijo = costoFijo;
	}
}
