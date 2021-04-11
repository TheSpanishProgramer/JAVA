package comercialEntornosDeDesarrollo;

import java.util.Date;

public class Cliente extends datosPersonales{
	
	private Empresa empresa;

	public Cliente(int codigo, String nombre, String telefono, Date fechaNacimiento) {
		super(codigo, nombre, telefono, fechaNacimiento);
		
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	
	public String toString() {
		return "Cliente [empresa=" + empresa + "]";
	}
	
	

}
