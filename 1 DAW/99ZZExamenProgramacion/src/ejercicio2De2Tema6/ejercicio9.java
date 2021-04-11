package ejercicio2De2Tema6;

/* Guarda los datos de 5 alumnos, compuestos por el número de matricula, nombre y nota en una asignatura. Para almacenar la información tendremos 3 vectores (matricula, nombre y nota). Sacar 3 listados consecutivos y ordenados, el primero ascendentemente por el número de matricula, el 2º por el nombre ascendentemente y el 3º descendentemente por la nota. Se deberán realizar 3 métodos para sacar los listados (3 métodos de ordenación). */

public class ejercicio9 {
	
	/* E: mat => vector de matriculas
	      nom => vector de nombres
	      nota => vector de notas
	      i => posición del vector
	      j => posición del vector	      
	   S: nada, intercambia la posición i y j de todos los vectores
	   requisito: los 3 vectores deben tener el mismo número de elementos */
	public static void intercambiar (int mat[], String nom[], float nota[], int i, int j) {
		int aux_mat;
		String aux_nom;
		float aux_nota;
		
		aux_mat = mat[i]; aux_nom = nom[i]; aux_nota = nota[i];
		mat[i] = mat[j];  nom[i] = nom[j];  nota[i] = nota [j];
		mat[j] = aux_mat; nom[j] = aux_nom; nota[j] = aux_nota;		
	} // fin intercambiar	
	
	
	// NO TE LO PIDE EL EJERCICIO PERO TAMBIÉN SE PODÍA HABER ORDENADO CON SHELL
	
	/* E: mat => vector de matriculas
	      nom => vector de nombres
	      nota => vector de notas	
	      tipo => 1, 2 o 3           
	   S: nada, 
	   si tipo = 1 => ordena los 3 vectores simultáneamente por el número de matricula ascendentemente
	   si tipo = 2 => ordena los 3 vectores simultáneamente por el nombre ascendentemente
	   si tipo = 3 => ordena los 3 vectores simultáneamente por la nota descendentemente
	   ten en cuenta que la posición de cada vector están relacionadas entre si
	   por ejemplo, la posición 3 corresponde a la información del alumno 3: nombre, matricula y nota
	   requisito: los 3 vectores deben tener el mismo número de elementos */
	public static void shell (int mat[], String nom[], float nota[], int tipo) {
		int d, i;
		boolean ordenado, intercambio;
		int num_ele = mat.length; // número de elementos
		
		d = num_ele; // distancia de comparación
		
		/* La ordenación se realiza mientras la distancia de comparación d sea distinta de 1, 
				ya que despues  d= d/2*/
		while (d != 1) {
			/*calcula la nueva distancia de comparación d*/
			d = d/2;
			ordenado = false;
			/* ordena el vector para la distancia d */	
			while (!ordenado) { 	// !ordenado es como poner ordenado == false
				ordenado = true;
				for (i=0; i < num_ele-d; i++) {
					// si el elemento i es mayor que i+d los intercambia en los 3 vectores
					intercambio = false;
					switch (tipo) {
						case 1: // ordenar por matrícula ascendentemente		
							if (mat[i] > mat[i+d])
								intercambio = true;
							break;
						case 2: // ordenar por el nombre ascendentemente		
							if (nom[i].compareTo(nom[i+d]) > 0)
								intercambio = true;
							break;
						case 3: // ordenar por la nota descendentemente		
							if (nota[i] < nota[i+d])
								intercambio = true;							
					} // fin switch
					
					// comprobar si hay que realizar el intercambio, es como poner intercambio == true
					if (intercambio) { 
						intercambiar (mat, nom, nota, i, i+d);
						ordenado = false;
					}
				} // fin for
					
			} /* fin while ordenado */    
		} /* fin while d */

	} /* fin shell */

	/* E: mat => vector de matriculas
	      nom => vector de nombres
	      nota => vector de notas
	      mensaje => mensaje a mostrar
	   S: nada, muestra por pantalla los 3 vectores 
	   requisito: los 3 vectores deben tener el mismo número de elementos */
	public static void mostrar (int mat[], String nom[], float nota[], String mensaje) {
		System.out.println ("\nListado de los alumnos " + mensaje + "\n");
		for (int i=0; i<mat.length; i++)
			System.out.println ("Nombre: "+ nom[i] + ", Matrícula: " + mat[i] + ", Nota:" + nota[i]);		
	} // fin mostrar
	
	
	// NUEVO
	/* E: mat => vector de matriculas 
		nom => vector de nombres 
		nota => vector de notas			 
		tipo => 1, 2 o 3           
	   S: nada, 
		si tipo = 1 => ordena los 3 vectores simultáneamente por la matricula ascendentemente 
		si tipo = 2 => ordena los 3 vectores simultáneamente por el nombre ascendentemente 
		si tipo = 3 => ordena los 3 vectores simultáneamente por la nota descendentemente 
		requisito: los 3 vectores deben tener el mismo número de elementos */ 
	public static void quicksort (int mat[], String nom[], float nota[], int tipo) {
		quicksort(mat, nom, nota, 0, mat.length-1, tipo);		
	}
	
	// NUEVO	
	/* E: mat => vector de matriculas 
		nom => vector de nombres 
		nota => vector de notas
		izq => posición del indice izquierda dentro del vector
		der => posición del indice derecha dentro del vector	 
		tipo => 1, 2 o 3           
	   S: nada, 
		si tipo = 1 => ordena los 3 vectores simultáneamente por la matricula ascendentemente 
		si tipo = 2 => ordena los 3 vectores simultáneamente por el nombre ascendentemente 
		si tipo = 3 => ordena los 3 vectores simultáneamente por la nota descendentemente 
		requisito: los 3 vectores deben tener el mismo número de elementos */ 
	public static void quicksort (int mat[], String nom[], float nota[], int izq, int der, int tipo) {
		
		// tomamos primer elemento como pivote	(posición del pivote)
		int pivote1 = mat[izq], i=izq, j=der;				
		String pivote2 = nom[izq];
		float pivote3 = nota[izq];
		
		while(i<j){            
			// mientras no se crucen las búsquedas		
			if (tipo == 1) {
				// ordena los 3 vectores simultáneamente por la matricula ascendentemente 
				while(mat[i]<=pivote1 && i<j) 
					i++; // busca elemento mayor que pivote
				
				while(mat[j]>pivote1) 
					j--;         // busca elemento menor igual que pivote
					
			} else if (tipo == 2) {
				while(nom[i].compareTo(pivote2)<=0 && i<j) 
					i++; // busca elemento mayor que pivote
					
				while(nom[j].compareTo(pivote2) >0) 
					j--;         // busca elemento menor igual que pivote
					
			} else if (tipo == 3) {
				while(nota[i]>=pivote3 && i<j) 
					i++; // busca elemento menor que pivote
			
				while(nota[j]<pivote3) 
					j--;         // busca elemento mayor igual que pivote situado el j
			}
			
			if (i<j) {                      // si no se han cruzado  
				intercambiar(mat,nom,nota,i,j);				 
			}
		}
		
		mat[izq]=mat[j]; // se coloca el pivote en su lugar de forma que tendremos
		mat[j]=pivote1; // los menores a su izquierda y los mayores a su derecha ( o al réves) 
						  // según el tipo de ordenación
		nom[izq]=nom[j];
		nom[j] = pivote2;
		
		nota[izq] = nota[j];
		nota[j] = pivote3;
		
		
		if(izq<j-1)
			quicksort (mat, nom, nota, izq, j-1, tipo); // ordenamos subarray izquierdo
			
		if(j+1 <der)
			quicksort (mat, nom, nota, j+1, der, tipo); // ordenamos subarray derecho				
		
		  
 	}
	
	
	public static void main (String args[]) {
		int matricula [] = {1234, 56778, 567, 4555, 3423, 800};
		String nombre [] = {"Pedro", "María", "Esteban", "Zacarias", "Fernanda", "Juan"};
		float nota [] = {5.5f, 4.3f, 8.8f, 4.5f, 7.7f, 5,5f};		
		
		/* ORDENAR POR SHELL
		// ordenar por matrícula
		mostrar (matricula, nombre, nota, "sin ordenar");
		shell (matricula, nombre, nota, 1);
		mostrar (matricula, nombre, nota, "ordenado por la matrícula ascendentemente");
		
		// ordenar por nombre
		shell (matricula, nombre, nota, 2);
		mostrar (matricula, nombre, nota, "ordenado por el nombre ascendentemente");
		
		// ordenar por nota
		shell (matricula, nombre, nota, 3);
		mostrar (matricula, nombre, nota, "ordenado por la nota descendentemente");		
		*/
		
		// ORDENAR POR QUICKSORT
		
		// ordenar por matrícula
		mostrar (matricula, nombre, nota, "sin ordenar");
		quicksort (matricula, nombre, nota, 1);
		mostrar (matricula, nombre, nota, "ordenado por la matrícula ascendentemente");
		
		// ordenar por nombre
		quicksort (matricula, nombre, nota,2);
		mostrar (matricula, nombre, nota, "ordenado por el nombre ascendentemente");
		
		// ordenar por nota
		quicksort (matricula, nombre, nota, 3);
		mostrar (matricula, nombre, nota, "ordenado por la nota descendentemente");	
		
	
	} // fin main

} // fin clase ejercicio 9
