package guia05;

public class Personalizado extends Servicio {
	
	double costo_mat;
	double costo_flete;
	double metros_2; //supongo que todos los trabajos personalizados se basan en mediciones especificamente para cada cliente 
	
	
	public Double costo() {
			
		if(Servicio.getTrabajo().isUrgente()==true) {
			return (Servicio.getTrabajo().precio()+costo_mat+costo_flete+metros_2)*1.5;
		}else {
			return Servicio.getTrabajo().precio()+costo_mat+costo_flete+metros_2;
		}
	}

	public double getCosto_mat() {
		return costo_mat;
	}

	public void setCosto_mat(double costo_mat) {
		this.costo_mat = costo_mat;
	}

	public double getCosto_flete() {
		return costo_flete;
	}

	public void setCosto_flete(double costo_flete) {
		this.costo_flete = costo_flete;
	}
	
	public double getMetros_2() {
		return metros_2;
	}

	public void setMetros_2(double metros_2) {
		this.metros_2 = metros_2;
	}

	public Personalizado(double costo_mat, double costo_flete, double metros_2) {
		this.costo_flete = costo_flete;
		this.costo_mat = costo_mat;
		this.metros_2 = metros_2;
	}

}
