
package reto2;

import java.util.Scanner;

/**Programa que lee un numero y valida s es primo, saca su raiz, 
 *
 * @author rafae
 */

public class ValidadorDeNumero {
    static Scanner leer = new Scanner(System.in);
    static int numeros;
    public static void main(String[] args) {
        validar();
        
        
        
    }
    public static void validar(){
        //int numeros;
        String parImpar;
        do{
            System.out.println("Ingrese el numero: ");
            numeros=leer.nextInt();
            parInpa();
            cuadrado();
            cubo();
            sumaDeNumeros();
            primo();
        }
        while(numeros>0);
       
    }
    //metodo para saber si el numero es par o impar
    public static void parInpa(){
        String parImpar;
        if(numeros %2==0){
            parImpar="Par";
            System.out.println("Es: "+parImpar);
        }
        else{
            parImpar="Inpar";
            System.out.println("Es: "+parImpar);
        }
        
    }
    //metodo para saber el cuadrado del numero
    public static void cuadrado(){
        int cuadrado;
        cuadrado=numeros*numeros;
        System.out.println("El cuadrado es: "+cuadrado);
        
    }
    //metodo para saaber el cubo del numero
    public static void cubo(){
        int cubo;
        cubo = numeros*numeros*numeros;
        System.out.println("El cubo es: "+cubo);
    }
    
    //metodo para saber la suma de los digitos del numero
    public static void sumaDeNumeros(){
        int suma = 0;
        int temp = numeros;
    
        while (temp > 0) {
            int digito = temp % 10;   
            suma += digito;           
            temp /= 10;               
    }
        System.out.println("La suma de los digitos de: "+numeros+" es: "+suma);
    }
    //metodo para saber si un numero es primo o no
    public static void primo(){
        
        if (numeros <= 1) {
        System.out.println("El " + numeros + " no es primo");
        return;
    }
        boolean esPrimo = true;
    for (int i = 2; i <= Math.sqrt(numeros); i++) { //se multiplica por el mismo
        if (numeros % i == 0) { //vemos is la diferencia da igual a 0 para saber si es primo
            esPrimo = false;
            break;
        }
    }

        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
    
}
