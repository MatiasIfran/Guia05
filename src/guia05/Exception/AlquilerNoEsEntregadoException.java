package guia05.Exception;

public class AlquilerNoEsEntregadoException extends Exception {

	public AlquilerNoEsEntregadoException() {
		super("El cliente no puede alquilar mas herramientas ya que cuenta con dos herramientas en su poder");
	}
}
