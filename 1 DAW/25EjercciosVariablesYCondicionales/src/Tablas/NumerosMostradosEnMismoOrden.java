package Tablas;

public class NumerosMostradosEnMismoOrden {
	
    public static void main(String[] args) {   
    	
    	int t[];                
    	t = new int[5];
    	
        for (int i=0;i<5;i++) 
        {         
        	
        	System.out.print("Introduzca un número: ");     
        	t[i]=Utilidades.Entrada.entero();   
        	
        }
        System.out.println("Los números son:");
        
        for (int i=0;i<5;i++)      
        	
        	System.out.println(t[i]);  
        
    }
    
}