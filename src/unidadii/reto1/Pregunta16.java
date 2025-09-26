
package unidadii.reto1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rafae
 */

public class Pregunta16 {
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        String nombresV;
        boolean siExiste = false;
    
        //for para agregar el nombre a la lista
        for (int i=0; i == nombres.size();i++){
            System.out.println("Ingrese el nombre: ");
            nombresV=leer.nextLine();
            nombres.add(nombresV);
        
        //for para no agregar nombres buscados
        for (int j = 0; i < nombres.size(); j++) {
            String nombreBuscado = nombres.get(i);
            
          if(nombreBuscado.equalsIgnoreCase(nombres.get(i))){
             siExiste=true;  
             break;
                
            }
          if(!siExiste){{
              nombres.add(nombresV);
          }
            
            }      
          
    } 
         if(nombresV.equalsIgnoreCase("Salir")){
                break;
            }
    
    
    }
        System.out.println("La cantidad de nombres es: "+(nombres.size()-1));
   
    }
}