package almacenEntornosDeDesarrollo;

import java.util.Date;

public class Facturas extends Cliente{
	
	private int numero;
	private Date fecha;
	
	public Facturas(int codigo, String nombre, String telefono, String direccion, int numero, Date fecha) {
		
		super(codigo, nombre, telefono, direccion);
		
		this.numero = numero;
		this.fecha = fecha;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String toString() {
		return "Facturas [numero=" + numero + ", fecha=" + fecha + "]";
	}
	
	

}
