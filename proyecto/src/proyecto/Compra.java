/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Compra {
    public Compra(){
        
    }
    
    public boolean tomarDatos(){
        Scanner obj=new Scanner(System.in);
        double costoTotal=0;
        int agregar=0;
        
        
          
        while (agregar!=2) {      
           
                        
            System.out.println("Digitar el producto");
            String producto=obj.nextLine();
            System.out.println("Digitar el precio");
            double precio=obj.nextDouble();
            System.out.println("Digitar la cantidad");
            int cantidad=obj.nextInt();
                   
          double total=precio*cantidad;
          costoTotal += total;
          
            
            System.out.println("Total de la factura: "+total);
            System.out.println("Total a pagar es: "+ costoTotal);
            
            System.out.println("Desea agregar producto 1.si 2.no");
            agregar=obj.nextInt();
            switch (agregar) {
                case 1:
                    System.out.println("Dgite su producto");
                    
                    break;
                case 2:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion erronea");
            }
           
        }       
        return true;
        
    }
}
