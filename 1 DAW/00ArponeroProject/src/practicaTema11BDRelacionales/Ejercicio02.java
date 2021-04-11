package practicaTema11BDRelacionales;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimeZone;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class Ejercicio02.
 */
public class Ejercicio02 {
	
	/** The con. */
	private static Connection con;
	
	/** The rs. */
	private static ResultSet rs;
	
	/** The server. */
	//Parámetros conexión
	private static String server;
	
	/** The port. */
	private static String port;
	
	/** The database. */
	private static String database;
	
	/** The user. */
	private static String user;
	
	/** The password. */
	private static String password;
	
	/** The posicion. */
	private static int posicion;
	
	/** The opciones. */
	private static String[] opciones = {"Anterior", "Siguiente", "Insertar", "Borrar", "Cargar fichero", "Mostrar número de coches", "Salir"};
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		server = "localhost";
		port = "3306";
		database = "Concesionario";
		user = "root";
		password = "root";
		
		posicion = -1; //Posición del cursor de coches
		
		conectar(); // Conexión inicial
		siguiente(); // Imprime inicialmente el primer coche de la base de datos
		do {
			menu();
			int opcion = elegirOpcionMenu();
			ejecutarOpcion(opcion);
		} while (true);
		
	}
	
	/**
	 * Ejecutar opcion.
	 *
	 * @param opcion the opcion
	 */
	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			anterior();
			break;
		case 2:
			siguiente();
			break;
		case 3:
			insertar();
			break;
		case 4:
			borrar();
			break;
		case 5:
			cargarFichero();
			break;
		case 6:
			mostrarNumeroCoches();
			break;

		default:
			desconectar();
			System.out.println("Finalizado");
			System.exit(0);
		}
	}

	/**
	 * Mostrar numero coches.
	 */
	private static void mostrarNumeroCoches() {
		System.out.println("Existen "+getNumeroCoches()+" en la base de datos");
	}

	/**
	 * Cargar fichero.
	 */
	private static void cargarFichero() {
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		jfc.setDialogTitle("Seleccione un fichero de coches");
		jfc.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de texto", "txt");
		jfc.addChoosableFileFilter(filter);

		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File f = jfc.getSelectedFile();
			try {
				Scanner sc = new Scanner(f);
				String linea = null;
				String[] tokens = null;
				String query = null;
				int contador = 0;
				while (sc.hasNextLine()) {
					linea = sc.nextLine().trim(); //Trim elimina espacios en blanco antes y después del texto
					if (linea.isEmpty()) continue;
					tokens = linea.split("[ ]+"); //Split parte por donde haya uno o más espacios consecutivos
					if(tokens.length != 6) continue; //Faltan datos
					try {
						String matricula = tokens[0].toUpperCase(); //Forzar a que la matrícula esté en mayúscula
						String marca = tokens[1];
						String modelo = tokens[2];
						String color = tokens[3];
						int ano = Integer.parseInt(tokens[4]);
						int precio = Integer.parseInt(tokens[5]);
						query = "INSERT INTO COCHES VALUES('"+matricula+"', '"+marca+"', '"+modelo+"', '"+color+"', "+ano+", "+precio+")";
						contador += ejecutar(query); //Se le suma al contador el número de filas insertadas (1 ó 0 normalmente)
					}catch (InputMismatchException e) {
						System.out.println("Línea de datos errónea. No se incluirá en la base de datos");
					}
				}
				sc.close();
				System.out.println("Se han cargado un total de "+contador+" líneas de datos");
			} catch (FileNotFoundException e) {
				System.out.println("Error de archivo de entrada"); // Difícilmente ocurrirá
			}
		}
	}

	/**
	 * Borrar.
	 */
	private static void borrar() {
		String matricula = utilidades.teclado.leer_cadena2("Introduzca la matrícula a borrar: ").toUpperCase();
		String query = "DELETE FROM Coches WHERE matricula = '"+matricula+"'";
		int nBorrados = ejecutar(query);
		if (nBorrados == 0) {
			System.out.println("No se ha encontrado la matrícula " + matricula + " en la base de datos");
		}else {
			System.out.println("Se ha eliminado el registro para la matrícula "+matricula);
		}
	}

	/**
	 * Insertar.
	 */
	private static void insertar() {
		String matricula = utilidades.teclado.leer_cadena2("Introduzca la matrícula: ").toUpperCase();
		String marca = utilidades.teclado.leer_cadena2("Introduzca la marca: ");
		String modelo = utilidades.teclado.leer_cadena2("Introduzca el modelo: ");
		String color = utilidades.teclado.leer_cadena2("Introduzca el color: ");
		int ano = utilidades.teclado.leer_entero("Introduzca el año: ", 1900, 2050);
		int precio = utilidades.teclado.leer_entero("Introduzca el precio: ", 0, Integer.MAX_VALUE);
		String query = "INSERT INTO COCHES VALUES('"+matricula+"', '"+marca+"', '"+modelo+"', '"+color+"',"+ano+","+precio+")";
		ejecutar(query);
	}

	/**
	 * Anterior.
	 */
	private static void anterior() {
		posicion--;
		if(posicion < 0) {
			posicion = getNumeroCoches()-1;
		}
		ejecutar("SELECT * FROM Coches LIMIT "+posicion+", 1");
		printCoches();
		
	}

	/**
	 * Siguiente.
	 */
	private static void siguiente() {
		posicion++;
		posicion = posicion % getNumeroCoches();
		ejecutar("SELECT * FROM Coches LIMIT "+posicion+", 1");
		printCoches();
	}

	/**
	 * Elegir opcion menu.
	 *
	 * @return the int
	 */
	private static int elegirOpcionMenu() {
		return utilidades.teclado.leer_entero("Lee opción (1.."+opciones.length+"): ", 1, opciones.length);
	}

	/**
	 * Menu.
	 */
	private static void menu() {
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i+1)+".\t"+opciones[i]);
		}
	}

	/**
	 * Conectar.
	 */
	public static void conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String horaLocal = TimeZone.getDefault().getID();
			con = DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+database+"?serverTimezone=" + horaLocal, user, password);
			System.out.println("\nConexión establecida!!\n");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
	
	/**
	 * Desconectar.
	 */
	public static void desconectar() {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Ejecutar.
	 *
	 * @param query the query
	 * @return the int
	 */
	public static int ejecutar(String query) {
		rs = null;
		try {
			Statement st = con.createStatement();
			if (st.execute(query)) {
				rs = st.getResultSet();
			}else {
				return st.getUpdateCount(); // 0 -- > x
			}
		}catch (SQLException e) {
			if(e.getMessage().contains("Duplicate entry")) {
				System.out.println("ERROR: esa matrícula ya está incluída en la base de datos");
			}else {
			e.printStackTrace();
			}
		}
		return 0;
	}
	
	
	/**
	 * Prints the coches.
	 */
	public static void printCoches() {
		if(rs != null) {
			try {
				while (rs.next()) {
					System.out.printf("%-10s %-10s\n", "Matricula:", rs.getString(1));
					System.out.printf("%-10s %-10s\n", "Marca:", rs.getString(2));
					System.out.printf("%-10s %-10s\n", "Modelo:", rs.getString(3));
					System.out.printf("%-10s %-10s\n", "Color:", rs.getString(4));
					System.out.printf("%-10s %-10d\n", "Año:", rs.getInt(5));
					System.out.printf("%-10s %-10d\n", "Precio:", rs.getInt(6));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Gets the numero coches.
	 *
	 * @return the numero coches
	 */
	public static int getNumeroCoches() {
		ejecutar("SELECT COUNT(*) FROM COCHES");
		try {
			if (rs != null && rs.next()) {
				return rs.getInt(1);
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return -1;
		}
	}
