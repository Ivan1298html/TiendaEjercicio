/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;

public class Compras {

    
   public Compras(){
} 
   public boolean tomarDatos(){
       Scanner obj =new Scanner(System.in);
       System.out.println("Digitar su nombre");
       String Nombre=obj.nextLine();
       System.out.println("Selecionar el tipo de producto que desea llevar  "  
               +"Solo digitar la letra inicial en Mayuscula  "  
       +"A: Alimentos  "  
       + "V: Vestimenta  "  
       +"E: Electricos"  
       +"por favor seleccionar 1 opcion");
       String menu=obj.nextLine();
       System.out.println("Digitar la cantidad de productos");
       int cantidad=obj.nextInt();
       System.out.println("Digitar el precio del producto");
       double precio=obj.nextDouble();
            
      Compras.calcularDatos(Nombre, menu, precio, cantidad);
      
      
       return true;
   }
   
   private static boolean calcularDatos(String menu, String Nombre, double precio, int cantidad){
       
       switch (menu){
           case "A": {
               double total=precio*cantidad;
               double descuento=total*0.10;
               double preciototal=total-descuento;
               System.out.println(Nombre);
               System.out.println("Subtotal de la factura es: "+total);
               System.out.println("El descuento de la factura es: "+descuento);
               System.out.println("Total a pagar de la factura es: "+preciototal);
               System.out.println("Su factura tiene un descuento del 10%");
           }
               break; 

           case "V":{
               double total1=precio*cantidad;
               double descuento1=total1*0.05;
               double preciototal1=total1-descuento1;
               System.out.println(Nombre);
               System.out.println("Subtotal de la factura es: "+total1);
               System.out.println("El descuento de la factura es: "+descuento1);
               System.out.println("Total a pagar de la factura es: "+preciototal1);
               System.out.println("Su factura tiene un descuento del 5%");
           }
                  break; 
            case "E":{
                double total2=precio*cantidad;
                System.out.println(Nombre);
                System.out.println("Subtotal de la factura es: "+total2);
                System.out.println("Su factura no tiene descuento");
           }
           break;
           
            default:System.out.println("Eleccion no valida");
       
                     
       }
       return true;
  
      
   }
   
   
       
    
           
   
}




