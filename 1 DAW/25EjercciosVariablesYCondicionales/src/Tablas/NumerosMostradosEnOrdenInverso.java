package Tablas;

public class NumerosMostradosEnOrdenInverso {
	
	 public static void main(String[] args) {   
		 
		 int t[]=new int[5];      
		 
		 for (int i=0;i<5;i++)   
		 
		 {           
			 
			 System.out.print("Introduzca un número: ");    
			 
			 t[i]=Utilidades.Entrada.entero();        
			 
		 }               
		 
		 System.out.println("Los números (en orden inverso):");  
		 
		 for (int i=4;i>=0;i--)          
			 
			 System.out.println(t[i]); 
		 
	 } 

}
