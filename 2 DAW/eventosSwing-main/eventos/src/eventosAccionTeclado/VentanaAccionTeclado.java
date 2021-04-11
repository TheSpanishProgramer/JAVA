package eventosAccionTeclado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.JPanel;

public class VentanaAccionTeclado extends JFrame{
	public VentanaAccionTeclado() {
		this.setTitle("El oyente es: Un objeto de una clase que lo impremente");
		this.setBounds(200,200,600,400);
		PanelAccionTeclado mipanel= new PanelAccionTeclado();
		this.add(mipanel);
	}	
}