/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEjApr07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.printf("¿Es igual a la palabra -eureka-? %s ", (leer.nextLine().equals("eureka")) ? "Correcto" : "Incorrecto");
    }
    
    }

