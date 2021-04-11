package almacenEntornosDeDesarrollo;

public abstract class Cliente {
	
	protected int codigo;
	protected String nombre;
	protected String telefono;
	protected String direccion;
	
	public Cliente(int codigo, String nombre, String telefono, String direccion) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion="
				+ direccion + "]";
	}
	
	

}
