/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEj09 {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int num=0, suma=0, cont=0;
       boolean ter;
       do{
           System.out.println("Ingrese 20 numeros:");
           num=leer.nextInt();
           if (num>0){
              suma=suma+num;
              }
       if (num==0){
           System.out.println("Se capturó el numero cero");
        break;
        }        
           cont=cont+1;
       }  while (cont!=20);
   
        System.out.println("Esta es la suma de todos los numeros ingresados:"+ suma);
        System.out.println("Esta es la cantidad de digitos ingresados:"+(cont));
        
    }
     
}
