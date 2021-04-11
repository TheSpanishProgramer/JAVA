package ejemplosPolimorfismoConClasesAbstractas;

public abstract class Animal {
	
	// Clase Abstracta Animal => no puedes crear objetos de esta clase!!
	// Este clase sirve como plantilla para que otras clase que hereden de esta
	// pueden redefinir sus métodos
	
	// atributos
	private String descripcion; // descripción del animal
	private int edad = 0;       // edad 
	
	// constructor 
	/* => aunque hay constructor no se pueden crear objetos de la clase Animal
	 * pero si se puede llamar al constructor de este clase desde las clases concretas 
	 * que heredan de esta superclase abstracta */
	public Animal (String des, int edad) {
		descripcion = des;
		this.edad = edad;
	}	
	
	// método abstracto que será sobrescrito por las subclases 
	// Muestra por pantalla como se mueve el animal
	public abstract void mover (); // OJO!! aquí no hay implementación
	
	public String toString () {
		return "\n Descripción: " + descripcion + ", edad = " + edad;
	}
	
	
	
}

