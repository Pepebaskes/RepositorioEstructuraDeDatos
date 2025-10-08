
package Examen;

/**
 *
 * @author rafae
 */
public class ejercico13 {
    
    public static void main(String[] args) {
        
        recursividadOrden(4);
    }
    public static void recursividadOrden(int numero){
         if(numero >= 0){
            
            System.out.println(numero);
             recursividadOrden(numero -1);  
        }  
    }
}

