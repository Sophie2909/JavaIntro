/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEjApr08 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Digite una palabra que tenga SOLAMENTE 8 letras:");
        String frase = leer.nextLine();
        
        if(frase.length() == 8 ){
            System.out.println("Correcto! La palbra tiene 8 letras");
        }else{
            System.out.println("Incorrecto. La palabra tiene más o menos de 8 letras");
        }
    }
}
