/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEj12 {
     public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int num1 ;
        int num2 ;
       
        
        System.out.println("Ingresa dos numeros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        esMultiplo(num1, num2);
        
        
    }
    public static void esMultiplo(int num1, int num2){
        if (num1%num2==0){
            System.out.println("El primer numero es multiplo del segundo");
        
        }else{
            System.out.println("LOS NUMEROS NO SON MULTIPLOS");
        }
}
    }
