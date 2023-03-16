/*
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEj06 {
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
    
       System.out.println("Ingrese un numero: ");
       int num1 = leer.nextInt();
       
        System.out.println("--------------");
    
        System.out.println("Ingrese otro numero: ");
        int num2 = leer.nextInt(); 
        
         System.out.println("--------------");
        
        if (num1>=25){
        System.out.println("El primer numero ingresado es mayor a 25!");
        
            System.out.println("&");
        
        if (num2>=25){
        System.out.println("El segundo numero ingresado es mayor a 25!");
            
}
    }
    }
}
