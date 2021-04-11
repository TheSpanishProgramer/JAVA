package practicaTema10HerenciaTurismoEnGranada;

//TODO: Auto-generated Javadoc
/**
* The Class Visita.
*/
public abstract class Visita extends ServicioTuristico{
	
	/** The visita guiada. */
	protected boolean visitaGuiada;
	
	/**
	 * Instantiates a new visita.
	 *
	 * @param ticket the ticket
	 * @param visitaGuiada the visita guiada
	 */
	public Visita(Ticket ticket, boolean visitaGuiada) {
		super(ticket);
		this.visitaGuiada = visitaGuiada;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "Visita guiada: "+(this.visitaGuiada ? "Si" : "No");
	}

}