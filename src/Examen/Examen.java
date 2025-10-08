
package Examen;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Examen {
   static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Examen numSec = new Examen();
        
        System.out.println("Numero: ");
        int numero=leer.nextInt();
        System.out.println(obtenerNumSecreto(numero));
        
        
        
    }
    
    public static int obtenerNumSecreto(int n){
        if(n==0)return 0;
        else return n + obtenerNumSecreto(n-1);
    }
}
