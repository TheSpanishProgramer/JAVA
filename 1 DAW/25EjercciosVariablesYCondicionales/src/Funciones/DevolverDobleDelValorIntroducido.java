package Funciones;

public class DevolverDobleDelValorIntroducido {

	static void doble(int num)    {

		int doble;

		doble=2*num; // calculamos el doble de num

		System.out.println("El doble es: " +doble);

	}
	public static void main(String[] args) { 

		int num;

		System.out.print("Introduzca un número: "); 

		num=Utilidades.Entrada.entero(); 

		doble(num);   

	} 

}



