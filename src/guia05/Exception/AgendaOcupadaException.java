package guia05.Exception;

public class AgendaOcupadaException extends Exception {

	public AgendaOcupadaException() {
		super("El trabajador tiene la agenda ocupada ese dia");
		
	}
}
