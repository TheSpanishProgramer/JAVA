package banco;

import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Persona{

	private Date fechaAlta;
	private ArrayList<Cartilla> cartillas;
	
	public Cliente(String nombre, Date fechaNacimiento, Date fechaAlta) {
		super(nombre, fechaNacimiento);
		this.fechaAlta = fechaAlta;
		this.cartillas = new ArrayList<Cartilla>();
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public ArrayList<Cartilla> getCartillas() {
		return cartillas;
	}

	public void setCartillas(ArrayList<Cartilla> cartillas) {
		this.cartillas = cartillas;
	}

	@Override
	public String toString() {
		return "Cliente [fechaAlta=" + fechaAlta + ", cartillas=" + cartillas + "]";
	}
	
	
}
