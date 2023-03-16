/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEjApr05 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        double numero = leer.nextDouble();
        
        
        
        System.out.println("El doble del numero ingresado es: " + numero * 2);
        System.out.println("El triple del numero ingresado es:" + numero * 3);
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(numero) );
    
    }
    }
       
