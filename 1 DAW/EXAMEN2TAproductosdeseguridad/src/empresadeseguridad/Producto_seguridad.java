package empresadeseguridad;

public abstract class Producto_seguridad {

	private String descripcion;
	private Cliente comprador;
	private int numero_equipos;
	
	public abstract double precio();
	
	public Producto_seguridad(String descripcion, Cliente comprador, int numero_equipos) {
		this.descripcion = descripcion;
		this.comprador = comprador;
		this.numero_equipos = numero_equipos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public void setComprador(Cliente comprador) {
		this.comprador = comprador;
	}

	public int getNumero_equipos() {
		return numero_equipos;
	}

	public void setNumero_equipos(int numero_equipos) {
		this.numero_equipos = numero_equipos;
	}

	@Override
	public String toString() {
		return "{descripcion=" + descripcion + ", comprador=" + comprador + ", numero_equipos="
				+ numero_equipos + "}";
	}
	
	
	
}