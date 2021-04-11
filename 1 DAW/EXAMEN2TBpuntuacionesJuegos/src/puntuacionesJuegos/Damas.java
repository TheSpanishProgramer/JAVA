package puntuacionesJuegos;

public class Damas extends Juego{
	
	private int puntos_equipos;
	private int puntos_individual;
	
	public Damas(String descripcion, Jugador jugon, int puntos_equipos, int puntos_individual) {
		super(descripcion, jugon);
		this.puntos_equipos = puntos_equipos;
		this.puntos_individual = puntos_individual;
	}

	public int getPuntos_equipos() {
		return this.puntos_equipos;
	}

	public void setPuntos_equipos(int puntos_equipos) {
		this.puntos_equipos = puntos_equipos;
	}

	public int getPuntos_individual() {
		return this.puntos_individual;
	}

	public void setPuntos_individual(int puntos_individual) {
		this.puntos_individual = puntos_individual;
	}
	
	public double puntuacion() {
		return (puntos_equipos*0.4)+(puntos_individual*0.6);
	}

	@Override
	public String toString() {
		return super.toString() + " Damas puntos por equipos =" + puntos_equipos + ", Damas puntos individuales=" + puntos_individual;
	}
	
}