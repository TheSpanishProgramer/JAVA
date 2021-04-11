package empresadeseguridad;

public class Antivirus extends Producto_seguridad{

	private boolean antiespias;
	
	public Antivirus(boolean antiespias, String descripcion, Cliente comprador, int numero_equipos) {
		super(descripcion, comprador, numero_equipos);
		this.antiespias = antiespias;
	}

	public boolean isAntiespias() {
		return antiespias;
	}

	public void setAntiespias(boolean antiespias) {
		this.antiespias = antiespias;
	}

	@Override
	public double precio() {
		return 10.25 * getNumero_equipos() + (antiespias? 100 : 0);
	}

	@Override
	public String toString() {
		return "Antivirus"+super.toString()+"antiespias=" + antiespias + "}";
	}
	
	
	
	
}
