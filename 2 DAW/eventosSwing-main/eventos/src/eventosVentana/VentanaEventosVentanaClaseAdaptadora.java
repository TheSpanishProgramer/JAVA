package eventosVentana;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


public class VentanaEventosVentanaClaseAdaptadora extends JFrame{
	public VentanaEventosVentanaClaseAdaptadora(){
		super("Ventana Respondiendo con clase adaptadora");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(300,300,500,350);
		this.addWindowListener(new Oyente());
	}
}
class Oyente extends WindowAdapter{
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
		
	}

	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
		
	}
	
}
	
