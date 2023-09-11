package estructuras;

/**
 * Write a description of class PilaAcotada here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class PilaAcotada {
	// instance variables - replace the example below with your own
	private char[] pila;
	private int tope;

	/**
	 * Constructor for objects of class PilaAcotada
	 */
	public PilaAcotada() {
		// initialise instance variables
		pila = new char[5];
		tope = 0;
	}

	/**
	 * constructor for objects of class PilaAcotada
	 */
	public PilaAcotada(int cantidad) {
		// initialise instance variables
		if (cantidad > 0) {
			pila = new char[cantidad];
		} else {
			pila = new char[5];
		}
		tope = 0;
	}

	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param y a sample parameter for a method
	 * @return the sum of x and y
	 */
	public void push(char elemntoAInsertar) throws Exception { // <-se llama parametro o argumento
		// put your code here
		if (!isFull()) {
			pila[tope] = elemntoAInsertar;
			tope++;
		} else {
			throw new Exception("error: pila negra");// no se mandan mensajes de error, se lanza una exception
														// encapsulandolo y que el que lo recibe decida que hacer con el
		}
	}

	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param y a sample parameter for a method
	 * @return the sum of x and y
	 */
	public char pop() throws Exception {
		if (!isEmpty()) {
			tope--;
			return pila[tope];
		}else {
		throw new Exception("erro, pila esta vacia");
		}
	}

	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param y a sample parameter for a method
	 * @return the sum of x and y
	 */
	public boolean isEmpty() {
		return tope == 0;
	}

	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param y a sample parameter for a method
	 * @return the sum of x and y
	 */
	public char tope() throws Exception {// muestra lo que esta arriba el metodo
		// reportar la excepcion en la firma del metodo
		if (!isEmpty()) {
			return pila[tope - 1];
		} else {
			throw new Exception("no hay elementos en la pila");
		}
	}

	/**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean isFull()
    {
        return pila=pila.length; 
    }
}
