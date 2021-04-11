package empresadeseguridad;

public class Copias extends Producto_seguridad{

	public boolean copia_nube;
	
	public Copias(boolean copia_nube, String descripcion, Cliente comprador, int numero_equipos) {
		super(descripcion, comprador, numero_equipos);
		this.copia_nube = copia_nube;
	}

	public boolean isCopia_nube() {
		return copia_nube;
	}

	public void setCopia_nube(boolean copia_nube) {
		this.copia_nube = copia_nube;
	}

	@Override
	public double precio() {
		return 4.35 * getNumero_equipos() + (copia_nube ? 2 * getNumero_equipos() : 0);
	}

	@Override
	public String toString() {
		return "Copias_seguridad"+super.toString()+"copia_nube=" + copia_nube + "}";
	}
	
	
	
	
}

