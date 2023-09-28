package estructuras;

/**
 * clase que modela una pila que tiene un limite fijo de elementos, acotada.
 * 
 * @author (Hinojosa Martínez Luis David)
 * @version (1.0 septiembre 23)
 */
public class PilaAcotada {
	// instance variables - replace the example below with your own
	private char[] pila;
	private int tope;

	/**
	 * Constructor de objetos de clase PilaAcotada, crea una pila de 10 elementos
	 */
	public PilaAcotada() {
		// initialise instance variables
		pila = new char[5];
		tope = 0;
	}

	/**
	 * Constructor de objetos de clase PilaAcotada, crea una pila
	 * de una cantidad proporcionada por el usuario,
	 * si la cantidad es 0 o menor la pila es de 10 elementos
	 */
	public PilaAcotada(int cantidad) {
		// initialise instance variables
		//siempre se hace una invocacion al constructor de la super clase
		//de manera implicita o explicita, escribiendo super(); o con parametros
		//el documento deve ser la primera instruccion
		//a menos que invoques a otro constructor de la misma clase
		//usando la auto referencia thisy entre parentesis
		//argumentos actuales que coincidan con los formales declarados
		this();
		if (cantidad > 0) {
			pila = new char[cantidad];
		}
		tope = 0;
	}

	/**
	 * metodo de insercion de elementos en la pila 
	 * 
	 * @param elemtoAInsertar elemento a insertar en el tope de la pila
	 * @return sin valor de retorno
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
	 * metodo de eliminacion de la pila 
	 * 
	 * @param sin parametros
	 * @return el elemento del tope, el ultimo elemento en entrar 
	 */
	public char pop() throws Exception {
		if (!isEmpty()) {
			tope--;
			return pila[tope];
		}else {
		throw new Exception("error, pila esta vacia");
		}
	}

	/**
	 * verifica si la pila esta vacia
	 * 
	 * @param no tiene parametros
	 * @return true si la pila esta vacia, false en caso contrario
	 */
	public boolean isEmpty() {
		return tope == 0;
	}

	/**
	 * visualiza el elemento del tope de la pila
	 * 
	 * @param sin parametros
	 * @return el ultimo elemento insertado, sin sacarlo de la pila
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
     * verifica si la pila esta llena
     * 
     * @param  sin parametros
	 * @return true si la pila esta llena, false si esta vacia 
     */
    public boolean isFull()
    {
        return tope == pila.length; 
	}
}

