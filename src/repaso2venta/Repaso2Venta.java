package repaso2venta;

import java.util.Scanner;

public class Repaso2Venta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScannerProducto leer = new ScannerProducto();
        Producto[] inventario = new Producto[10];
        int posicion = 0; // sirve para ver donde hay un lugar libre
        int opcion = 0;

        do {
            System.out.println("1...Agregar producto");
            System.out.println("2...Imprimir en orden natural");
            System.out.println("3...Imprimir en orden inverso");
            System.out.println("4...Buscar producto");
            System.out.println("5...Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    if (posicion < inventario.length) {
                        inventario[posicion] = leer.nextProducto();
                        System.out.println(inventario[posicion]);
                        posicion++;
                    } else {
                        System.out.println("Inventario lleno");
                    }
                    break;
                case 2:
                    imprime(inventario, true);
                    break;
                case 3:
                    imprimeReversa(inventario, true);
                    break;
                case 4:
                         System.out.println("Ingrese el codigo de barras para buscar el producto: ");
                         String codigo = sc.nextLine();
                            buscarProducto(inventario, codigo);
                             break;
            }
        } while (opcion != 5);
    }

    public static void imprime(Producto[] inventario, boolean isInverso) {
        drawLinea();
        System.out.println("Inventario ingreso:");
        drawLinea();

        
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s\n",
                "COD", "PRODUCTO", "CATEGORIA", "PRECIO", "DESCUENTO", "TOTAL");
        drawLinea();

        // ciclo para imprimir cada producto
        for (int i = 0; i < inventario.length; i++) {
            Producto producto = inventario[i];
            if (producto != null) {
                System.out.println(producto); // usa el tost4ring de la clase Producto
            }
        }
    }

    public static void imprimeReversa(Producto[] inventario, boolean isInverso) {
        drawLinea();
        System.out.println("Inventario ingreso:");
        drawLinea();

        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s\n",
                "COD", "PRODUCTO", "CATEGORIA", "PRECIO", "DESCUENTO", "TOTAL");
        drawLinea();

        // iclo para imprimir en orden inverso
        for (int i = inventario.length - 1; i >= 0; i--) {
            Producto producto = inventario[i];
            if (producto != null) {
                System.out.println(producto);
            }
        }
    }

    public static void drawLinea() {
        for (int i = 0; i < 48; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public static void buscarProducto(Producto[] inventario, String codigoBuscado) {
        boolean buscado = false;

        for (int i = 0; i < inventario.length; i++) {//recorremos el arreglo
            Producto producto = inventario[i]; //sacamos un producto en la posición de i del arreglo
            if (producto != null && producto.codigoDeBarras.equalsIgnoreCase(codigoBuscado)) { //condición que nos muestra que si el producto es diferente al null y el codigo de barras que saque codigo buscado
             System.out.println("El producto es:");
                System.out.println(producto); // saca directo de el tostring
                buscado = true;
             break; // si solo quiero que solo muestre el primero que coincida
        }
    }

        if (!buscado) {
            System.out.println("Codigo inexistente.");
    }
}
}


