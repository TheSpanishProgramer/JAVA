/*********************************************
 * Jose F. Quesada                           *
 *                Curso de Programación Java *
 * Capitulo03/BancoSA.java                   *
 *********************************************/

 /**
 * Esta clase implementa el sistema de       *
 * control de cuentas de un banco            *
 * @version 1.00                             *
 * @author Jose F. Quesada                   */

class BancoSA {
  private static CuentaSA cuenta1, cuenta2, cuenta3;

  public static void main (String args[]) {
    System.out.println
        ("Sistema Banco S.A.: Control de Cuentas");
    System.out.println("Creando cuentas");

       
    cuenta1 = new CuentaSA(
		"Anibal Torres Merino");
    cuenta2 = new CuentaSA(
		"Ana Alvarez Montes",
		25000);
    cuenta3 = new CuentaSA(
		"Teresa Benitez Romero",
		150000);

    gestionBanco();
  }

  private static void gestionBanco() {
    estadoBanco();

    System.out.println("VENTANILLA:");
    int operacion;
    do {
       System.out.println("[1] Imposicion");
       System.out.println("[2] Reintegro");
       System.out.println("[3] Estado de Cuentas");
       System.out.println("[0] Salir");
       do {
          operacion = Terminal.leeEntero
			("Indique una operacion: ");
         } while ((operacion < 0) ||
		  (operacion > 3));
         if (operacion == 1)
            gestionImposicion();
         else if (operacion == 2)
            gestionReintegro();
         else if (operacion == 3)
            estadoBanco();
      } while (operacion != 0);
   }

  private static void estadoBanco() {
    System.out.println("ESTADO DEL BANCO:");
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
  }

  private static void gestionImposicion() {
    System.out.println("IMPOSICION:");
    int cuenta;

    cuenta = seleccionCuenta();
    if (cuenta == 0)
      return;

    int cantidad = Terminal.leeEntero
                   ("Cantidad: ");
    boolean resImp = false;
    if (cuenta == 1)
       resImp = cuenta1.Imposicion(cantidad);
    else if (cuenta == 2)
       resImp = cuenta2.Imposicion(cantidad);
    else if (cuenta == 3)
       resImp = cuenta3.Imposicion(cantidad);

    if (resImp) 
      System.out.println
        ("Operación finalizada correctamente");
    else
      System.out.println
        ("Operación finalizada erróneamente");
  }

  private static void gestionReintegro() {
    System.out.println("REINTEGRO:");
    int cuenta;
    cuenta = seleccionCuenta();
    if (cuenta == 0)
      return;

    int cantidad = Terminal.leeEntero
                   ("Cantidad: ");
    boolean resImp = false;
    if (cuenta == 1)
       resImp = cuenta1.Reintegro(cantidad);
    else if (cuenta == 2)
       resImp = cuenta2.Reintegro(cantidad);
    else if (cuenta == 3)
       resImp = cuenta3.Reintegro(cantidad);

    if (resImp) 
      System.out.println
        ("Operación finalizada correctamente");
    else
      System.out.println
        ("Operación finalizada erróneamente");
  }

  private static int seleccionCuenta() {
    System.out.println("CUENTA?:");
    int cuenta;
    do {
       cuenta = Terminal.leeEntero
		("Indique una cuenta (1,2,3,0): ");
    } while ((cuenta < 0) && (cuenta > 3));
    return cuenta;
   }
}

/******** Fin de BancoSA.java ****************/
