package seresVivos;

public class profesor extends loro{
    String profesion;
    int edad;
    String nombre;
    int fecha_nacimiento;
    public profesor(int edad,String nombre,int fecha_nacimiento,String profesion)
    {
        super();
    this.nombre=nombre;
    this.edad=edad;
    this.fecha_nacimiento=fecha_nacimiento;
    this.profesion=profesion;
    }
    public String mostrar2()
    {
    return "hola soy  "+nombre+" y se "+super.mostrar()+"\nsoy racional"+"\ntengo "+edad+"años"+"\nnaci en año : "+fecha_nacimiento+"\nsoy "+profesion;
    }
}
