package practicaTema10HerenciaTurismoEnGranada;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class EmpresaTurismo.
 */
public class EmpresaTurismo {
	
	/** The tickets. */
	private static ArrayList<Ticket> tickets;
	
	/** The num tickets. */
	private static int numTickets;
	
	/** The tmp. */
	private static Ticket tmp;
	
	private static int ultimaPosicionGuardada;
	
	private static int flagGuardardoObligatorio; //0->Sin cambios, 1->Solo agregaciones, 2->Modificaciones o borrados

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		inicializar();
		do {
			menu();
			int opcion = elegirOpcionMenu();
			ejecutarOpcionMenu(opcion);
		} while (true);
	}
	
	/**
	 * Inicializar.
	 */
	private static void inicializar() {
		tickets = new ArrayList<Ticket>();
		numTickets = 0;
		ultimaPosicionGuardada = 0;
		flagGuardardoObligatorio = 0;
	}
	
	/**
	 * Menu.
	 */
	private static void menu() {
		System.out.println("======================================");
		System.out.println("           MENU");
		System.out.println("======================================");
		System.out.println("1.- Crea Ticket");
		System.out.println("2.- Visualizar numero de tickets");
		System.out.println("3.- Visualizar numero de actividades");
		System.out.println("4.- Visualizar numero de excursiones");
		System.out.println("5.- Visualizar un ticket");
		System.out.println("6.- Modificar un ticket");
		System.out.println("7.- Borrar un ticket");
		System.out.println("8.- Mostrar todos los tickets");
		System.out.println("9.- Grabar datos");
		System.out.println("10.- AÒadir datos al fichero");
		System.out.println("11.- Leer datos");
		System.out.println("12.- Salir");
		System.out.println("======================================");
	}
	
	/**
	 * Elegir opcion menu.
	 *
	 * @return the int
	 */
	private static int elegirOpcionMenu() {
		return teclado.leer_entero_error("Elija un opcion: ", "ERROR: No es una opcion valida", 1, 12);
	}
	
	/**
	 * Ejecutar opcion menu.
	 *
	 * @param opcion the opcion
	 */
	private static void ejecutarOpcionMenu(int opcion) {
		switch (opcion) {
		case 1: crearTicket(); break;
		case 2: numeroTickets(); break;
		case 3: numeroActividades(); break;
		case 4: numeroExcursiones(); break;
		case 5: visualizarTicket(); break;
		case 6: modificarTicket(); break;
		case 7: borrarTicket(); break;
		case 8: mostrarTodosTickets(); break;
		case 9: grabarDatos(); break;
		case 10: agregarDatos(); break;
		case 11: leerDatos(); break;
		default: System.out.println("Fin del programa"); System.exit(0);
		}
	}
	
	

	private static void agregarDatos() {
		if(flagGuardardoObligatorio == 0) {
			System.out.println("No hay cambios que guardar");
		}else if(flagGuardardoObligatorio == 2) {
			grabarDatos();
		}else {
			File f = new File("tickets.dat");
			if(!f.exists()) {
				grabarDatos();
			}else {
				FileOutputStream fos = null;
				MiObjectOutputStream moos = null;
				
				try {
					fos = new FileOutputStream(f, true);
					moos = new MiObjectOutputStream(fos);
					for (int i = ultimaPosicionGuardada+1; i < tickets.size(); i++) {
						moos.writeObject(tickets.get(i));
					}
					moos.close();
					fos.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	private static void leerDatos() {
		File f = new File("/Users/prats/eclipse-workspace/00ArponeroProject/src/practicaTema10HerenciaTurismoEnGranada/tickets.dat");
		if(!f.exists()) {
			System.out.println("No existe el fichero tickets.dat");
			return;
		}
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if(!tickets.isEmpty()) {
			int opcion = teclado.leer_entero("Quieres sobreescribir los datos? 1.No, 2.Si", 1, 2);
			if(opcion == 2) {
				tickets.clear();
			}else {
				flagGuardardoObligatorio = 2;
			}
		}
		
		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			try {
				while (true) {
					tickets.add((Ticket) ois.readObject());
				}
			} catch (EOFException e) {
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			fis.close();
			ois.close();
			ultimaPosicionGuardada = tickets.size()-1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void grabarDatos() {
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("tickets.dat");
			oos = new ObjectOutputStream(fos);
			for (Ticket t : tickets) {
				oos.writeObject(t);
			}
			fos.close();
			oos.close();
			ultimaPosicionGuardada = tickets.size()-1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear ticket.
	 */
	private static void crearTicket() {
		int opcion = -1;
		do {
			menuTicket();
			opcion = elegirOpcionMenuTicket();
			ejecutarOpcionMenuTicket(opcion);
		} while (opcion == 1 || opcion == 2);
		
	}

	/**
	 * Numero tickets.
	 */
	private static void numeroTickets() {
		System.out.println("N˙mero de tickets: "+numTickets);
	}

	/**
	 * Numero actividades.
	 */
	private static void numeroActividades() {
		int cont = 0;
		for (int i = 0; i < numTickets; i++) {
			Ticket aux = tickets.get(i);
			for (int j = 0; j < aux.getNumServicios(); j++) {
				ServicioTuristico aux2 = aux.getServicios().get(j);
				if(aux2 instanceof Actividad) {
					cont++;
				}
			}
		}
		System.out.println("Numero de actividades: "+cont);
	}

	/**
	 * Numero excursiones.
	 */
	private static void numeroExcursiones() {
		int cont = 0;
		for (int i = 0; i < numTickets; i++) {
			Ticket aux = tickets.get(i);
			for (int j = 0; j < aux.getNumServicios(); j++) {
				ServicioTuristico aux2 = aux.getServicios().get(j);
				if(aux2 instanceof Visita) {
					cont++;
				}
			}
		}
		System.out.println("Numero de visitas: "+cont);
		
	}

	/**
	 * Visualizar ticket.
	 */
	private static void visualizarTicket() {
		int idTicket = teclado.leer_entero_error("Introduzca el identificador del ticket: ", "Debe introducir un identificador valido", 1, Integer.MAX_VALUE); 
		int posicion = tickets.indexOf(new Ticket(idTicket));
		if(posicion == -1) {
			System.out.println("No se encuentra el ticket con identificador "+idTicket+" en nuestro sistema");
		}else {
			System.out.println(tickets.get(posicion));
		}
	}

	/**
	 * Modificar ticket.
	 */
	private static void modificarTicket() {
		menuModificarTicket();
		int opcion = elegirOpcionModificarTicket();
		
		int idTicket = teclado.leer_entero_error("Introduzca el identificador del ticket: ", "Debe introducir un identificador valido", 1, Integer.MAX_VALUE); 
		int posicion = tickets.indexOf(new Ticket(idTicket));
		if(posicion == -1) {
			System.out.println("No se encuentra el ticket con identificador "+idTicket+" en nuestro sistema");
			return;
		}
		
		ejecutarOpcionMenuModificarTicket(opcion, tickets.get(posicion));
		if(posicion > ultimaPosicionGuardada) {
			if(flagGuardardoObligatorio == 0) {
				flagGuardardoObligatorio = 1;
			}
		}else {
			flagGuardardoObligatorio = 2;
		}
	}

	/**
	 * Borrar ticket.
	 */
	private static void borrarTicket() {
		int idTicket = teclado.leer_entero_error("Introduzca el identificador del ticket: ", "Debe introducir un identificador valido", 1, Integer.MAX_VALUE); 
		int posicion = tickets.indexOf(new Ticket(idTicket));
		if(posicion == -1) {
			System.out.println("No se encuentra el ticket con identificador "+idTicket+" en nuestro sistema");
			return;
		}
		int opcion = teclado.leer_entero_error("Seguro que quiere borrar este ticket? 1.Si, 2.No", "Debe introducir una opcion valida", 1, 2);
		if(opcion == 1) {
			tickets.remove(posicion);
			numTickets--;
			if(posicion > ultimaPosicionGuardada) {
				if(flagGuardardoObligatorio == 0) {
					flagGuardardoObligatorio = 1;
				}
			}else {
				flagGuardardoObligatorio = 2;
			}
			System.out.println("Se ha eliminado correctamente el ticket "+idTicket);
		}
		
	}

	private static void mostrarTodosTickets() {
		for (Ticket t : tickets) {
			System.out.println(t);
		}
	}

	/**
	 * Menu ticket.
	 */
	private static void menuTicket() {
		System.out.println("======================================");
		System.out.println("          MENU TICKET");
		System.out.println("======================================");
		System.out.println("1.- Crear Ticket");
		System.out.println("2.- Contratar mas servicios");
		System.out.println("3.- Imprimir ticket");
		System.out.println("4.- Salir sin grabar");
		System.out.println("======================================");
	}

	/**
	 * Elegir opcion menu ticket.
	 *
	 * @return the int
	 */
	private static int elegirOpcionMenuTicket() {
		return teclado.leer_entero_error("Elija un opcion: ", "ERROR: No es una opcion valida", 1, 4);
	}

	/**
	 * Ejecutar opcion menu ticket.
	 *
	 * @param opcion the opcion
	 */
	private static void ejecutarOpcionMenuTicket(int opcion) {
		switch (opcion) {
		case 1:
			nuevoTicket();
			break;
		case 2:
			agregarServicios(tmp);
			break;
		case 3:
			imprimirYGuardar();
			break;
		default:
			salirSinGuardar();
		}
	}

	/**
	 * Nuevo ticket.
	 */
	private static void nuevoTicket() {
		if(tmp != null) {
			System.out.println("Ya existe un ticket creado");
			return;
		}
		System.out.println("======================================");
		System.out.println("          NUEVO TICKET");
		System.out.println("======================================");
		Date fecha = crearFecha();
		String nombre = crearNombre();
		int dni = crearDni();
		short numAdultos = crearNumAdultos();
		short numNinos = crearNumNinos();
		
		tmp = new Ticket(fecha, nombre, dni, numAdultos, numNinos);
		tmp.addServicio(new VisitaGranada(tmp, true));
	}

	/**
	 * Agregar servicios.
	 *
	 * @param ticket the ticket
	 */
	private static void agregarServicios(Ticket ticket) {
		if(ticket == null) {
			System.out.println("Es necesario crear previamente el ticket");
			return;
		}
		System.out.println("======================================");
		System.out.println("       CONTRATAR M¡S SERVICIOS");
		System.out.println("======================================");
		System.out.println("1.- Visita a Granada");
		System.out.println("2.- Visita a la Alhambra");
		System.out.println("3.- Visita al Generalife");
		System.out.println("4.- Visita Museo Federico GarcÌa Lorca");
		System.out.println("5.- Bajada en Canoa por el Genil");
		System.out.println("6.- Senderismo Sierra Nevada");
		System.out.println("7.- Volver");
		int opcion = teclado.leer_entero_error("Elija opcion: ", "Seleccione una opciÛn v·lida", 1, 7);
		boolean flag = false;
		if(opcion >= 1 && opcion <=4) {
			flag = teclado.leer_entero_error("Quiere que sea una visita guiada (1.Si, 2.No): ", "Seleccione una opcion v·lida", 1, 2) == 1;
		}else if(opcion >= 5 && opcion <=6) {
			flag = teclado.leer_entero_error("Quiere que sea un nivel principiante (1.Si, 2.No): ", "Seleccione una opcion v·lida", 1, 2) == 1;
		}
		switch (opcion) {
		case 1: ticket.addServicio(new VisitaGranada(ticket, flag)); break;
		case 2: ticket.addServicio(new VisitaAlhambra(ticket, flag)); break;
		case 3: ticket.addServicio(new VisitaGeneralife(ticket, flag)); break;
		case 4: ticket.addServicio(new VisitaLorca(ticket, flag)); break;
		case 5: ticket.addServicio(new BajadaCanoa(ticket, flag)); break;
		case 6: ticket.addServicio(new SenderismoSierraNevada(ticket, flag)); break;
		default:
			break;
		}
		
	}

	/**
	 * Imprimir Y guardar.
	 */
	private static void imprimirYGuardar() {
		if(tmp == null) {
			System.out.println("Es necesario crear previamente el ticket");
			return;
		}
		System.out.println(tmp);
		tickets.add(tmp);
		numTickets++;
		tmp = null;
		if(flagGuardardoObligatorio == 0) {
			flagGuardardoObligatorio = 1;
		}
	}

	/**
	 * Salir sin guardar.
	 */
	private static void salirSinGuardar() {
		tmp = null;
		System.out.println("No se ha guardado el ticket.");
	}

	/**
	 * Crear nombre.
	 *
	 * @return the string
	 */
	private static String crearNombre() {
		String nombre = null;
		do {
			nombre = teclado.leer_cadena2("Introduzca el nombre: ");
			nombre = nombre.trim();
			if(nombre.isEmpty()) {
				System.out.println("El nombre no puede estar vacÌo");
			}else if(nombre.split("[^a-zA-ZÒ—]").length>1) {
				System.out.println("El nombre contiene caracteres no permitidos");
			}else break;
		} while (true);
		return nombre;
	}

	/**
	 * Crear dni.
	 *
	 * @return the int
	 */
	private static int crearDni() {
		int dni = teclado.leer_entero_error("Introduzca el dni: ", "Debe introducir un dni valido", 0, 99999999);
		return dni;
	}

	/**
	 * Crear fecha.
	 *
	 * @return the date
	 */
	private static Date crearFecha() {
		int ano = teclado.leer_entero_error("Introduzca el año: ", "Debe introducir un aÒo valido", 2020, 2050);
		int mes = teclado.leer_entero_error("Introduzca el mes: ", "Debe introducir un mes valido", 1, 12);
		int maxDia = 31;
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11: maxDia = 30;
			break;
		case 2:
			if(esBisiesto(ano)) {
				maxDia = 29;
			}else {
				maxDia = 28;
			}
			break;
		}
		
		int dia = teclado.leer_entero_error("Introduzca el dia: ", "Debe introducir un dÌa valido", 1, maxDia);
		Date fecha;
		try {
			fecha = new SimpleDateFormat("dd/MM/yyyy").parse(dia+"/"+mes+"/"+ano);
		} catch (ParseException e) {
			return null;
		}
		return fecha;
	}

	/**
	 * Crear num adultos.
	 *
	 * @return the short
	 */
	private static short crearNumAdultos() {
		short numAdultos = (short) teclado.leer_entero_error("Introduzca el numero de adultos:" , "Debe introducir un numero entero valido", 1, Short.MAX_VALUE);
		return numAdultos;
	}

	/**
	 * Crear num ninos.
	 *
	 * @return the short
	 */
	private static short crearNumNinos() {
		short numNinos = (short) teclado.leer_entero_error("Introduzca el numero de niños:" , "Debe introducir un numero entero valido", 0, Short.MAX_VALUE);
		return numNinos;
	}

	/**
	 * Es bisiesto.
	 *
	 * @param ano the ano
	 * @return true, if successful
	 */
	private static boolean esBisiesto(int ano) {
	//		Es bisiesto si es divisible entre 4.
	//		Pero no es bisiesto si es divisible entre 100.
	//		Pero si es bisiesto si es divisible entre 400.
			return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
		}

	/**
	 * Agregar servicios ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void agregarServiciosTicket(Ticket ticket) {
		agregarServicios(ticket);
	}

	/**
	 * Borrar servicios ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void borrarServiciosTicket(Ticket ticket) {
		if(ticket.getNumServicios() == 0) {
			System.out.println("Este ticket no tiene servicios contratados");
			return;
		}
		System.out.println("Servicios contratados en este ticket:");
		for (int i = 0; i < ticket.getNumServicios(); i++) {
			System.out.println((i+1)+".- "+ticket.getServicios().get(i).toString());
		}
		int opcion = teclado.leer_entero_error("Elija un opcion: ", "ERROR: No es una opcion valida", 1, ticket.getNumServicios());
		ticket.deleteServicio(opcion-1);
		System.out.println("Eliminacion realizada con exito");
	}

	/**
	 * Menu modificar ticket.
	 */
	private static void menuModificarTicket() {
		System.out.println("======================================");
		System.out.println("         MODIFICAR TICKET");
		System.out.println("======================================");
		System.out.println("1.- Modificar fecha");
		System.out.println("2.- Modificar nombre");
		System.out.println("3.- Modificar dni");
		System.out.println("4.- Modificar numero de adultos");
		System.out.println("5.- Modificar numero de niÒos");
		System.out.println("6.- Agregar servicios");
		System.out.println("7.- Borrar servicios");
		System.out.println("8.- Salir");
		System.out.println("======================================");
		
	}

	/**
	 * Elegir opcion modificar ticket.
	 *
	 * @return the int
	 */
	private static int elegirOpcionModificarTicket() {
		return teclado.leer_entero_error("Elija un opcion: ", "ERROR: No es una opcion valida", 1, 8);
	}

	/**
	 * Ejecutar opcion menu modificar ticket.
	 *
	 * @param opcion the opcion
	 * @param ticket the ticket
	 */
	private static void ejecutarOpcionMenuModificarTicket(int opcion, Ticket ticket) {
		switch (opcion) {
		case 1:
			modificarFechaTicket(ticket);
			break;
		case 2:
			modificarNombreTicket(ticket);
			break;
		case 3:
			modificarDniTicket(ticket);
			break;
		case 4:
			modificarNumAdultosTicket(ticket);
			break;
		case 5:
			modificarNumNinosTicket(ticket);
			break;
		case 6:
			agregarServiciosTicket(ticket);
			break;
		case 7:
			borrarServiciosTicket(ticket);
			break;
		default:
			break;
		}
		
	}

	/**
	 * Modificar nombre ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarNombreTicket(Ticket ticket) {
		ticket.setNombre(crearNombre());
	}

	/**
	 * Modificar dni ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarDniTicket(Ticket ticket) {
		ticket.setDni(crearDni());
	}

	/**
	 * Modificar fecha ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarFechaTicket(Ticket ticket) {
		ticket.setFechaContratacion(crearFecha());
	}

	/**
	 * Modificar num adultos ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarNumAdultosTicket(Ticket ticket) {
		ticket.setNumAdultos(crearNumAdultos());
	}

	/**
	 * Modificar num ninos ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarNumNinosTicket(Ticket ticket) {
		ticket.setNumNinos(crearNumNinos());
	}

}

