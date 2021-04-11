package eventosRaton;
import java.awt.event.*;
import javax.swing.JFrame;

public class VentanaEventosRatonAdaptadora extends JFrame{
	public VentanaEventosRatonAdaptadora(){
		this.setTitle("Ventana Respondiendo a eventos raton");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(10,10,500,350);
		this.addMouseListener(new EventosDeRaton());
	}
}
//1º paso. clase oyente 
class EventosDeRaton extends MouseAdapter{
	public void mouseClicked(MouseEvent e){
		System.out.println("Has hecho click");
		System.out.println("Coordenada x: "+e.getX()+" Coordenada Y: "+e.getY());
		System.out.println("Numero de clicks: "+e.getClickCount());	
	}
}
