 /*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;//este metodo inporta las librerias
public class Ejemplo0If {//es la clase principal, abre la clase 
    public static void main( String[] args ){//este es el metodo principal donde se ejecuta todo  el codigo
        

	//declaración de variables
	Scanner sc = new Scanner( System.in ); //sirve para crear el objeto Scanner
        System.out.print("Nota: "); // pinta en pantalla, una palabra en este caso
        int nota = sc.nextInt(); //lee un entero por teclado y guarda la informacion para luego utilizarlo
        if (nota >= 5 ){ //es una condicion que dice, si el numero que has introducido es igual o mayor a 5 se ejecuta el codigo de abajo 
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
        }
        else // si la condion de if no se cumple y el numero introducido es menor a 10 entonces de ejecuta este codigo de abajo
            System.out.println("Lo Siento, has suspendido");
    }
}
