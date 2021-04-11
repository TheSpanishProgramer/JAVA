package Funciones;

public class MinimoComunMultiploDeDosNumeros01 {

	/* el mínimo común múltiplo de a y b, es el número más pequeño que      
	 *  es divisible por a y b.       
	 *  Para calcularlo podríamos utilizar algún algoritmo existente o hacerlo       
	 *  un poco por la "cuenta de la vieja".       
	 *  La idea es elegir el mayor de a y b, y multiplicarlo por i, hasta que       
	 *  el número resultante sea divisible por el menor de a y b */

	static int min_comun_multiplo (int a, int b)    { 

		int mcm;
		int max; 
		int i;

		max = maximo (a, b);

		mcm =max;   // en principio el mcm es el mayor de los dos números 

		i=1;

		while (mcm%a!=0 || mcm%b!=0)   // si el mcm no es divisible por a y b 

		{            

			i++;            

			mcm=max*i;      // el nuevo mcm sera el mayor por i

		}


		return(mcm); 

	}

	static int maximo (int a, int b){ 

		int max;

		if(a>b)  

			max=a;

		else        

			max=b;

		return(max);

	}
	public static void main(String[] args) {  

		int a, b, mcm;

		System.out.print ("Introduce a: "); 

		a=Utilidades.Entrada.entero();

		System.out.print ("Introduce b: ");

		b=Utilidades.Entrada.entero();

		System.out.println("");

		mcm = min_comun_multiplo (a,b);

		System.out.println("El mcm es: " +mcm);    

	} 

}



