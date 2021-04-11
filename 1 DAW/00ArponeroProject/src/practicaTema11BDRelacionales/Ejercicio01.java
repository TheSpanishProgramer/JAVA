package practicaTema11BDRelacionales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;


import java.sql.Statement;

public class Ejercicio01 {
	
	private static Connection con;
	private static ResultSet rs;
	
	//Parámetros conexión
	private static String server;
	private static String port;
	private static String database;
	private static String user;
	private static String password;
	private static int posicion;
	private static String[] opciones = {"Anterior", "Siguiente", "Insertar", "Borrar", "Salir"};
	
	public static void main(String[] args) {
		server = "localhost";
		port = "3306";
		database = "Concesionario";
		user = "root";
		password = "root";
		
		posicion = -1; //Posición del cursor de coches
		
		conectar();
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
		default:
			desconectar();
			System.out.println("Finalizado");
			System.exit(0);
		}
	}

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

	private static void anterior() {
		posicion--;
		if(posicion < 0) {
			posicion = getNumeroCoches()-1;
		}
		ejecutar("SELECT * FROM Coches LIMIT "+posicion+", 1");
		printCoches();
		
	}

	private static void siguiente() {
		posicion++;
		posicion = posicion % getNumeroCoches();
		ejecutar("SELECT * FROM Coches LIMIT "+posicion+", 1");
		printCoches();
	}

	private static int elegirOpcionMenu() {
		return utilidades.teclado.leer_entero("Lee opción (1.."+opciones.length+"): ", 1, opciones.length);
	}

	private static void menu() {
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i+1)+".\t"+opciones[i]);
		}
	}

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
		return -1;
	}
	
	
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

