package banco;

import java.util.Date;

public abstract class Persona {
	
	protected String nombre;
	protected Date fechaNacimiento;
	
	public Persona(String nombre, Date fechaNacimiento) {
		//TODO
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	

}
