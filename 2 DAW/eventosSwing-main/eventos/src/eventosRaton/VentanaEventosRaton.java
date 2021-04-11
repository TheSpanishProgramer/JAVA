package eventosRaton;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public class VentanaEventosRaton extends JFrame implements MouseListener{
	public VentanaEventosRaton(){
		this.setTitle("Ventana Respondiendo a eventos raton");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500,10,500,350);
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho un clic: ");
		System.out.println("Coordena X: "+e.getX()+" Coordenada Y: "+e.getY());
		System.out.println("Numero de clics: " +e.getClickCount());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}