package Ejercicio02b;

/*Programa que muestre por pantalla los números enteros comprendidos entre 1000 y 5,
ambos inclusive. Empezamos por el 1000 y terminamos por el 5.
Realiza 3 versiones del programa usando el bucle while, do while y for
¿Cuál es el tipo de bucle más adecuado para realizar este ejercicio y por qué?*/

public class bucle2 {
	public static void main (String args[]) {
		int fin = 1000;
		
		int i=fin;		
		
		// bucle más apropiado, escribes menos código
		for (i=fin; i>=5; i--)
			System.out.println (i);

	}// fin main
	
} // fin clase bucle1
