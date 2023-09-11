package estructuras;

public class Hijo extends Padre {
	private int x;

	public Hijo() {
		super();//en todas las clases invoca el metodo de la super clase antes de hacer lo suyo
		x=0;
		System.out.println("hijo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
