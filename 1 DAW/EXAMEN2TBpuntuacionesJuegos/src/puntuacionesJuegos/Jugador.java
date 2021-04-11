package puntuacionesJuegos;

public class Jugador {
	
	private String nombre;
	private String apellidos;
	private int dni;
	
	public Jugador(String nombre, String apellidos, int dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDni() {
		return this.dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		//TODO
		return "Jugador{nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "}";
	}
	
	

}