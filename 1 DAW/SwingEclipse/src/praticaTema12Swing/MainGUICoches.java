package praticaTema12Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimeZone;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class MainGUICoches extends JFrame {

	private static JPanel contentPane;
	private static JTextField tfMatricula;
	private static JTextField tfMarca;
	private static JTextField tfModelo;
	private static JTextField tfColor;
	private static JTextField tfAno;
	private static JTextField tfPrecio;
	private static JLabel lblConexion;
	private static JLabel label;
	
	private static Connection con;
	private static ResultSet rs;
	private static String server;
	private static String port;
	private static String database;
	private static String user;
	private static String password;
	private static int posicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame.setDefaultLookAndFeelDecorated(true);
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					MainGUICoches frame = new MainGUICoches();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainGUICoches() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainGUICoches.class.getResource("/praticaTema12Swing/car.png")));
		setResizable(false);
		setTitle("Coches en stock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 464);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula:");
		lblMatricula.setBounds(78, 65, 116, 14);
		contentPane.add(lblMatricula);
		
		tfMatricula = new JTextField();
		tfMatricula.setBounds(244, 62, 128, 30);
		contentPane.add(tfMatricula);
		tfMatricula.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(78, 100, 116, 14);
		contentPane.add(lblMarca);
		
		tfMarca = new JTextField();
		tfMarca.setColumns(10);
		tfMarca.setBounds(244, 97, 128, 30);
		contentPane.add(tfMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(78, 140, 116, 14);
		contentPane.add(lblModelo);
		
		tfModelo = new JTextField();
		tfModelo.setColumns(10);
		tfModelo.setBounds(244, 132, 128, 30);
		contentPane.add(tfModelo);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(78, 176, 116, 14);
		contentPane.add(lblColor);
		
		tfColor = new JTextField();
		tfColor.setColumns(10);
		tfColor.setBounds(244, 167, 128, 30);
		contentPane.add(tfColor);
		
		JLabel lblAno = new JLabel("A\u00F1o:");
		lblAno.setBounds(78, 210, 116, 14);
		contentPane.add(lblAno);
		
		tfAno = new JTextField();
		tfAno.setColumns(10);
		tfAno.setBounds(244, 202, 128, 30);
		contentPane.add(tfAno);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(78, 248, 116, 14);
		contentPane.add(lblPrecio);
		
		tfPrecio = new JTextField();
		tfPrecio.setColumns(10);
		tfPrecio.setBounds(244, 237, 128, 30);
		contentPane.add(tfPrecio);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setIcon(new ImageIcon(MainGUICoches.class.getResource("/praticaTema12Swing/anterior.png")));
		btnAnterior.setBounds(67, 288, 127, 30);
		contentPane.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setIcon(new ImageIcon(MainGUICoches.class.getResource("/praticaTema12Swing/proximo.png")));
		btnSiguiente.setBounds(245, 288, 127, 30);
		contentPane.add(btnSiguiente);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setIcon(new ImageIcon(MainGUICoches.class.getResource("/praticaTema12Swing/guardar.png")));
		btnInsertar.setBounds(67, 324, 305, 30);
		contentPane.add(btnInsertar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setIcon(new ImageIcon(MainGUICoches.class.getResource("/praticaTema12Swing/basura.png")));
		btnBorrar.setBounds(67, 362, 305, 30);
		contentPane.add(btnBorrar);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setIcon(new ImageIcon(MainGUICoches.class.getResource("/praticaTema12Swing/descarga.png")));
		btnCargar.setBounds(30, 11, 105, 30);
		contentPane.add(btnCargar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(MainGUICoches.class.getResource("/praticaTema12Swing/archivoblanco.png")));
		btnLimpiar.setBounds(154, 11, 105, 30);
		contentPane.add(btnLimpiar);
		
		lblConexion = new JLabel("Conexi\u00F3n: ");
		lblConexion.setBounds(10, 405, 452, 14);
		contentPane.add(lblConexion);
		
		label = new JLabel("0");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(325, 17, 47, 18);
		contentPane.add(label);
		
		JLabel lblNCoches = new JLabel("N\u00BA Coches:");
		lblNCoches.setBounds(287, 20, 71, 14);
		contentPane.add(lblNCoches);
		
		server = "localhost";
		port = "3306";
		database = "Concesionario";
		user = "root";
		password = "root";
		
		posicion = -1;//Posicion del cursor de coches
		
		conectar(); //Conexion inicial
		
		actualizarContador();
		siguiente();
		
		//ACTION LISTENER
		ActionListener anterior = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				anterior();
			}
		};
		
		ActionListener siguiente = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				siguiente();
			}
		};
		
		ActionListener insertar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertar();
				actualizarContador();
			}
		};
		
		ActionListener borrar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String matricula = tfMatricula.getText();
				int opcion = JOptionPane.showConfirmDialog(contentPane, "Seguro que quieres eliminar\nel vehÌculo con matrÌcula "+matricula+"?", "Seguro?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
				if(opcion == JOptionPane.OK_OPTION) {
					siguiente();
					borrar(matricula);
					actualizarContador();
				}
			}
		};
		
		ActionListener limpiar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		};
		
		ActionListener cargar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cargarFichero();
				actualizarContador();
			}
		};
		
		btnAnterior.addActionListener(anterior);
		btnSiguiente.addActionListener(siguiente);
		btnInsertar.addActionListener(insertar);
		btnBorrar.addActionListener(borrar);
		btnLimpiar.addActionListener(limpiar);
		btnCargar.addActionListener(cargar);
	}
	
	
	public static void conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String horaLocal = TimeZone.getDefault().getID();
			con = DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+database+"?serverTimezone=" + horaLocal, user, password);
			lblConexion.setText("Conexion establecida con localhost:3306; Database: Concesionario");
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
				e.printStackTrace();
			}
		}
	}
	
	private static void anterior() {
		posicion--;
		if(posicion < 0 ) {
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
	
	private static void insertar() {
		String matricula = tfMatricula.getText().toUpperCase();
		String marca = tfMarca.getText();
		String modelo = tfModelo.getText();
		String color = tfColor.getText();
		int ano = Integer.parseInt(tfAno.getText());
		int precio = Integer.parseInt(tfPrecio.getText());
		String query = "INSERT INTO COCHES VALUES('"+matricula+"','"+marca+"','"+modelo+"','"+color+"',"+ano+","+precio+")";
		ejecutar(query);
	}
	
	private static void borrar(String matricula) {
		String query = "DELETE FROM Coches WHERE matricula = '"+matricula+"'";
		int nBorrados = ejecutar(query);
		if(nBorrados == 0) {
			JOptionPane.showMessageDialog(contentPane, "No se ha encontrado la matricula "+matricula+" en la base de datos", "No encontrado", JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(contentPane, "Se ha eliminado el registro para la matricula "+matricula, "Borrado exitoso", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private static void limpiarCampos() {
		tfMatricula.setText("");
		tfMarca.setText("");
		tfModelo.setText("");
		tfColor.setText("");
		tfAno.setText("");
		tfPrecio.setText("");
	}
	
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
				int contadorError = 0;
				while (sc.hasNextLine()) {
					linea = sc.nextLine().trim(); //Trim elimina espacios en blanco antes y despues del texto
					if(linea.isEmpty()) continue; //Linea vacÌa
					tokens = linea.split("[ ]+"); //Split parte por donde haya uno o mas espacios consecutivos
					if(tokens.length != 6) continue; //Faltan datos
					try {
						String matricula = tokens[0].toUpperCase();
						String marca = tokens[1];
						String modelo = tokens[2];
						String color = tokens[3];
						int ano = Integer.parseInt(tokens[4]);
						int precio = Integer.parseInt(tokens[5]);
						query = "INSERT INTO COCHES VALUES('"+matricula+"', '"+marca+"', '"+modelo+"', '"+color+"', "+ano+", "+precio+")";
						int x = ejecutar(query); //Se le suma al contador el numero de filas insertadas (1 Û 0 normalmente, Û -1 si duplicado)
						if(x == -1) {
							contadorError++;
						}else {
							contador += x;
						}
					}catch (InputMismatchException e) {
						contadorError++;
					}
				}
				sc.close();
				if(contadorError != 0) {
					JOptionPane.showMessageDialog(contentPane, "Se han cargado un total de "+contador+" lineas de datos\nExisten "+contadorError+" con errores", "Fichero cargado", JOptionPane.WARNING_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(contentPane, "Se han cargado un total de "+contador+" lineas de datos", "Fichero cargado", JOptionPane.INFORMATION_MESSAGE);
				}
				
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(contentPane, "Error de archivo de entrada", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
	
	public static void actualizarContador() {
		int n = getNumeroCoches();
		label.setText(n+"");
	}
	
	public static void printCoches() {
		if(rs != null) {
			try {
				while (rs.next()) {
					tfMatricula.setText(rs.getString(1));
					tfMarca.setText(rs.getString(2));
					tfModelo.setText(rs.getString(3));
					tfColor.setText(rs.getString(4));
					tfAno.setText(rs.getInt(5)+"");
					tfPrecio.setText(rs.getInt(6)+"");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static int ejecutar(String query) {
		rs = null;
		try {
			Statement st = con.createStatement();
			if(st.execute(query)) {
				rs = st.getResultSet();
			}else {
				return st.getUpdateCount(); // 0---> x
			}
		} catch (SQLException e) {
			if(e.getMessage().contains("Duplicate entry")) {
//				JOptionPane.showMessageDialog(contentPane, "Error, esa matrÌcula ya est· incluida en la base de datos", "MatrÌcula duplicada", JOptionPane.ERROR_MESSAGE);
				return -1;
			}else {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	public static int getNumeroCoches() {
		try {
			CallableStatement cs = con.prepareCall("{CALL numCoches(?)}");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			return cs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
