package guia05;

import java.time.Instant;

import guia05.Exception.AgendaOcupadaException;
import guia05.Exception.AlquilerNoEsEntregadoException;
import guia05.Exception.OficioNoCoincideException;

public class App {

	public static void main(String[] args) throws AlquilerNoEsEntregadoException, OficioNoCoincideException, AgendaOcupadaException  {
		
		Usuario u1 = new Usuario("Matias", "Ifran", "41256212", "pepi@gmial.com");
		
		Herramienta h1 = new Herramienta("Pala", 50);
		Herramienta h2 = new Herramienta("Escalera", 200);
		Herramienta h3 = new Herramienta("Andamio", 100);
		
		Alquiler A1 = new Alquiler(h3, Instant.parse("2021-05-28T22:33:00.00Z"));
		Alquiler A2 = new Alquiler(h1, Instant.parse("2021-04-30T22:33:00.00Z"));
		Alquiler A3 = new Alquiler(h2, Instant.parse("2021-04-30T22:33:00.00Z"));
		
		Oficio of1 = new Oficio("Albañil");
	    Oficio of2 = new Oficio("Carpintero");
	    
	    Trabajador t1 = new Trabajador("Juan", "juan@perez.com", of2, 55.30);
	   
	    Estandar e1 = new Estandar(of1, false, 350.19);
	    Personalizado p1 = new Personalizado(of2, true, 400.0, 1000.0, 500.0);
	    
	    Trabajo trab1 = new Trabajo(e1, Instant.now().plusSeconds(86400), t1);
	  
	    
	    try {
	    	 u1.contratarAlquiler(A1);
	    }catch (AlquilerNoEsEntregadoException excep) {
	    	excep.printStackTrace();
	    }
	    
	    try {
	    	 u1.contratarAlquiler(A2);
	    }catch (AlquilerNoEsEntregadoException excep) {
	    	excep.printStackTrace();
	    }
	    
	    try {
	    	 u1.contratarAlquiler(A3);
	    }catch (AlquilerNoEsEntregadoException excep) {
	    	excep.printStackTrace();
	    }
	   
	   
	    u1.contratarServicio(trab1);
	    
		System.out.println();
	}

}
