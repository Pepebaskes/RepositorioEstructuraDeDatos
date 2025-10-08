
package reto3;

import java.util.Scanner;

/**este programa ponemos en practica lo que es recursividad
 *
 * @author rafae
 */
public class factorial {
    static Scanner leer = new Scanner (System.in);
    static factorial facto = new factorial();
    
    public static void main(String[] args) {
        int numero;
        System.out.println("Ingrese un numero: ");
        numero=leer.nextInt();
        System.out.println("El factorial es: "+facto.recursividad(numero));
        
    }
    
    public int calcularFactorial(int numero){
        
        int factorial=1;
        for(int i =1;i<=numero;i++){
            factorial*=i;
        }
        return factorial;
        
        
    }
    public int recursividad(int numero){
        if(numero == 0 || numero ==1){
            return 1;
        }else{
            return numero*recursividad(numero-1);
        }
        
    }
   
}
