package practicaTema10HerenciaTurismoEnGranada;

//TODO: Auto-generated Javadoc
/**
* The Class Actividad.
*/
public abstract class Actividad extends ServicioTuristico{
	
	/** The principiantes. */
	protected boolean principiantes;
	
	/**
	 * Instantiates a new actividad.
	 *
	 * @param ticket the ticket
	 * @param principiantes the principiantes
	 */
	public Actividad(Ticket ticket, boolean principiantes) {
		super(ticket);
		this.principiantes = principiantes;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "Actividad: "+(this.principiantes ? "Principiante" : "Experto");
	}

}

