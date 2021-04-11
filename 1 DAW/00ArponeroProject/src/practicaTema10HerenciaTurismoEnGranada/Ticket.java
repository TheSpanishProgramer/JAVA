package practicaTema10HerenciaTurismoEnGranada;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Ticket.
 */
public class Ticket implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8596648944040256698L;

	/** The fecha contratacion. */
	private Date fechaContratacion;
	
	/** The numero tickets. */
	private static int numeroTickets = 0;
	
	/** The id ticket. */
	private int idTicket;
	
	/** The nombre. */
	private String nombre;
	
	/** The dni. */
	private int dni;
	
	/** The num adultos. */
	private short numAdultos;
	
	/** The num ninos. */
	private short numNinos;
	
	/** The precio. */
	private float precio;
	
	/** The num servicios. */
	private int numServicios;
	
	/** The servicios. */
	private ArrayList<ServicioTuristico> servicios;
	
	/**
	 * Instantiates a new ticket.
	 *
	 * @param fecha the fecha
	 * @param nombre the nombre
	 * @param dni the dni
	 * @param numAdultos the num adultos
	 * @param numNinos the num ninos
	 */
	public Ticket(Date fecha, String nombre, int dni, short numAdultos, short numNinos) {
		this.fechaContratacion = fecha;
		this.nombre = nombre;
		this.dni = dni;
		this.numAdultos = numAdultos;
		this.numNinos = numNinos;
		this.numServicios = 0;
		this.servicios = new ArrayList<ServicioTuristico>();
		this.precio = 0;
		numeroTickets++;
		this.idTicket = numeroTickets;
	}
	
	//Constructor para busquedas
	public Ticket(int idTicket) {
		this.idTicket = idTicket;
	}

	/**
	 * Gets the fecha contratacion.
	 *
	 * @return the fecha contratacion
	 */
	public Date getFechaContratacion() {
		return fechaContratacion;
	}

	/**
	 * Sets the fecha contratacion.
	 *
	 * @param fechaContratacion the new fecha contratacion
	 */
	public void setFechaContratacion(Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * Sets the dni.
	 *
	 * @param dni the new dni
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * Gets the num adultos.
	 *
	 * @return the num adultos
	 */
	public short getNumAdultos() {
		return numAdultos;
	}

	/**
	 * Sets the num adultos.
	 *
	 * @param numAdultos the new num adultos
	 */
	public void setNumAdultos(short numAdultos) {
		this.numAdultos = numAdultos;
	}

	/**
	 * Gets the num ninos.
	 *
	 * @return the num ninos
	 */
	public short getNumNinos() {
		return numNinos;
	}

	/**
	 * Sets the num ninos.
	 *
	 * @param numNinos the new num ninos
	 */
	public void setNumNinos(short numNinos) {
		this.numNinos = numNinos;
	}

	/**
	 * Gets the id ticket.
	 *
	 * @return the id ticket
	 */
	public int getIdTicket() {
		return idTicket;
	}

	/**
	 * Gets the precio.
	 *
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Gets the servicios.
	 *
	 * @return the servicios
	 */
	public ArrayList<ServicioTuristico> getServicios() {
		return servicios;
	}
	
	/**
	 * Gets the num servicios.
	 *
	 * @return the num servicios
	 */
	public int getNumServicios() {
		return numServicios;
	}

	/**
	 * Adds the servicio.
	 *
	 * @param servicio the servicio
	 * @return true, if successful
	 */
	public boolean addServicio(ServicioTuristico servicio) {
		this.servicios.add(servicio);
		this.precio += servicio.calcularPrecio();
		numServicios++;
		return true;
	}
	
	/**
	 * Delete servicio.
	 *
	 * @param posicion the posicion
	 * @return true, if successful
	 */
	public boolean deleteServicio(int posicion) {
		if(posicion < 0 || posicion >= numServicios) {
			return false;
		}
		ServicioTuristico aux = this.servicios.remove(posicion);
		this.numServicios--;
		this.precio -= aux.calcularPrecio();
		return true;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = "N∫ Ticket: "+this.idTicket+
				"\nFecha: "+sdf.format(this.fechaContratacion)+
				"\nNombre: "+this.nombre+
				"\nDNI: "+this.dni+
				"\nN∫ Adultos: "+this.numAdultos+
				"\nN∫ NiÒos: "+this.numNinos+
				"\nN∫ Servicios contratados: "+this.numServicios+
				"\nSERVICIOS CONTRATADOS:\n";
		for (int i = 0; i < numServicios; i++) {
			s += servicios.get(i).toString()+"\nPrecio: "+servicios.get(i).calcularPrecio()+"\n";
		}
		s+="PRECIO TOTAL: "+this.precio;
		return s;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (idTicket != other.idTicket)
			return false;
		return true;
	}
	
	

}

