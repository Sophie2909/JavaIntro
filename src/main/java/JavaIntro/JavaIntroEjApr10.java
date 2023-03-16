/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEjApr10 {
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
        int limite, suma= 0, num;
        
        do {
            System.out.println("Ingresa el límite a que te gustaria superar: ");
            limite = leer.nextInt();
            } while (limite < 0);
            
        
        do {
            System.out.println("Ingresa varios números que se sumarán hasta que se supere el límite");
            num = leer.nextInt();
            suma += num;
            } while (suma <= limite);
        
        System.out.println("La suma de los números es: " + suma + " y superó al limite: " + limite);
    }
    }

