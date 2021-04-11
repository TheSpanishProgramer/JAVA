package empresadeseguridad;

public class Cliente {
	
	private String nombre;
	private String apellidos;
	private int dni;
	
	public Cliente(String nombre, String apellidos, int dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente{nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "}";
	}
	
	

}

