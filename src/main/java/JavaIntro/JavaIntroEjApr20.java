/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package JavaIntro;

import java.util.Scanner;

/*
 *
 * @author sacevedo
 */
public class JavaIntroEjApr20 {
     public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        int[][] matri=new int [3][3];
        llenado(matri);
        comprobar(matri);
    }
    
    //lenar la amtriz
    public static int[][] llenado(int[][] matri){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("de un valor entre 1 y 9");
                matri[i][j]=leer.nextInt();
                if(matri[i][j]<1 || matri[i][j]>9){
                    do {                        
                        System.out.println("de un valor entre 1 y 9");
                        matri[i][j]=leer.nextInt();
                    } while (matri[i][j]<1 || matri[i][j]>9);
                }
            }
                
           
            }
        return matri;
    }
    
    public static void comprobar(int[][] matri){
        int sumaH=0, sumaV=0,sumaD=0,contH=0,contV=0;
        
        //verificar la suma 
        for (int i = 0; i < 3; i++) {
            sumaH=0;
            sumaV=0;
            for (int j = 0; j < 3; j++) {
                //suma horizontal
                sumaH=sumaH+matri[i][j];
                if (sumaH==15){
                    contH++;
                }
                //suma vertical
                sumaV=sumaV+matri[j][i];
                if(sumaV==15){
                    contV++;
                }
            }
        }

        for (int k = 0; k < 3; k++) {
                   sumaD=sumaD+matri[k][k];
                }
        
                if(contH==3 && contV==3 && sumaD==15){
                    System.out.println("la matriz es mágica");
                }
                else{
                    System.out.println("la matriz No es mñagica");
                }
    }
}
