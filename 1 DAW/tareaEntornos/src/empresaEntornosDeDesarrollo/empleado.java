package empresaEntornosDeDesarrollo;

public class empleado extends departamento{
	
	private int codigo;
	private String nombre;
	private String oficio;
	private double salario;
	private empleado jefe;
	
	empleado(int codigo, String nombre, String oficio, double salario, int codigodep, String nombredep, String localidad, empleado jefe) {
		
		super(codigodep, nombredep, localidad);
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.oficio = oficio;
		this.salario = salario;
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

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public empleado getJefe() {
		return jefe;
	}

	public void setJefe(empleado jefe) {
		this.jefe = jefe;
	}

	
	

}
