package empresaEntornosDeDesarrollo;

public abstract class departamento {
	
	public departamento(int codigodep2, String nombredep2, String localidad2) {
		// TODO Apéndice de constructor generado automáticamente
	}
	protected int codigodep;
	protected String nombredep;
	protected String localidad;
	
	
	public int getCodigodep() {
		return codigodep;
	}
	public void setCodigodep(int codigodep) {
		this.codigodep = codigodep;
	}
	public String getNombredep() {
		return nombredep;
	}
	public void setNombredep(String nombredep) {
		this.nombredep = nombredep;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public String toString() {
		return "departamento [codigodep=" + codigodep + ", nombredep=" + nombredep + ", localidad=" + localidad + "]";
	}

}
