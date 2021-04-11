package eventosVentana;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class VentanaCambioDeEstadoVentana extends JFrame implements WindowStateListener{
	public VentanaCambioDeEstadoVentana() {
		setTitle("Ventana Respondiendo ante el estado");
		setBounds(300, 300, 500, 350);
		addWindowStateListener(this);
	}
		@Override
		public void windowStateChanged(WindowEvent e) {
			System.out.println("La ventana a cambiado de estado");
			System.out.println("Ventana: "+e.getWindow());
			System.out.println("El antiguo estado es: " +e.getOldState());
			System.out.println("El actual estado es: " +e.getNewState());
		}
}
