package Funciones;

public class MensajeRepetidoNVeces {       

	public static void main(String[] args) {  

		int num;

		System.out.print("Introduzca un numero: "); 

		num=Utilidades.Entrada.entero();     

		System.out.println("---------------------------"); 

		mostrar(num);       

		System.out.println("---------------------------");

	}
	static void mostrar(int num){

		for (int i=0;i<num;i++){   

			System.out.println("Módulo ejecutándose"); 

		}   

	} 

}
