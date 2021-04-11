package seresVivos;

public class alumno extends loro{
    int edad;
    String nombre;
    int fecha_nacimiento;
    public alumno(int edad,String nombre,int fecha_nacimiento)
    {
        super();
    this.nombre=nombre;
    this.edad=edad;
    this.fecha_nacimiento=fecha_nacimiento;
    }
    public String mostrar1()
    {
    return "hola soy  "+nombre+" y se "+super.mostrar()+"\nsoy racional"+"\ntengo "+edad+"años"+"\nnaci en año : "+fecha_nacimiento;
    }
}
