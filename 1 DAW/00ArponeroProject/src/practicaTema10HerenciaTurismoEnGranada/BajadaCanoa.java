package practicaTema10HerenciaTurismoEnGranada;

//TODO: Auto-generated Javadoc
/**
* The Class BajadaCanoa.
*/
public class BajadaCanoa extends Actividad{

	/**
	 * Instantiates a new bajada canoa.
	 *
	 * @param ticket the ticket
	 * @param principiantes the principiantes
	 */
	public BajadaCanoa(Ticket ticket, boolean principiantes) {
		super(ticket, principiantes);
	}

	/**
	 * Calcular precio.
	 *
	 * @return the float
	 */
	@Override
	public float calcularPrecio() {
		return ticketContratado.getNumAdultos() * 15  
				+ ticketContratado.getNumNinos() * 15
				+ (principiantes ? 5 : 10);
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "BAJADA CANOA\n" + super.toString();
	}
}

