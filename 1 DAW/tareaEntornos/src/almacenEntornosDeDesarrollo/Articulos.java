package almacenEntornosDeDesarrollo;

public class Articulos {
	
	private int codigo;
	private String denominacion;
	private int stock;
	public Articulos(int codigo, String denominacion, int stock) {
		
		this.codigo = codigo;
		this.denominacion = denominacion;
		this.stock = stock;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String toString() {
		return "Articulos [codigo=" + codigo + ", denominacion=" + denominacion + ", stock=" + stock + "]";
	}
	
	

}
