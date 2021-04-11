package banco;

import java.util.Date;

public class Empleado extends Persona{
	
	private String nss;
	private Empleado jefe;
	
	public Empleado(String nombre, Date fechaNacimiento, String nss, Empleado jefe) {
		super(nombre, fechaNacimiento);
		this.nss = nss;
		this.jefe = jefe;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public Empleado getJefe() {
		return jefe;
	}

	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}

	@Override
	public String toString() {
		return "Empleado [nss=" + nss + ", jefe=" + jefe + "]";
	}
	
	

}
