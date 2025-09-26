
package DeclarandoMetodos;

import java.util.Scanner;

/**
 *clase donde almacenamos los metodos del proyecto 
 * @author rafae
 */
public class Operaciones {
    Scanner leer = new Scanner(System.in);
   
    public String saludoMayus(String nombre){
        String may;
        may = nombre.toUpperCase();
        //System.out.println(may+" HOLA!");
        return may;
    }
    public int incrementarNum(int numero){
        int suma;
        suma=numero+1; 
        return suma;
    }
    public int suma(int n1, int n2){
        int suma;
        suma=n1+n2;
        return suma;
    }
    public int suma(int n1, int n2, int n3){
        int suma;
        suma=n1+n2+n3;
        return suma;
    }
    public boolean compararNum(int n1, int n2){
        boolean com =false;
        if(n1==n2){
            com=true;
           
        }
        return com;
    }
        
        
    }
    

