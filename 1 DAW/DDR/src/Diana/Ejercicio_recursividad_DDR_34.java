package Diana;
 
public class Ejercicio_recursividad_DDR_34 {
 
    public static void main(String[] args) {
 
        // Zonas donde puedo puntuar
        int zonas[] = {10, 25, 50, 75};
 
        // numero de dardos que lanzo
        int dardos = 5;
        // Regiones con el numero de dardos en cada region
        int regionesDadas[] = new int[zonas.length];
        // puntuacion que se debe llegar
        int puntuacion = 100;
        int etapa = 0;
 
        // Mejor solucion
        int mejorSolucion[] = new int[zonas.length];
 
        dardosV3(mejorSolucion, zonas, regionesDadas, dardos, etapa, 0, puntuacion);
         
        mostrarSolucion(zonas, mejorSolucion);
         
    }
 
    public static void dardosV3(
            int[] mejorSolucion,
            int[] zonas,
            int[] regionesDadas,
            int dardos,
            int etapa,
            int puntuacionActual,
            int puntuacionIgualar
    ) {
 
        if (dardos == 0 || etapa == zonas.length || calcularPuntuacion(zonas, regionesDadas) == puntuacionIgualar) {
 
            if(calcularPuntuacion(zonas, regionesDadas) == puntuacionIgualar){
                 
                int sumaActual = sumaDardos(regionesDadas);
                int sumaMejor = sumaDardos(mejorSolucion);
                 
                if(sumaMejor == 0 || sumaActual < sumaMejor){
                    for (int i = 0; i < mejorSolucion.length; i++) {
                        mejorSolucion[i] = regionesDadas[i];
                    }
                }
                 
                 
                 
            }
             
        } else {
 
            for (int d = 0; d <= dardos; d++) {
                 
                int puntuacionZona = zonas[etapa] * d;
                 
                int puntuacionRestante = puntuacionActual + puntuacionZona;
                 
                if(puntuacionRestante <= puntuacionIgualar){
                     
                    regionesDadas[etapa] = d;
                     
                    dardosV3(
                            mejorSolucion,
                           zonas,
                           regionesDadas,
                           dardos - d,
                           etapa +1,
                           puntuacionActual + puntuacionZona,
                           puntuacionIgualar
                    );
                     
                    regionesDadas[etapa] = 0;
                     
                }
                 
                 
                 
            }
             
             
        }
 
    }
 
    /**
     * Devuelve la suma de dardos usados en cada una de las regiones Por
     * ejemplo: 2 dardos en 25 1 dardo en 50 ...
     *
     * @param regionesDada
     * @return
     */
    public static int sumaDardos(int[] regionesDada) {
        int suma = 0;
 
        for (int i = 0; i < regionesDada.length; i++) {
            suma += regionesDada[i];
        }
 
        return suma;
    }
 
    /**
     * Calcula los puntos de las zonas segun las regiones dadas
     *
     * @param zonas
     * @param regionesDada
     * @return
     */
    public static int calcularPuntuacion(int[] zonas, int[] regionesDada) {
 
        int puntos = 0;
        // Recorro las regiones donde tengo el numero de dardos
        for (int i = 0; i < regionesDada.length; i++) {
            // Sumo los puntos
            puntos += zonas[i] * regionesDada[i];
        }
        return puntos;
    }
 
    /**
     * Muestra el resultado segun los dardos usados Por ejemplo: 0 2 1 0
     * (regiones) => 25 25 50
     *
     * @param zonas
     * @param regionesDada
     */
    public static void mostrarSolucion(int[] zonas, int[] regionesDada) {
 
        // Recorro las regiones donde tengo el numero de dardos
        for (int i = 0; i < regionesDada.length; i++) {
            // Si es distinto de cero
            if (regionesDada[i] != 0) {
 
                // muestro la zona repetida tantas veces como dardos haya
                for (int j = 0; j < regionesDada[i]; j++) {
                    System.out.print(zonas[i] + " ");
                }
            }
        }
        System.out.println("");
 
    }
 
}