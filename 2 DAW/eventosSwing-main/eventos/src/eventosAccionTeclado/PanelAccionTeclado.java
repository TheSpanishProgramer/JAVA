/**
 * @author Isabel Cayuela Pérez
 */
package eventosAccionTeclado;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Isabel Cayuela Pérez
 *
 */
public class PanelAccionTeclado extends JPanel{
	public PanelAccionTeclado() {
//		2º creamos los objetos de la clase Action
		ColorFondo colorAmarillo = new ColorFondo(Color.YELLOW);
		ColorFondo colorAzul = new ColorFondo(Color.BLUE);
		ColorFondo colorRojo = new ColorFondo(Color.RED);
//		3º creamos los botones con el constructor cuyo argumento es un objeto Action
		JButton botonAzul = new JButton(colorAzul);
		JButton botonAmarillo = new JButton(colorAmarillo);
		JButton botonRojo = new JButton(colorRojo);
		botonAzul.setText("AZUL");
		botonAmarillo.setText("AMARILLO");
		botonRojo.setText("ROJO");
//		Opcional
//		realizar un clic sobre el bojeto con la combinación de teclas de ALT + KeyEvent.VK_?
		botonAzul.setMnemonic(KeyEvent.VK_A);
		botonAmarillo.setMnemonic(KeyEvent.VK_M);
		botonRojo.setMnemonic(KeyEvent.VK_R);
//		Opcional
//		mensaje emergente
		botonAzul.setToolTipText("Pone el fondo Azul");
		botonAmarillo.setToolTipText("Pone el fondo Amarillo");
		botonRojo.setToolTipText("Pone el fondo Rojo");

//		Asignación de acciones a teclado distintas de la combinación ALT+Tecla

//		Pasos: B1, B2, B3 Y B4
//		B1 - Crear un mapa de entrada. Le decimos que objeto va a tener el foco 
//		cuando realicemos la combinacion de teclas
		//getInputMap y getActionMap son métodos de JComponets
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
//		B2 - Creamos la combinación de teclas
		KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl A");
		KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl M");
		KeyStroke teclaRojo=KeyStroke.getKeyStroke("ctrl R");
		
//		B3 - Asignamos la combinación de teclas a un "objeto" (solo un nombre que sirve de enlace)
		mapaEntrada.put(teclaAmarillo, "fondoAmarillo");
		mapaEntrada.put(teclaAzul, "fondoAzul");
		mapaEntrada.put(teclaRojo, "fondoRojo");
		
//		B4 - Asignamos el "objeto" a la accion.
		ActionMap mapaAccion=getActionMap();
		mapaAccion.put("fondoAmarillo", colorAmarillo);
		mapaAccion.put("fondoAzul", colorAzul);
		mapaAccion.put("fondoRojo", colorRojo);
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
	}
	
//	1º definimos la clase Action
	private class ColorFondo extends AbstractAction{
		private Color colorFondo;
		public ColorFondo(Color c) {
			colorFondo=c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorFondo);
			
		}
		
	}

}
