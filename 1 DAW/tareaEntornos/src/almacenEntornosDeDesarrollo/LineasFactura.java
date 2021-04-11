package almacenEntornosDeDesarrollo;

import java.util.Date;

public class LineasFactura extends Facturas{
	
	private Articulos denominacion;
	private int unidades;
	public LineasFactura(int codigo, String nombre, String telefono, String direccion, int numero, Date fecha, Articulos denominacion, int unidades) {
		
		super(codigo, nombre, telefono, direccion, numero, fecha);
		
		this.denominacion = denominacion;
		this.unidades = unidades;
	}
	public Articulos getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(Articulos denominacion) {
		this.denominacion = denominacion;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public String toString() {
		return "LineasFactura [denominacion=" + denominacion + ", unidades=" + unidades + "]";
	}
	
	
	

}
