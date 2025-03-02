/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Operaciones {
    
    public boolean tomarDatos(){
    Scanner obj = new Scanner(System.in);

       
        System.out.print("Cantidad de  productos desea agregar a su carrito ");
        int cantidad = obj.nextInt();
        

        
        String[] productos = new String[cantidad];
        double[] precios = new double[cantidad];
        double totalCompra = 0;

        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Digitar el nombre del producto #" + (i + 1) + ": ");
            productos[i] = obj.next();

            System.out.print("Digitar el precio del producto #" + (i + 1) + ": ");
            precios[i] = obj.nextDouble();
              

            
            totalCompra += precios[i];
        }

        
        System.out.println("\nResumen de su compra:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Producto: " + productos[i] + " | Precio: $" + precios[i]);
        }

        
        System.out.println("\nTotal de la compra: $" + totalCompra);    
        
        
        
        return true;
    }
    
}
