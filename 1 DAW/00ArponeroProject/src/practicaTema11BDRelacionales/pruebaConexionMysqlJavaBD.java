package practicaTema11BDRelacionales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
import com.mysql.*;

public class pruebaConexionMysqlJavaBD {
	
	private static String server;
	private static String port;
	private static String database;
	private static String user;
	private static String password;
	
	private static Connection con;

	public static void main(String[] args) {
		server = "localhost";
		port = "3306";
		database = "sakila";
		user = "root";
		password = "root";
		
		conectar();
		
		desconectar();
		
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
				System.out.println("\nConexión Cerrada!!\n");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	
	}

}
