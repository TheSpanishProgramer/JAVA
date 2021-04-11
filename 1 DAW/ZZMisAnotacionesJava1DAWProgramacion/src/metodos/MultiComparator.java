package metodos;

import java.util.Comparator;

//Con este metodo seleccionamos como ordenar los objetos,

//podemos ordenar de forma ascendente, descendente los objetos por el atributo seleccionado

public class MultiComparator implements Comparator<comparable>{
	
	private int asc;
	private int atributo;
	
	public MultiComparator(int asc, int atributo) {//constructor con argumentos de la clase MultiComparator
		this.asc = asc;
		this.atributo = atributo;
	}

	@Override
	public int compare(comparable o1, comparable o2) {//Metodo comparador segun el atributo que seleccionemos
		switch (atributo) {
		case 1://en este caso se ordena por matricula
			if(asc == 1) {
				return o1.compareTo(o2);//por orden ascendente
			}else {
				return -o1.compareTo(o2);//por orden descendente
			}
		case 2://En este caso se ordena por nombre
			if(asc == 1) {
				return o1.getAtributo2().compareTo(o2.getAtributo2());//por orden ascendente OJO EL ATRIBUTO NO COMIENZA EN MAYUSCULA, PERO CON EL GET SI
			}else {
				return -o1.getAtributo2().compareTo(o2.getAtributo2());//por orden descendente OJO EL ATRIBUTO NO COMIENZA EN MAYUSCULA, PERO CON EL GET SI
			}
		case 3://en este caso se ordena por nota
			if(asc == 1) {
				return Integer.compare(o1.getAtributo3(), o2.getAtributo3());//por orden ascendente OJO EL ATRIBUTO NO COMIENZA EN MAYUSCULA, PERO CON EL GET SI
			}else {
				return -Integer.compare(o1.getAtributo3(), o2.getAtributo3());//por orden descendente OJO EL ATRIBUTO NO COMIENZA EN MAYUSCULA, PERO CON EL GET SI
			}
		}
		return 0;
	}

}
