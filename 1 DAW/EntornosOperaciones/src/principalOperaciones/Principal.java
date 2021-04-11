package principalOperaciones;

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
	
    public static void main(String[] args) {
        // TODO code application logic here

        OperacionesBasicas op = new OperacionesBasicas(); //Instanciamos la clase "OperacionesBasicas" que tenemos en la libreria recien generada
        Scanner sc = new Scanner(System.in); //Instanciamos la clase Scanner

        double num1, num2; //Variables de tipo double
        System.out.print("Ingrese numero1: "); //Pedimos un numero por teclado
        num1 = sc.nextDouble(); //Almacenamos el numero en la variable num1
        System.out.print("Ingrese numero2: "); //Pedimos un numero por teclado
        num2 = sc.nextDouble(); //Almacenamos el numero en la variable num2

        /*
         * En las siguientes lineas invocamos los diferentes métodos que
         * trae nuestro objeto "op" y mostramos el resultado por consola
         */
        
        System.out.println("La suma es: " + op.sumar(num1, num2));
        System.out.println("La resta es: " + op.restar(num1, num2));
        System.out.println("La multiplicacion es: " + op.multiplicar(num1, num2));
        
    }

}
