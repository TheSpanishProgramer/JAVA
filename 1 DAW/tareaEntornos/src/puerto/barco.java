package puerto;

public class barco {
    int matricula;
    float sloran;
    int año_fab;
    public barco(int matricula,float sloran,int año_fab)
    {
    this.matricula=matricula;
    this.sloran=sloran;
    this.año_fab=año_fab;
    }
    //METODO  “MODULO”
    public float modulo()
    {
    return (10*sloran);
    }
}
