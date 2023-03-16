/*
 Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEj14 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int val =3;
        String[] Equipo = new String[val];
    
        for (int i = 0 ; i<val ; i++) {
            System.out.println("Ingresa el nombre "+ (1+i) + " de los participantes del equipo:");
            Equipo[i] = leer.next();
        }
        for (int i = 0 ; i<val ; i++) {
            System.out.println(" "+ Equipo[i] +" ");
        }
        System.out.println(" ");
    }

    }



