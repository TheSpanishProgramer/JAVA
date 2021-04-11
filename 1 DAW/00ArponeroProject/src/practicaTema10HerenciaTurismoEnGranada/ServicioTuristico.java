package practicaTema10HerenciaTurismoEnGranada;

import java.io.Serializable;

//TODO: Auto-generated Javadoc
/**
* The Class ServicioTuristico.
*/
public abstract class ServicioTuristico implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3636087597981503535L;
	/** The ticket contratado. */
	protected Ticket ticketContratado;
	
	/**
	 * Instantiates a new servicio turistico.
	 *
	 * @param ticket the ticket
	 */
	public ServicioTuristico(Ticket ticket) {
		this.ticketContratado = ticket;
	}
	
	/**
	 * Calcular precio.
	 *
	 * @return the float
	 */
	public abstract float calcularPrecio();
	
}
