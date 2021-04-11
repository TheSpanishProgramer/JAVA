package eventosVentana;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
//		//primero lo ejecutamos solo con la ventana1
//		VentanaEventosVentana miVentana1 = new VentanaEventosVentana();
//		miVentana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		miVentana1.setTitle("Ventana1");
//		miVentana1.setBounds(50,100,500,350);
//		miVentana1.setVisible(true);
//		
//		VentanaEventosVentana miVentana2 = new VentanaEventosVentana();
//		miVentana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		miVentana2.setTitle("Ventana2");
//		miVentana2.setBounds(500,50,500,350);
//		miVentana2.setVisible(true);
//		
//		//Con clase adaptadora
//		VentanaEventosVentanaClaseAdaptadora miVentanaAdaptadora = new VentanaEventosVentanaClaseAdaptadora();
//		miVentanaAdaptadora.setVisible(true);
		
		//control de estados
		VentanaCambioDeEstadoVentana miVentanaCambio = new VentanaCambioDeEstadoVentana();
		miVentanaCambio.setVisible(true);
	}

}
