package Ejercicio05;

//Ejemplo de uso de do-while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while.

/*
 * Ejercicios básicos java con estructura iterativa o repetitiva
 * Mostrar los números del 100 al 1 utilizando un bucle do while
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int i = 100;
        System.out.println("Numeros del 100 al 1: ");
         do{
                   System.out.println(i);
                   i--;
        }while(i>=1);
    }
}