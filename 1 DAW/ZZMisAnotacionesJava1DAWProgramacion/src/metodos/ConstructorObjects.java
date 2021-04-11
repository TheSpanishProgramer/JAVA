package metodos;

import java.util.Date;

public class ConstructorObjects {
	
	//declaracion de variables para el constructor del objeto o mas bien de atributos para la construccion del objeto.
	
	private String parametro1=0;//este parametro sera un contador por ejemplo de objetos que ira incrementando con forme se vayan insertando
	private String parametro2;
	private int parametro3;
	private Date parametro4;//importar de java.util.date
	private float parametro5;
	
	private Array [] parametro6;//este parametro es un array que va a contener varios datos
	
	public ConstructorObjects (String parametro1, String parametro2, int parametro3, Date parametro4, float parametro5) {//CONSTRUCTOR
		
		this.parametro1 = parametro1;//parametro dedicado a la id del objeto
		this.parametro2 = parametro2;
		this.parametro3 = parametro3;
		this.parametro4 = parametro4;
		this.parametro5 = parametro5;
		
		this.parametro6 = new Array [20];//asi inicializamos y creamos el array.	
		
	}//FIN DEL CONSTRUCTOR
	
	
	//INICIO DE LOS GET AND SET DE LOS ATRIBUTOS DEL OBJETO

	public String getParametro1() {
		return parametro1;
	}

	public void setParametro1(String parametro1) {
		this.parametro1 = parametro1;
	}

	public String getParametro2() {
		return parametro2;
	}

	public void setParametro2(String parametro2) {
		this.parametro2 = parametro2;
	}

	public int getParametro3() {
		return parametro3;
	}

	public void setParametro3(int parametro3) {
		this.parametro3 = parametro3;
	}

	public Date getParametro4() {
		return parametro4;
	}

	public void setParametro4(Date parametro4) {
		this.parametro4 = parametro4;
	}

	public float getParametro5() {
		return parametro5;
	}

	public void setParametro5(float parametro5) {
		this.parametro5 = parametro5;
	}

	public Array[] getParametro6() {
		return parametro6;
	}

	public void setParametro6(Array[] parametro6) {
		this.parametro6 = parametro6;
	}


	
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//damos formato a la fecha
		
		return "ConstructorObjects [parametro1=" + parametro1 + 
				", parametro2=" + parametro2 +
				", parametro3=" + parametro3 + 
				", parametro4=" + sdf.format(this.parametro4) +//con el formato de fecha dado lo imprimimos 
				", parametro5=" + parametro5 + "]";
	}
	
	//FIN DE LOS GET AND SET DE LOS ATRIBUTOS DEL OBJETO 
	
	

}
