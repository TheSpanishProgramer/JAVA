package almacenEntornosDeDesarrollo;

public  class ClientesEmpresa extends Cliente{
	
	private String cif;
	private String razonSocial;
	public ClientesEmpresa(int codigo, String nombre, String telefono, String direccion, String cif, String razonSocial) {
		
		super(codigo, nombre, telefono, direccion);
		
		this.cif = cif;
		this.razonSocial = razonSocial;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	public String toString() {
		return "ClientesEmpresa [cif=" + cif + ", razonSocial=" + razonSocial + "]";
	}
	
	

}
