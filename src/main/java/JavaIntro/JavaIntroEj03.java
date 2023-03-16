/*
Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
 */
package JavaIntro;

/*
 *
 * @author sacevedo
 */
public class JavaIntroEj03 {
    
    public static void main(String[] args) {
    
        int numero1 = 5; 
        int numero2 = 3;

        int suma = numero1+numero2;
        System.out.println ("El resultado de la suma es: " + suma);

        double division = numero1/numero2;
        System.out.println ("El resultado de la division es: " + division);

        boolean banderita = numero2<numero1;
        System.out.println ("El resultado es: " + banderita);

        numero1++;
        System.out.println ("El resultado es: " + numero1++);
     }
}
