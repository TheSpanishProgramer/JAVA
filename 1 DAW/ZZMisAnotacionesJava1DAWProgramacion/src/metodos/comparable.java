package metodos;

public class comparable implements Comparable <comparable> {
	
	private int atributo1;
	private String atributo2;
	private int atributo3;
	
	//declaracion del constructor para la clase comparable
	
		public void comparable(int atributo1, String atributo2, int atributo3) { 
			this.atributo1 = atributo1;
			this.atributo2 = atributo2;
			this.atributo3 = atributo3;
			
		}

	public int getAtributo1() {
			return atributo1;
		}



		public void setAtributo1(int atributo1) {
			this.atributo1 = atributo1;
		}



		public String getAtributo2() {
			return atributo2;
		}



		public void setAtributo2(String atributo2) {
			this.atributo2 = atributo2;
		}



		public int getAtributo3() {
			return atributo3;
		}



		public void setAtributo3(int atributo3) {
			this.atributo3 = atributo3;
		}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		comparable other = (comparable) obj;
		if (atributo1 != other.atributo1)
			return false;
		if (atributo2 == null) {
			if (other.atributo2 != null)
				return false;
		} else if (!atributo2.equals(other.atributo2))
			return false;
		if (atributo3 != other.atributo3)
			return false;
		return true;
	}
		
	@Override
	public String toString() {
		return "comparable [atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + "]";
	}

	@Override
	public int compareTo(comparable o) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	

}
