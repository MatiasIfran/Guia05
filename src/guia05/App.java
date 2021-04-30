package guia05;

import java.time.Instant;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Herramienta h1 = new Herramienta("Pala", 50);
		Herramienta h2 = new Herramienta("Escalera", 200);
		Herramienta h3 = new Herramienta("Andamio", 100);
		
		Alquiler A1 = new Alquiler(h3, Instant.parse("2021-04-28T22:33:00.00Z"));
		
		System.out.println();
	}

}
