package banco;

public class LibretaAhorro extends Cartilla{
	
	private double interes;
	private int plazo;
	
	public LibretaAhorro(double saldo, Cliente titular1, Cliente titular2, Cliente titular3, double interes, int plazo) {
		super(saldo, titular1, titular2, titular3);
		this.interes = interes;
		this.plazo = plazo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	@Override
	public String toString() {
		return "LibretaAhorro [interes=" + interes + ", plazo=" + plazo + "]";
	}
	
	public double calcularBeneficios() {
		//TODO
		return 0;
	}

}
