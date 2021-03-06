package Libreria;

/*
 * 
 * 6) Crear una clase Libro que contenga los siguientes atributos:
– ISBN

– Titulo

– Autor

– Número de páginas

Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:

“El libro con ISBN creado por el autor tiene páginas”

En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.

Por último, indicar cuál de los 2 tiene más páginas.
 * 
 */

public class Libro {
    
    /*Atributos*/
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
     
    /*Constructores*/
     
    public Libro(int pISBN, String pTitulo, String pAutor, int pNumPaginas){
     
        ISBN=pISBN;
        titulo=pTitulo;
        autor=pAutor;
        numPaginas=pNumPaginas;
     
    }
     
    /*Metodos*/
 
    public int getISBN() {
        return ISBN;
    }
 
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public String getAutor() {
        return autor;
    }
 
    public void setAutor(String autor) {
        this.autor = autor;
    }
 
    public int getNumPaginas() {
        return numPaginas;
    }
 
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
     
    @Override
    public String toString(){
        return "El libro "+titulo+" con ISBN "+ISBN+""
                + " creado por el autor "+autor
                + " tiene "+numPaginas+" páginas";
    } 
     
     
     
}
