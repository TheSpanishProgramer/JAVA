package comercialEntornosDeDesarrollo;

import java.util.Date;

public class Director extends Empleado{
	
	
	private String categoria;
	private Date fechaAltaDirector;
	
	public Director(int codigo, String nombre, String telefono, Date fechaNacimiento, Date fechaAltaEmpresa, double salario, Empresa empresa, double comision, String categoria, Date fechaAltaDirector) {
		
		super(codigo, nombre, telefono, fechaNacimiento, fechaAltaEmpresa, salario, empresa, comision);
		
		this.categoria = categoria;
		this.fechaAltaDirector = fechaAltaDirector;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getFechaAltaDirector() {
		return fechaAltaDirector;
	}

	public void setFechaAltaDirector(Date fechaAltaDirector) {
		this.fechaAltaDirector = fechaAltaDirector;
	}

	public String toString() {
		return "Director [categoria=" + categoria + ", fechaAltaDirector=" + fechaAltaDirector + "]";
	}
	
	

}
