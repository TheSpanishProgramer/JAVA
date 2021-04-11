package ejemplosPolimorfismoConClasesAbstractas;

public class Usa_Animal_Pez_Ave {
	
	public static void main (String args[]) {
		// Crear objetos Animal => ERROR no se puede es una clase abstracta
		// Animal animal1 = new Animal ("Perro callejero", 5); // MAL
		// Animal animal2 = new Animal ("Gato", 4);	// MAL		
		
		// Crea objeto Pez
		Pez pez1 = new Pez ("Sardina", 3);
		Pez pez2 = new Pez ("Bacalao", 4);
				
				
		
		// Crear objetos Ave
		Ave ave1 = new Ave ("Urraca", 7, "negro");
		Ave ave2 = new Ave ("Gorrión", 2, "marrón");
		
		
		
		// Ejemplo 1 POLIMORFISMO
		// mediante una variable de la superclase que apunta a un objetos de la subclase,
		// se pueden llamar a métodos que estén tanto en la superclase como en la subclase,
		// por ejemplo toString() y mover()
		
		System.out.println ("\n Ejemplo 1 de polimorfismo: ");
		
		// Paso 1) Apuntar con una variable de la superclase => animal3 a otra de la subclase => ave1
		Animal animal3 = ave1;
		
		/* Paso 2) Con esta variable animal3 llamar a los métodos que estén 
		 *         tanto en la subclase como en la superclase */
		System.out.println (animal3.toString() );
		animal3.mover();
		
		/* Con una variable de la superclase que apunta a una subclase, 
		 * no puedes llamar a métodos que estén en la subclase pero no en la superclase
		 * Por ejemplo: prueba a descomentar la siguiente línea de código y verás que sucede: */
		
		// System.out.println ("Color del plumaje: " + animal3.get_color_plumaje());
		
		// Para conseguir que una variable de la superclase llame a métodos solo de la superclase
		// hay que hacerlo mediante la conversión descendente: 		
		Ave ave_prueba = (Ave) animal3;
		System.out.println ("\n Color del plumaje: " + ave_prueba.get_color_plumaje());
		
		
		// Ejemplo 2 Polimorfismo
		System.out.println ("\n Ejemplo 2 de polimorfismo, vector de objetos: ");
		
		// Se va a crear un vector de objetos Animal
		// pero esto objetos de la superclase Animal van a apuntar a objetos de esta superclase
		// o a las de sus subclases: Pez y Ave
		// Ya tenemos variables de la superclase que apuntan a objetos de la subclase
		// v[2] => apunta a pez1 (objeto de la subclase Pez)
		// v[3] => apunta a ave1 (objeto de la subclase Ave)
		Animal [] v = {pez1, pez2, ave1, ave2};
		
		
		// POLIMORFISMO => mediante variables de la superclase que apuntan a objetos de la subclase,
		//                 se pueden llamar a métodos que estén tanto en la superclase como en la subclase,
		//                 por ejemplo toString() y mover()
		for (int i=0; i<v.length; i++) {
			System.out.println (v[i].toString() ); // no hace falta poner .toString()
			v[i].mover();
		}
		
		
		// Ejemplo 3: Polimorfismo, conversión descendente y Operador instanceof
		System.out.println ("\n Ejemplo 3 de polimorfismo => operador instanceof ");
		
		// Pero y si quiero recorrer todo el vector y usar métodos específicos de una subclase
		// tengo que hacer la conversión descendente, pero antes necesito saber de que clase 
		// es el elemento del vector que estoy accediendo mediante el Operador instanceof
		
		// for mejorado para recorrer el vector
		for (Animal elemento: v) {			
			
			// comprobar si el elemento del vector es de la clase Ave
			if (elemento instanceof Ave) { // no hace falta poner == true
			
				// conversión descendente
				Ave aux_ave = (Ave) elemento; 
				
				// Cambiar el color del plumaje a verde
				aux_ave.set_color_plumaje ("verde");				
			}
			
			// Llamada al método toString()
			System.out.println (elemento);
		}				
		
	}
}

