package comercialEntornosDeDesarrollo;

import java.util.Date;

public abstract class datosPersonales {
	
	protected int codigo;
	protected String nombre;
	protected String telefono;
	protected Date fechaNacimiento;
	
	public datosPersonales(int codigo, String nombre, String telefono, Date fechaNacimiento) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String toString() {
		return "datosPersonales [codigo=" + codigo + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	

}
