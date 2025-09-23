
package repaso2venta;

import java.util.Scanner;

/**
 *Movimos el constructor vacio pporque no me dejaba usar la fokin clase 
 * @author rafae
 */
public class ScannerProducto {
    
    //
    public Producto nextProducto(){
        Scanner leer = new Scanner(System.in);      
        var producto = new Producto();
        
        System.out.println("Ingrese un codigo de barras: ");
        producto.codigoDeBarras=leer.nextLine();
        System.out.println("Ingrese el nombre del producto: ");
        producto.nombre=leer.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        producto.precio=Float.parseFloat(leer.nextLine());
        System.out.println("Ingrese la categoria: ");
        producto.categoria=leer.nextLine();
        System.out.println("Ingrese el descuento: ");
        producto.setDescuento(Float.parseFloat(leer.nextLine()));
        
        return producto;
    }
}
