package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int respuesta = 0;
		int intentos = 0;
		long tiempoA = System.nanoTime();
		Random r = new Random();
		int numero = r.nextInt(200 - 100 + 1) + 100;
		while(respuesta != numero) {
		System.out.println("Adivina un número entre el 100 y el 200");
		respuesta = s.nextInt();
		intentos = intentos + 1;
		if(respuesta <100 || respuesta >200) 
			System.out.println("Tiene que estar comprendido entre 100 y 200");
		
		}
		 long tiempoB = System.nanoTime();
		 long tiempo = tiempoB - tiempoA;
		 System.out.println("Has acertado el número");
		 System.out.println("El número de intentos es: " + intentos);
		 System.out.println("El tiempo que has tardado es: " + tiempo);
		
		
		
		
		
		
		
		

	}

}
