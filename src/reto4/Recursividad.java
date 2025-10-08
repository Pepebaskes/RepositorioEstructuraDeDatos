
package reto4;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Recursividad {
    
    static Scanner leer = new Scanner(System.in);
    static Recursividad facto = new Recursividad();
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero: ");
        int numero=leer.nextInt();
        System.out.println("Fibonacci de " + numero + " es: " + facto.metodo(numero));
        
        System.out.println("Fibonacci: " + numero);
        for (int i = 0; i <= numero; i++) {
            System.out.print(facto.metodo(i) + " ");
        }
        
    }
    //metodo fibonacci 
    public int metodo(int numero){
       if (numero <=1) { //caso base
            return 1; 
        } else {         
            return metodo(numero - 1)+1 + metodo(numero - 2); //
        }
    }
}
