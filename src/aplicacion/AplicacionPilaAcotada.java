package aplicacion;

import estructuras.PilaAcotada;
import java.util.Scanner;

/**
*
*@autor
*@version 
*/
public class AplicacionPilaAcotada {
/**
 * 
 */
public static void main(String[] args)  {
    //declarar variables de referencia
    //estos son los objetos 
    PilaAcotada pila;
    Scanner teclado;

    //declara variables asociadas a los objetos
    int cantidad;
    char elemntoAInsertar;
    boolean isEmpty,isFull;

    //variables asociadas a la solucion

    //crear objetos
    teclado = new Scanner(System.in);
    pila = new PilaAcotada(2);
    
    //entrada
    //intentar solicitar ejecucion de metodo que puede generar una exception 
    //a treves de un "bloque protegido" 
    //usando try
    try{
        pila.push('a');
    }catch(Exception a){
        // en caso que se genere una exception
        //la capturo para dar el flujo de exceptiones de error
        System.out.println(a.getMessage());
    }
    try{
        pila.push('b');
    }catch(Exception b){
        // en caso que se genere una exception
        //la capturo para dar el flujo de exceptiones de error
        System.out.println(b.getMessage());
    }
    try{
        pila.push('c');
    }catch(Exception c ){
        // en caso que se genere una exception
        //la capturo para dar el flujo de exceptiones de error
        System.out.println(c.getMessage());
    }

    //proceso

    //salida
    //no siempre puedes eliminar
    try{
    System.out.println(pila.pop());
    System.out.println(pila.pop());
    System.out.println(pila.pop());
    }catch(Exception e ){
        System.err.println(e.getMessage());
    }
}
}
