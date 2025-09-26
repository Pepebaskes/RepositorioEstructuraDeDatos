
package DeclarandoMetodos;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leern = new Scanner(System.in);
        Operaciones metodos = new Operaciones();
        int opcion;
        
        do {
            System.out.println("1...Mandar Saludo");
            System.out.println("2...Incrementar");
            System.out.println("3...Sumar dos numeros");
            System.out.println("4...Sumar tres numeros");
            System.out.println("5...Comparar numeros");
            System.out.println("6...Salir");
            System.out.println("Seleccione una opcion: ");
            
            opcion=leer.nextInt();
            leer.nextLine();
           
            switch(opcion){
                
                case 1:
                    String nombreA = "";
                    System.out.println("Ingrese un nombre: ");
                    nombreA=leer.nextLine();                   
                    System.out.println(metodos.saludoMayus(nombreA)+" HOLA!");
                    break;
                
                case 2:
                    int inc = 0;
                    System.out.println("Ingrese un numero: ");
                    inc=leern.nextInt();
                    System.out.println("Incremento: "+ metodos.incrementarNum(inc));
                    
                    break;
                    
                case 3:
                    System.out.println("Ingrese primer numero: ");
                    int num1=leer.nextInt();
                    System.out.println("Ingrese segundo numero: ");
                    int num2=leer.nextInt();
                    System.out.println("Suma: "+metodos.suma(num1, num2));
                    break;
                    
                case 4:
                    System.out.println("Ingrese primer numero: ");
                    num1=leer.nextInt();
                    System.out.println("Ingrese segundo numero: ");
                    num2=leer.nextInt();
                    System.out.println("Ingrese tercer numero: ");
                    int num3=leer.nextInt();
                    System.out.println("Suma: "+metodos.suma(num1, num2, num3));
                    break;
                
                case 5:
                    System.out.println("Ingrese primer numero: ");
                    num1=leer.nextInt();
                    System.out.println("Ingrese segundo numero: ");
                    num2=leer.nextInt();
                    System.out.println("Comparacion: "+metodos.compararNum(num1, num2));
                    break;
            }
            
        } while (opcion == 1 || opcion ==2 || opcion ==3 || opcion == 4 || opcion == 5);
       
    }
}
