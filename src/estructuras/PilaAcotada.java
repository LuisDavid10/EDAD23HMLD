package estructuras;

/**
 * Write a description of class PilaAcotada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PilaAcotada
{
    // instance variables - replace the example below with your own
    private char[] pila;
    private int tope;
    /**
     * Constructor for objects of class PilaAcotada
     */
    public PilaAcotada()
    {
        // initialise instance variables
        pila = new char[3];
        tope = 0;
    }
    
    /**
     * constructor  for objects of class PilaAcotada
     */
    public PilaAcotada(int cantidad)
    {
        //initialise instance variables
       if (cantidad > 0) {
	pila = new char[cantidad];
}else {
	pila = new char[5];
}
       tope =0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void push(char elemntoAInsertar)throws Exception //<-se llama parametro o argumento
    {
        // put your code here
        if(!isFull())
        {
            pila[tope] = elemntoAInsertar; 
            tope++;
        }else
        {
            throw new Exception();
        }
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public char  pop()throws Exception
    {
        if(!isEmpty())
        {
            tope--;
            return pila[tope];
        } 
        throw new Exception("erro, pila esta vacia");
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean isEmpty()
    {
        return tope == 0;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public char tope()
    {
        return pila[tope - 1];
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean isFull()
    {
        return tope = pila.length; 
    }
}
