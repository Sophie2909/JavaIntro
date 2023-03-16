 /*
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEj05 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese True or False: ");
        boolean banderilla = leer.nextBoolean();
        
        double valor = leer.nextDouble();
        System.out.println("Ingrese un precio: ");
        double precio = leer.nextDouble();
       
        System.out.println("Ingrese una letra: "); 
        char inicial = leer.next().charAt(0);
        
    
    }
}
