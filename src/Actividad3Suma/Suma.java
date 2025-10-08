
package Actividad3Suma;

import java.util.Scanner;

/**
 *programa que suma dos numeros guardados en un arreglo
 *mediante la recursividad de un metodo
 * @author rafae
 */
public class Suma {
    
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int resultado;
        
        int[] numeros = new int[2];
        System.out.println("Ingrese primer numero: ");
        numeros[0]=leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeros[1]=leer.nextInt();
        resultado=suma(numeros,0,1);
        System.out.println("Resultado: "+ resultado);
        
    }
    public static int suma(int[]arreglo, int n1, int n2){
        if(n1==n2){
            return arreglo[n1];
        }
        else{
            return arreglo[n1] + suma(arreglo, n1+1,n2); //n1+1 para q avance en el arreglo mas n2 q haga la sumna 
        }
    }
}
