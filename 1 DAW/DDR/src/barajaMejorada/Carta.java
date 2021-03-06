package barajaMejorada;

/*
 * 
 * 16) Vamos a hacer unas mejoras a la clase Baraja del ejercicio 5 de POO de los videos.

Lo primero que haremos es que nuestra clase Baraja será la clase padre y será abstracta.

Le añadiremos el número de cartas en total y el número de cartas por palo.

El método crearBaraja() será abstracto.

La clase Carta tendrá un atributo genérico que será el palo de nuestra versión anterior.

Creamos dos Enum:

PalosBarEspañola:
OROS
COPAS
ESPADAS
BASTOS
PalosBarFrancesa:
DIAMANTES
PICAS
CORAZONES
TREBOLES
Creamos dos clases hijas:

BarajaEspañola: tendrá un atributo boolean para indicar si queremos jugar con las cartas 8 y 9 (total 48 cartas) o no (total 40 cartas).
BarajaFrancesa: no tendrá atributos, el total de cartas es 52 y el número de cartas por palo es de 13. Tendrá dos métodos llamados:
cartaRoja(Carta<PalosBarFrancesa> c): si el palo es de corazones y diamantes.
cartaNegra(Carta<PalosBarFrancesa> c): si el palo es de tréboles y picas.
De la carta modificaremos el método toString()

Si el palo es de tipo PalosBarFrancesa:

La carta número 11 será Jota
La carta numero 12 será Reina
La carta numero 13 será Rey
La carta numero 1 será As
Si el palo es de tipo PalosBarFrancesa:

La carta numero 10 será Sota
La carta numero 12 será Caballo
La carta numero 13 será Rey
La carta numero 1 será As
 * 
 */

public class Carta<T> {
     
    //Atributos
    private int numero;
    private T palo;
 
    public int getNumero() {
        return numero;
    }
 
    public T getPalo() {
        return palo;
    }
     
    //Constructor
    public Carta(int numero, T palo) {
        this.numero = numero;
        this.palo = palo;
    }
 
    @Override
    public String toString() {
         
        String estado="";
        String nombreFigura="";
         
        if(palo.getClass().getSimpleName().equals("PalosBarajaEspañola")){
             
            switch(numero){
                case 1:
                    nombreFigura="As";
                    break;
                case 10:
                    nombreFigura="Sota";
                    break;
                case 11:
                    nombreFigura="Caballo";
                    break;
                case 12:
                    nombreFigura="Rey";
                    break;
                default:
                    nombreFigura=numero+"";
            }
             
             
             
             
        }else if(palo.getClass().getSimpleName().equals("PalosBarajaFrancesa")){
             
            switch(numero){
                case 1:
                    nombreFigura="As";
                    break;
                case 11:
                    nombreFigura="Jota";
                    break;
                case 12:
                    nombreFigura="Reina";
                    break;
                case 13:
                    nombreFigura="Rey";
                    break;
                default:
                    nombreFigura=numero+"";
            }
             
        }
         
        estado = nombreFigura + " de "+ palo;
         
        return estado;
         
    }
     
}
