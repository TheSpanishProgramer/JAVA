package seresVivos;

import java.util.Scanner;
public class Principal2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int edad;
        String nombre;
        int año_nac;
        String profesion;
        int opc;       
        for(;;){
        System.out.println("\n\n1: loro ");
        System.out.println("2: alumno ");
        System.out.println("3: profesor ");
        System.out.println("4: salir ");
        System.out.println("\n\tingrese opcion");
        opc=sc.nextInt();
        switch(opc)
                {
            case 1: loro l=new loro();
                System.out.print(l.mostrar());break;
            case 2: alumno al=new alumno(12,"david",1999);
                System.out.print(al.mostrar1());break;
            case 3: profesor prof=new profesor(34,"marco",1993,"profesor");
                System.out.print(prof.mostrar2());break;
            case 4:System.exit(0);
            default : System.out.print("opcion incorrecta");break;
        }
        }
    }
}
