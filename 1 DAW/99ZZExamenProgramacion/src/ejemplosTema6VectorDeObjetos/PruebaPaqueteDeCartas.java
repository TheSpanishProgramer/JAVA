package ejemplosTema6VectorDeObjetos;

// Fig. 7.11: PruebaPaqueteDeCartas.java
// Aplicación para barajar y repartir cartas.

public class PruebaPaqueteDeCartas
{
   // ejecuta la aplicación
   public static void main( String args[] )
   {
      PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
      miPaqueteDeCartas.barajar(); // coloca las Cartas en orden aleatorio
      
      // imprime las 52 Cartas en el orden en el que se reparten
      for ( int i = 0; i < 13; i++ )
      {
         // reparte e imprime 4 Cartas
         System.out.printf( "%-20s%-20s%-20s%-20s\n", 
            miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta(),  
            miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta() );
      } // fin de for
   } // fin de main
} // fin de la clase PruebaPaqueteDeCartas


