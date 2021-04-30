package guia05;

public class Estandar extends Servicio{
	
	double costoFijo;
	
	public Estandar(Oficio oficio, boolean urgente, Double monto_total) {
		super(oficio, urgente);
		this.costoFijo = monto_total;
	}
	
	public Double costo() {
		if(this.getUrgente()==true) {
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

}
