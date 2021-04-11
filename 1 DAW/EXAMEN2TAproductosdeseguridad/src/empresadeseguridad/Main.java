package empresadeseguridad;

public class Main {
	
	// E: vector de productos de seguridad contratados
	// S: muestra todos los datos de los productos del vector con toString()
	// y adem·s muestra el precio de cada uno de ellos
	public static void mostrar(Producto_seguridad v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].toString()+"\nPrecio ="+v[i].precio());
		}
	}
	
	// E: vector de productos de seguridad contratados
	/* S: muestra por pantalla el producto m·s caro contratado: (el producto y su
	 precio) y muestra por pantalla el producto m·s barato contratado: (el
	 producto y su precio) */ 
	public static void precio_max_min(Producto_seguridad v[]) {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		Producto_seguridad pmin = null;
		Producto_seguridad pmax = null;
		for (int i = 0; i < v.length; i++) {
			if(v[i].precio() < min) {
				min = v[i].precio();
				pmin = v[i];
			}else if(v[i].precio() > max) {
				max = v[i].precio();
				pmax = v[i];
			}
		}
		System.out.println("El producto m·s caro contratado es: " + pmax.toString());
		System.out.println("El producto m·s caro contratado vale: " + max + " Ä");
		System.out.println("El producto m·s barato contratado es: " + pmin.toString());
		System.out.println("El producto m·s barato contratado vale: " + min + " Ä");
	}
	
	// E: vector de productos de seguridad contratados
	/* S: muestra por pantalla la suma de los ingresos (precio()) por vender
	Antivirus y muestra la suma de los ingresos por vender Copias de seguridad
	y finalmente muestra la suma total de ambos ingresos (Antivirus + Copias ) */
	public static void total_precio(Producto_seguridad v[]) {
		double sumaAntivirus = 0;
		double sumaCopias = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] instanceof Antivirus) {
				sumaAntivirus += v[i].precio();
			}else {
				sumaCopias += v[i].precio();
			}
		}
		System.out.println("La suma de los ingresos por Antivirus es: "+sumaAntivirus);
		System.out.println("La suma de los ingresos por Copias de seguridad es: "+sumaCopias);
		System.out.println("La suma total de todos los ingresos es: "+(sumaAntivirus+sumaCopias));
	}
	
	// E: vector de productos de seguridad contratados
	/* S: Muestra el nombre y apellidos de los compradores que contrataron un
	 antivirus con antiespias y la descripciÛn de ese producto
	 pista: usa la conversiÛn descendente para saber si contrato un antiespias */
	public static void mostrar_antiespias(Producto_seguridad v[]) {
		for (int i = 0; i < v.length; i++) {
			if(v[i] instanceof Antivirus) {
				Antivirus a = (Antivirus) v[i];
				if(a.isAntiespias()) {
					String descripcion = a.getDescripcion();
					Cliente c = a.getComprador();
					System.out.println(c.getNombre()+" "+c.getApellidos()+" con el producto "+descripcion+ " tiene contratado el antiespias");
				}
				
			}
		}
	}
	
	// E: vector de productos de seguridad contratados y el Nombre y Apellidos de un cliente
	/* S: Muestra por pantalla todos la descripciÛn de todos los productos de
	 seguridad contratados por ese cliente en caso de que haya contratado alguno
	sino muestra por pantalla que no contrato ning˙n producto de seguridad */

	public static void mostrar_cliente(Producto_seguridad v[], String nombre, String apellidos ) {
		System.out.println(nombre+" "+apellidos+":");
		for (int i = 0; i < v.length; i++) {
			if(v[i].getComprador().getNombre().equals(nombre) && v[i].getComprador().getApellidos().equals(apellidos)) {
				System.out.println(v[i].getDescripcion());
			}
		}
	}

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Francisco Javier", "Barraquier Martinez", 11111111);
		Cliente c2 = new Cliente("Alberto", "CortÈs S·nchez", 22222222);
		Cliente c3 = new Cliente("JosÈ Antonio", "LÛpez Balastegui", 33333333);
		Cliente c4 = new Cliente("Leonardo", "Mil·n Murcia", 44444444);
		
		Copias cs1 = new Copias(true, "Copias de Farmacia Roberto", c1, 10);
		Copias cs2 = new Copias(true, "Copias de Juan SL", c2, 11);
		Copias cs3 = new Copias(true, "Copias de Antonia S.A", c3, 5);
		Copias cs4 = new Copias(true, "Copias de Gimnasio Roberto", c4, 20);
		
		Antivirus a1 = new Antivirus(true, "Panda_antivirus", c4, 10);
		Antivirus a2 = new Antivirus(false, "Norton_antivirus", c3, 20);
		Antivirus a3 = new Antivirus(false, "Panda_antivirus", c2, 30);
		Antivirus a4 = new Antivirus(true, "Avast_antivirus", c1, 5);
		
		Producto_seguridad[] v = {cs1,cs2,cs3,cs4,a1,a2,a3,a4};
		
		mostrar(v);
		System.out.println();
		precio_max_min(v);
		System.out.println();
		total_precio(v);
		System.out.println();
		mostrar_antiespias(v);
		System.out.println();
		mostrar_cliente(v, "Alberto", "CortÈs S·nchez");
	}

}

