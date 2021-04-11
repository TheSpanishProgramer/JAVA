package Tablas;

public class DesplazarElementosNVeces01 {

	public static void main(String[] args) { 

		int t[]=new int[10]; 
		int ultimo = 0;      
		int n;

		// leemos la tabla 

		for (int i=0;i<10;i++){    

			System.out.print("Introduzca número: ");  

			t[i]=Utilidades.Entrada.entero();     

		}

		// preguntamos cuantas posiciones se desea desplazar     

		System.out.print("Posiciones a desplazar:" );

		n = Utilidades.Entrada.entero();

		// del ejercicio anterior tenemos una versión que desplaza una sola    
		// posición. Si repetimos este proceso n veces, conseguiremos    
		// desplazar n veces.      
		// este algoritmo es muy fácil de implementar, pero es muy costoso en tiempo.

		for (int vueltas=1;vueltas <=n; vueltas++)    

		{       
			// guardamos el último elemento de la tabla    
			ultimo = t[9];
		}
		// desplazamos hacia abajo (de 0 hacia la última posición)
		// al desplazar perdemos el último valor, por eso lo tenemos guardado.           

		for (int i=8;i>=0;i--)             

			t[i+1]=t[i];

		// el último valor pasa a ser el primero   
		t[0] =ultimo; 



		System.out.println("La tabla queda:"); 

		for (int i=0;i<10;i++)      

			System.out.println(t[i]); 

	} 

}
