package metodos;

public  class HacerMenus {
	
	private static ConstructorObjects [] objetos;// ya tenemos el array de objetos creado
	
	private static int contador; //contador de objetos
	
	private static String[] opciones = {"opcion1", "opcion2", "opcion3", "opcion4", "Salir"};//Creamos un array con las opciones
	
	//con el metodo menu, recorremos el array e imprimimos el menu que hemos creado, ya tiene un formato chulo ni lo toco
	
	private static void menu() {
		
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i+1)+".\t"+opciones[i]);
		
		}
	}
	
	//inicializamos los objetos y variables auxiliares necesarias
	
	private static void inicializar() {
		
		objetos = new ConstructorObjects[100];
		int contador = 0;//INICIALIZAMOS  EL CONTADOR A 0
	}
	
	//siguiente paso es solicitar elegir una opcion del menu, el cual controlamos desde 1 que es la primera opcion hasta opciones.length que es la ultima 
	//posicion del array de opciones que hemos declarado.
	
	private static int elegirOpcionMenu() {
		return utilidades.teclado.leer_entero("Lee opción (1.."+opciones.length+"): ", 1, opciones.length);
	}
	
	//Ahora toca ejecutar esa opcion, coloco los 
	
	private static void ejecutarOpcionMenu(int opcion) {
		
		switch (opcion) {
		case 1:
			crear();//LLAMADA AL METODO 
			break;
		case 2:
			siguiente();//LLAMADA AL METODO 
			break;
		case 3:
			anterior();//LLAMADA AL METODO 
			break;
		case 4:
			cantidad();//LLAMADA AL METODO 
			break;
		case 5:
			visualizar();//LLAMADA AL METODO 
			break;
		case 6:
			modificar();//LLAMADA AL METODO 
			break;
		case 7:
			borrar();//LLAMADA AL METODO 
			break;
		default://SOLO NOS QUEDA LA OPCION 8 LA CUAL INDICA LA OPCION SALIR, SI opcion TIENE ESE VALOR MANDAREMOS AVISO DE SALIDA Y SALDREMOS DEL PROGRAMA
			System.out.println("Fin del programa");
			System.exit(0);//METODO POR EL QUE SALIMOS DEL PROGRAMA
		}
	}

	private static void crear() {
		// TODO Apéndice de método generado automáticamente
		
	}

	private static void siguiente() {
		// TODO Apéndice de método generado automáticamente
		
	}

	private static void anterior() {
		// TODO Apéndice de método generado automáticamente
		
	}

	private static void cantidad() {
		// TODO Apéndice de método generado automáticamente
		
	}

	private static void visualizar() {
		
		int id = utilidades.teclado.leer_entero_error("Introduzca el identificador: ", "Debe introducir un identificador valido", 1, Integer.MAX_VALUE); 
		for (int i = 0; i < contador; i++) {
			if(objetos[i].getparametro1() == id) {
				System.out.println(objetos[i]);
				return;
			}
		}
		System.out.println("No se encuentra el identificador "+id+" en nuestro sistema");
		
		
	}

	private static void modificar() {
		// TODO Apéndice de método generado automáticamente
		
	}

	private static void borrar() {
		// TODO Apéndice de método generado automáticamente
		
	}

}
