package puerto;

public class tipos_barco extends barco{
    int mastiles;
    int potencia;
    int camarotes;
    float deportivo=300; //PRECIO DE ALQUILER DE UN BARCO DEPORTIVO
    float yate=500;// PRECIO DE ALQUILER DE UN YATE
   
    public tipos_barco(int mastiles,int potencia,int camarotes,int matricula,float sloran,int año_fab)
    {
    super(matricula,sloran,año_fab);
    this.mastiles=mastiles;
    this.potencia=potencia;
    this.camarotes=camarotes;
    }
    //CONDICIONES PARA SABER Q TIPO DE BARCO ES
    public float mostrar()
    { 
    if (camarotes==0)
        {
        return deportivo;
        }
    else
        return yate;
    }
   
}
