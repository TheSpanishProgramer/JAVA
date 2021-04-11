package Bucles;

/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 37

 */
public class S05Ejercicio37 {
  public static void main (String[] args) {
    float num;
    do {
      System.out.print("Introduce un número entero positivo: ");
      num = Integer.parseInt(System.console().readLine());
    } while (num < 1);
    System.out.print(num + " = ");
    
    // Cuenta los números y calcula el reves
    float aux = num;
    int numDig = 0;
    float numReves = 0;
    while (aux > 0){
      numReves = ((numReves*10) + (aux % 10));
      aux /=10;
      numDig++;
    }
    double cifra = 0;
    // Separa las cifras y escribe los palitos
    for (int i = 0; i < numDig; i++){
      cifra = numReves%10;
      numReves /= 10;
      for (int j = 0; j < cifra; j++){
        System.out.print("|");
      }
      if (i < numDig-1){
        System.out.print("-");
      }
    }
  }
}
