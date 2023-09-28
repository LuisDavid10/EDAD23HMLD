/**
 * 
*escribir una aplicacion que determine si una ecuacion esta valanceada en parentecis
*no puedes cerrar si no esta abierto  sacar sin tener excepcion pop
*usa una pila
*expresion: operandos combinados mediante operadores que te dan un resultado
*los operandos pueden ser variables, constantes literales o simbolicas e incluso operadores
*
 */
package aplicacion;

import java.util.Scanner;
import java.util.Stack;


import javax.swing.JOptionPane;
public class AplicacionEcuacionValanceada{

// public static void main(String[] args){

//     //declarar variables
//     String ecuacion;
//     int contadorParentesisAbiertos;
//     int contadorParentesisCerrados;

//     //inicializar variables
//     ecuacion = JOptionPane.showInputDialog(null, "Ingrese una ecuación a valancear");;
//     contadorParentesisAbiertos = 0;
//     contadorParentesisCerrados = 0;

//     char[] caracteres = ecuacion.toCharArray();

// for( char caracter : caracteres){
//     if (caracter == '('){
//         contadorParentesisAbiertos++;
//     }else if (caracter == ')'){
//         contadorParentesisCerrados++;
//     }

//     }
//     if (contadorParentesisAbiertos == contadorParentesisCerrados){
//         JOptionPane.showMessageDialog(null, "La ecuacion: " + ecuacion + " esta valanceada en parentecis ()");
//     }else if (contadorParentesisAbiertos > contadorParentesisCerrados){
//         JOptionPane.showMessageDialog(null, "Existen mas '(' que ')'");
//     }else{
//         JOptionPane.showMessageDialog(null, "La ecuación tiene mas ')' que '('");
//     }
// }
// }

/**
 * 
 */


    static char[] open = {'('};
    static char[] close = {')'};

    static boolean isOpen(char c) {
        for (int i = 0; i < open.length; i++) {
            if (open[i] == c) {
                return true;
            }
        }
        return false;
    }

    static char getInv(char c) {
        for (int i = 0; i < open.length; i++) {
            if (open[i] == c) {
                return close[i];
            }
        }
        for (int i = 0; i < close.length; i++) {
            if (close[i] == c)
                return open[i];
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una expresión con paréntesis:");
        String expression = input.nextLine();
        char[] expr = expression.toCharArray();
        Stack<Character> s = new Stack<>();
        boolean correct = true;

        for (int i = 0; i < expr.length; i++) {
            if (isOpen(expr[i])) {
                s.push(expr[i]);
            } else {
                if (s.isEmpty() || s.peek() != getInv(expr[i])) {
                    correct = false;
                    break;
                } else {
                    s.pop();
                }
            }
        }

        if (!s.empty()) {
            correct = false;
        }

        if (correct) {
            System.out.println(expression + " es una expresión correcta.");
        } else {
            System.out.println(expression + " no es una expresión correcta.");
        }
    }
}
