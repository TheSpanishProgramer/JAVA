package ejerciciosHerencia;

// Subclase Todoterreno que hereda de la superclase Coche
public class Todoterreno extends Coche {
	// ejercicio 1
		
	// atributo de instancia
	private boolean traccion_4x4;
	// atributo de clase
	private static int num_todoterrenos = 0;
	
	// ejercicio 2 

	// constructor por defecto
	public Todoterreno () {
		num_todoterrenos ++;
	}
	
	// constructor
	// E: todos los valores para los atributos de instancia
	// S: inicializa todos los atributos de instancia e incrementa el número de Todoterrenos en 1
	public Todoterreno (String fabricante2, String matricula2, int anio, String propietario2, 
	               int airbags, boolean climatizador2, int puertas, boolean traccion) {
		// llamada explícita al constructor de la superclase
		super (fabricante2, matricula2, anio, propietario2, airbags, climatizador2, puertas);

		traccion_4x4 = traccion;
		num_todoterrenos ++;
	} 
	
	// ejercicio 3
	
	public boolean get_traccion_4x4 () {
		return traccion_4x4;	
	}
	
	public void put_traccion_4x4 (boolean traccion) {
		traccion_4x4 = traccion;	
	}	
	
	public static int get_num_todoterrenos () {
		return num_todoterrenos;	
	}
	
	public static void put_num_todoterrenos (int num) {
		num_todoterrenos = num;	
	}
	
	// ejercicio 4 => redefinir el método toString() que hereda de la superclase Coche
	
	// E: nada
	// S: devuelve una cadena con todos los atributos del objeto que llama al método
	public String toString () {
		// llamar al método toString() de Vehiculo
		String cad = super.toString();
		
		cad = cad + String.format (", Tracción 4x4: %b, nº todoterrenos: %d", traccion_4x4, num_todoterrenos);
		return cad;  
	} // fin toString
} // fin subclase Todoterreno
