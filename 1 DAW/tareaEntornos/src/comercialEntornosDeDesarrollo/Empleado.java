package comercialEntornosDeDesarrollo;

import java.util.Date;

public class Empleado  extends datosPersonales {
	
	private Date fechaAltaEmpresa;
	private double salario;
	private Empresa empresa;
	private double comision;
	
	public Empleado(int codigo, String nombre, String telefono, Date fechaNacimiento, Date fechaAltaEmpresa, double salario, Empresa empresa, double comision) {
		
		super(codigo, nombre, telefono, fechaNacimiento);
		this.fechaAltaEmpresa = fechaAltaEmpresa;
		this.salario = salario;
		this.empresa = empresa;
		this.comision = comision;
	}

	public Date getFechaAltaEmpresa() {
		return fechaAltaEmpresa;
	}

	public void setFechaAltaEmpresa(Date fechaAltaEmpresa) {
		this.fechaAltaEmpresa = fechaAltaEmpresa;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	
	public String toString() {
		return "Empleado [fechaAltaEmpresa=" + fechaAltaEmpresa + ", salario=" + salario + ", empresa=" + empresa
				+ ", comision=" + comision + "]";
	}
	
	
	
	

}
