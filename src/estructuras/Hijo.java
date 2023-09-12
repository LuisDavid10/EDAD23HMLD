package estructuras;
/**
 * 
 */

public class Hijo extends Padre {
	private int x;

	public Hijo() {
		//initialise instance variables
		super(7);//en todas las clases invoca el metodo de la super clase antes de hacer lo suyo de manera explicita
		x=0;

		System.out.println("hijo");
	}
	/**
	 * 
	 */
}
