package puntuacionesJuegos;

public class Ajedrez extends Juego{
	
	private int elo_torneos;
	private int elo_amistosos;
	
	public Ajedrez(String descripcion, Jugador jugon, int elo_torneos, int elo_amistosos) {
		super(descripcion, jugon);
		
		this.elo_amistosos = elo_amistosos;
		this.elo_torneos = elo_torneos;
		
	}

	public int getElo_torneos() {
		return this.elo_torneos;
	}

	public void setElo_torneos(int elo_torneos) {
		this.elo_torneos = elo_torneos;
	}

	public int getElo_amistosos() {
		return this.elo_amistosos;
	}

	public void setElo_amistosos(int elo_amistosos) {
		this.elo_amistosos = elo_amistosos;
	}
	
	public double puntuacion() {
		//TODO
		
		return getElo_torneos();
	}

	@Override
	public String toString() {
		//TODO
		return super.toString() + " Ajedrez{elo_torneos=" + elo_torneos + ", elo_amistosos=" + elo_amistosos + "}";
	}
	
}
