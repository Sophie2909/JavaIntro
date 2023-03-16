/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package JavaIntro;

/**
 *
 * @author sacevedo
 */
public class JavaIntroEjExt02 {
     public static void main(String[] args) {
        // TODO code application logic here
        
        int A=1,B=2,C=3,D=4;
        int aux=A;
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        
        A=D;
        D=B;
        B=C;
        C=aux;
        
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        
                
    }
    
}

