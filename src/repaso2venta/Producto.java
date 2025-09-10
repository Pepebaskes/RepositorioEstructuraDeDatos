
package repaso2venta;
/**
 * 
 * @author rafae
 */

public class Producto {
        String codigoDeBarras;    
        String nombre;
        String categoria;
        float precio;
        private float descuento;
        
        
        public String toString(){
            String renglon = String.format("%-5s %-10s %-10s %-10.2f %-10.2f %-10.2f",codigoDeBarras, nombre, categoria, precio, descuento, getPrecioFinal());
           
            return renglon;        }
        
    public void setDescuento(float descuento){
        this.descuento = descuento < 0 ? 0: descuento;
    }    
        
        public float getPrecioFinal(){
            return precio - descuento;
        }
    }

