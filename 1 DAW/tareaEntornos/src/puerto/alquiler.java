package puerto;

public class alquiler extends barco{
    String nombre_cliente;
    int DNI;
    int fecha_inicio;
    int fecha_final;
    float posicion_amarre;

    public alquiler(String nombre_cliente,int DNI,int fecha_inicio,int fecha_final,float posicion_amarre,int matricula,float sloran,int año_fab)
    {
    super(matricula,sloran,año_fab);
    this.nombre_cliente=nombre_cliente;
    this.DNI=DNI;
    this.fecha_inicio=fecha_inicio;
    this.fecha_final=fecha_final;
    this.posicion_amarre=posicion_amarre;   
    }
   
    public float precio_alquiler()
    {
        if(fecha_final>fecha_inicio)
    return (((fecha_final-fecha_inicio)+1)*super.modulo());
        else
            return 0000000000;
    }
}

