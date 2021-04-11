package eventosFocoVentana;

import java.awt.event.*;

import javax.swing.*;

public class VentanaEventosFocoVentana extends JFrame implements WindowFocusListener{
	private VentanaEventosFocoVentana marco1;
	private VentanaEventosFocoVentana marco2;
	public static void main(String[] args){
		VentanaEventosFocoVentana miVentana = new VentanaEventosFocoVentana();
		miVentana.iniciar();	
	}
	public void iniciar(){
		marco1=new VentanaEventosFocoVentana();
		marco2=new VentanaEventosFocoVentana();
		marco1.setVisible(true);
		marco2.setVisible(true);
		marco1.setBounds(50, 100, 600, 350);
		marco2.setBounds(700, 100, 600, 350);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ponemos los marcos a la escucha y le pasamos como evento a él mismo
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);	
	}
	public void windowGainedFocus(WindowEvent e) {
		//cual de las dos ventanas es la que tiene el foco
		if(e.getSource()==marco1){
			marco1.setTitle("Tengo el foco!");
		}else {
			marco2.setTitle("Tengo el foco!");
		}
	}
	public void windowLostFocus(WindowEvent e) {
		if(e.getSource()==marco1){
			marco1.setTitle("");
		}else {
			marco2.setTitle("");
		}
	}
	
}
