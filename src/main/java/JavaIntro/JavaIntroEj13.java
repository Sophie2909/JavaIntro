/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEj13 {
     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int val =3;
        String[] Equipo = new String[val];
    
        for (int i = 0 ; i<val ; i++) {
            System.out.println("Ingresa valor en la posicion "+ (1+i) + ":");
            Equipo[i] = leer.next();
        }
        for (int i = 0 ; i<val ; i++) {
            System.out.println(" "+ Equipo[i] +" ");
        }
        System.out.println(" ");
    }

    }

    
