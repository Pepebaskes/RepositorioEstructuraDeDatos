
package repaso2venta;
/**
 * 
 * @author rafae
 */

public class Producto {
        String codigoDeBarras;    
        String nombre;
        String categoria;
        double precio;
        private double descuento;
        
        //setter vacio para que me deje moverlo en la clase Scanner producto
    public Producto() {
    }
        
        
        //constructor 
    public Producto(String codigoDeBarras, String nombre, String categoria, double precio, double descuento) {
        this.codigoDeBarras = codigoDeBarras;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descuento = descuento;
    }
    
    public String getCodigo() { return codigoDeBarras; }
        public String getNombre() { return nombre; }
        public double getPrecio() { return precio; }
        public String getCategoria() { return categoria; }
        public double getDescuento() { return descuento; }
        
        
        
        public String toString(){
            String renglon = String.format("%-5s %-10s %-10s %-10.2f %-10.2f %-10.2f",
                                        codigoDeBarras, nombre, categoria, precio, descuento, getPrecioFinal());
           
            return renglon;        }
        
    public void setDescuento(double descuento){
        this.descuento = descuento < 0 ? 0: descuento;
    }    
        
        public double getPrecioFinal(){
            return precio - descuento;
        }
    }

