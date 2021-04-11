package almacenEntornosDeDesarrollo;

public abstract class ClientesParticulares extends Cliente{
	
	protected double descuento;

	public ClientesParticulares(int codigo, String nombre, String telefono, String direccion, double descuento) {
		
		super(codigo, nombre, telefono, direccion);
		
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "ClientesParticulares [descuento=" + descuento + "]";
	}

	

}
