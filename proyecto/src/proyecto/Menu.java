/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Scanner;

public class Menu {
    public Menu(){}
    
    public boolean tomarDatos(){
        
      
        Scanner scanner = new Scanner(System.in);

       
        double precioHamburguesa = 5000;
        double precioPapas = 6000;
        double precioBebida = 6000;
        
        
        double total = 0;
        String respuesta;
        
        System.out.println("Bienvenido al menu de comidas rapidas.");
        
       
        do {
           
            System.out.println("Opciones del menu:");
            System.out.println("1. Hamburguesa - $5000");
            System.out.println("2. Papas fritas - $6000");
            System.out.println("3. Bebida - $6000");
            System.out.println("4. Finalizar pedido");
            
            
            System.out.print("Digitar su pedido: ");
            int opcion = scanner.nextInt();
            
            
            switch (opcion) {
                case 1:
                    total += precioHamburguesa;
                    System.out.println("Has añadido una Hamburguesa al pedido.");
                    break;
                case 2:
                    total += precioPapas;
                    System.out.println("Has añadido Papas fritas al pedido.");
                    break;
                case 3:
                    total += precioBebida;
                    System.out.println("Has añadido una Bebida al pedido.");
                    break;
                case 4:
                    System.out.println("Finalizando pedido...");
                    break;
                default:
                    System.out.println("Opción no valida. Por favor, elija una opcion del menu.");
            }
            
            
            if (opcion != 4) {
                System.out.print("Desea añadir mas productos al pedido (si/no): ");
                respuesta = scanner.next();
            } else {
                respuesta = "no";
            }
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        
        System.out.println("Total de su pedido: " + total);
        System.out.println("Gracias por su compra .....Que disfrute su comida");  
        
        
        
        
        return true;
    }
    
}
