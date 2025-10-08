
package ejercicios;
/**
 *en este programa vemos de mejor manera la recursividad al momento de imprimir 
 * los primeros 100 numeros
 * @author rafae
 */
public class Numeros {
    
    
    public static void main(String[] args) {
        recursividadOrden(10);
        
        
    }
    public static void recursividad (int numero){
        if(numero >= 0){
            System.out.println(numero);
            recursividad(numero -1);   
        }                 
    }
    public static void recursividadOrden(int numero){
         if(numero >= 0){
            
            System.out.println(numero);
              recursividadOrden(numero -1); 
        }  
    }
}
