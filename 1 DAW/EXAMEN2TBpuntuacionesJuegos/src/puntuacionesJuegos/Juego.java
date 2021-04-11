package puntuacionesJuegos;

public abstract class Juego {
	
	private String descripcion;
	private Jugador jugon;
	
	public Juego(String descripcion, Jugador jugon) {
		this.descripcion = descripcion;
		this.jugon = jugon;
	}
	
	public abstract double puntuacion();

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Jugador getJugon() {
		return this.jugon;
	}

	public void setJugon(Jugador jugon) {
		this.jugon = jugon;
	}

	@Override
	public String toString() {
		return "Juego{descripcion=" + descripcion + ", jugon=" + jugon + "}";
	}
	
	
	

}
