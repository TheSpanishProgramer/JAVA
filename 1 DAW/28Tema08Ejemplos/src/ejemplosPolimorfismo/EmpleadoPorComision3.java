package ejemplosPolimorfismo;

// Fig. 9.12: EmpleadoPorComision3.java
// La clase EmpleadoPorComision3 representa a un empleado por comisión.

public class EmpleadoPorComision3
{
   private String primerNombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;
   private double ventasBrutas; // ventas totales por semana
   private double tarifaComision; // porcentaje de comisión

   // constructor con cinco argumentos
   public EmpleadoPorComision3( String nombre, String apellido, String nss, 
      double ventas, double tarifa )
   {
      // la llamada implícita al constructor de Object ocurre aquí
      primerNombre = nombre;
      apellidoPaterno = apellido;
      numeroSeguroSocial = nss;
      establecerVentasBrutas( ventas ); // valida y almacena las ventas brutas
      establecerTarifaComision( tarifa ); // valida y almacena la tarifa de comisión
   } // fin del constructor de EmpleadoPorComision3 con cinco argumentos

   // establece el primer nombre
   public void establecerPrimerNombre( String nombre )
   {
      primerNombre = nombre;
   } // fin del método establecerPrimerNombre

   // devuelve el primer nombre
   public String obtenerPrimerNombre()
   {
      return primerNombre;
   } // fin del método obtenerPrimerNombre

   // establece el apellido paterno
   public void establecerApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;
   } // fin del método establecerApellidoPaterno

   // devuelve el apellido paterno
   public String obtenerApellidoPaterno()
   {
      return apellidoPaterno;
   } // fin del método obtenerApellidoPaterno

   // establece el número de seguro social
   public void establecerNumeroSeguroSocial( String nss )
   {
      numeroSeguroSocial = nss; // debe validar
   } // fin del método establecerNumeroSeguroSocial

   // devuelve el número de seguro social
   public String obtenerNumeroSeguroSocial()
   {
      return numeroSeguroSocial;
   } // fin del método obtenerNumeroSeguroSocial

   // establece el monto de ventas brutas
   public void establecerVentasBrutas( double ventas )
   {
      ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
   } // fin del método establecerVentasBrutas

   // devuelve el monto de ventas brutas
   public double obtenerVentasBrutas()
   {
      return ventasBrutas;
   } // fin del método obtenerVentasBrutas
   
   // establece la tarifa de comisión
   public void establecerTarifaComision( double tarifa )
   {
		tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;	
			
      /* equivalente el código anterior a este otro:
		if (tarifa > 0 && tarifa < 1)
			tarifaComision = tarifa;
		else
			tarifaComision = 0;       
       */
       
   } // fin del método establecerTarifaComision

   // devuelve la tarifa de comisión
   public double obtenerTarifaComision()
   {
      return tarifaComision;
   } // fin del método obtenerTarifaComision

   // calcula los ingresos
   public double ingresos()
   {
      return obtenerTarifaComision() * obtenerVentasBrutas();
   } // fin del método ingresos

   // devuelve representación String del objeto EmpleadoPorComision3
   public String toString()
   {
      return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
         "empleado por comision", obtenerPrimerNombre(), obtenerApellidoPaterno(), 
         "numero de seguro social", obtenerNumeroSeguroSocial(), 
         "ventas brutas", obtenerVentasBrutas(), 
         "tarifa de comision", obtenerTarifaComision() );
   } // fin del método toString
} // fin de la clase EmpleadoPorComision3


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
