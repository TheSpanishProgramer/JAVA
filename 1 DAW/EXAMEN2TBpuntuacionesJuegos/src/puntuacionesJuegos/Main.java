package puntuacionesJuegos;

public class Main {

	public static void main(String[] args) {
		Jugador j1 = new Jugador("Hikaru", "Nakamura", 12345678);
		Jugador j2 = new Jugador("Magnus", "Carlsen", 87654321);
		Jugador j3 = new Jugador("Fabiano", "Caruana", 33345678);
		Jugador j4 = new Jugador("Viswanathan", "Anand", 11145678);
		
		Damas d1 = new Damas("Campeonato Damas USA", j1, 2800, 3000);
		Damas d2 = new Damas("Campeonato Damas Mundial", j2, 2900, 3200);
		Damas d3 = new Damas("Campeonato Damas Sevilla", j3, 2850, 3100);
		Damas d4 = new Damas("Campeonato Damas India", j4, 2750, 2900);
		
		Ajedrez a1 = new Ajedrez("Campeonato Ajedrez USA", j1, 2750, 3100);
		Ajedrez a2 = new Ajedrez("Campeonato Ajedrez AlmerÌa", j2, 2850, 3200);
		Ajedrez a3 = new Ajedrez("Campeonato Ajedrez Sevilla", j3, 2800, 3000);
		Ajedrez a4 = new Ajedrez("Campeonato Ajedrez India", j4, 2710, 2800);

		Juego[] v = {d1,d2,d3,d4,a1,a2,a3,a4};
		
		System.out.println("Datos de todos los juegos: ");
		mostrar(v);
		System.out.println();
		System.out.println("Datos de todos los juegos sin ordenar: ");
		mostrar_puntuacion(v);
		System.out.println();
		System.out.println("Datos de todos los juegos ordenados por la puntuaciÛn: ");
		shell_asc(v);
		System.out.println();
		System.out.println("La media aritmÈtica de puntuaciÛn en ajedrez es: "+media_ajedrez(v));
		System.out.println();
		System.out.println("PuntuaciÛn en las Damas:");
		mostrar_puntos_damas(v);
		
	}
	
	// E: vector de Juegos
	// S: muestran todos los datos de los juegos del vector con toString()
	public static void mostrar(Juego v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].toString());
		}
	}
	
	// E: vector de Juegos
	// S: muestran el nombre y los apellidos de cada jugador que participa en cada Juego
	// ,la descripciÛn de ese Juego
	// y adem·s muestra la puntuaciÛn obtenida => llama al mÈtodo: puntuacion()
	public static void mostrar_puntuacion(Juego v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].getJugon().getNombre() + " " +v[i].getJugon().getApellidos() + " en el juego "+ v[i].getDescripcion()+ " tiene de puntuaciÛn = "+v[i].puntuacion());
		}
	}
	
	// E: vector de Juegos
	// S: Ordena el vector de juegos ascendentemente
	// por la puntuaciÛn del jugador de cada juego => puntuacion()
	// por el mÈtodo de ordenaciÛn Shell
	public static void shell_asc(Juego v[]) {
		int salto, i;
		Juego aux;
		boolean cambios;
		for (salto = v.length / 2; salto != 0; salto /= 2) {
			cambios = true;
			while (cambios) {
				cambios = false;
				for (i = salto; i < v.length; i++) {
					if (v[i - salto].puntuacion() > v[i].puntuacion()) {
						aux = v[i];
						v[i] = v[i - salto];
						v[i - salto] = aux;
						cambios = true;
					}
				}
			}
		}
		mostrar_puntuacion(v);
	}
	
	// E: vector de Juegos
	// S: devuelve la media aritmÈtica de puntuacion()
	// de todos los juegos que son de Ajedrez
	public static double media_ajedrez(Juego v[]) {
		int contador = 0;
		double suma = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] instanceof Ajedrez) {
				contador++;
				suma += v[i].puntuacion();
			}
		}
		
		return suma/contador;
	}
	
	// E: vector de Juegos
	// S: muestra por pantalla los puntos por equipos y puntos individuales
	// en el juego de damas y el nombre y apellidos de ese jugador de damas
	// pista: realizar conversiÛn descendente para saber los puntos por equipos e
	//individual
	public static void mostrar_puntos_damas(Juego v[]) {
		for (int i = 0; i < v.length; i++) {
			if(v[i] instanceof Damas) {
				Damas d = (Damas) v[i];
				System.out.println(d.getJugon().getNombre() + " " +d.getJugon().getApellidos() + " Puntos por equipos = "+ d.getPuntos_equipos()+ " Puntos individual = "+d.getPuntos_individual());
			}
		}
	}
	
}
