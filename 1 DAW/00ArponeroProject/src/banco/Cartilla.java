package banco;

public class Cartilla {

	private double saldo;
	private Cliente titular1;
	private Cliente titular2;
	private Cliente titular3;
	
	public Cartilla(double saldo, Cliente titular1, Cliente titular2, Cliente titular3) {
		this.saldo = saldo;
		this.titular1 = titular1;
		this.titular2 = titular2;
		this.titular3 = titular3;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular1() {
		return titular1;
	}

	public void setTitular1(Cliente titular1) {
		this.titular1 = titular1;
	}

	public Cliente getTitular2() {
		return titular2;
	}

	public void setTitular2(Cliente titular2) {
		this.titular2 = titular2;
	}

	public Cliente getTitular3() {
		return titular3;
	}

	public void setTitular3(Cliente titular3) {
		this.titular3 = titular3;
	}

	@Override
	public String toString() {
		return "Cartilla [saldo=" + saldo + ", titular1=" + titular1 + ", titular2=" + titular2 + ", titular3="
				+ titular3 + "]";
	}
	
	public void ingreso(double dinero) {
		//TODO
	}
	
	public boolean reintegro(double dinero) {
		//TODO
		return false;
	}
	
}
