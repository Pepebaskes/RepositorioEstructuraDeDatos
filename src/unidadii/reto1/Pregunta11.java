
package unidadii.reto1;

/**
 *
 * @author rafae
 */
public class Pregunta11 {
    public static void main(String[] args) {
        int[] x = {3,2,8,6,3,7,3,1,4,-2,4};
        
        int mayor = x[0];
        int menor = x[0];
        int pos =0;
        
        for (int i=0; i < x.length;i++){
            if(x[i]>mayor){
                mayor=x[i];
                pos=i;
                System.out.println("Numero mayor es: "+mayor+" Esta en la posicion: "+pos);
            }
            if(x[i]<menor){
                menor=x[i];
                
            }
        }
        
    }
}
