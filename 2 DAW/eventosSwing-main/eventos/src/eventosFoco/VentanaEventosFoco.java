package eventosFoco;

import java.awt.event.*;
import javax.swing.*;

public class VentanaEventosFoco extends JFrame {
	public VentanaEventosFoco() {
		this.setTitle("Ventana Respondiendo FocusEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 300, 500, 350);
		this.add(new Panel());
	}
}