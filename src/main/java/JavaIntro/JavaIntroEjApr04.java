/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEjApr04 {
    
       public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite los grados celsius a modificar: ");
        int temperatura = leer.nextInt();
        
        double fahrenheit = 32 +(9 * temperatura/ 5);
        
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
    }
   
 
