/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Restaurante {
    
    public boolean tomarDatos(){
              
        
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Bienvenidos al restaurante PideloDeUna");
        System.out.println("Elije su Platillo");
        System.out.println("1. pastas: 13.000   "+
                           "2. hamburguesas: 15.000"); 
        int platillo=obj.nextInt();
        
                   
        System.out.println("Elije su Bebida");
        System.out.println("1. gaseosa: 13.000   "+
                           "2. jugos naturales: 15.000"); 
        int bebidas=obj.nextInt();
        
            Restaurante.calcularDatos(platillo, bebidas);
            return true;
    }
        
    private static boolean calcularDatos(int platillo, int bebidas){
          
        double pastas=13000;
        double hamburguesas = 15000;
        double gaseosa=13000;
        double jugos=15000;
        double total=0;
        
        
        switch(platillo){
            case 1:
                        total += pastas;
          break;
            case 2:
            total += hamburguesas;
            break;
                
        default:
        System.out.println("Opcion no valida.....");
                    break;
        
        }
        
        switch(bebidas){
            case 1:
          total += gaseosa;
          break;
            case 2:
            total += jugos;
            break;
                
        default:
        System.out.println("Opcion no valida.....");
                    break;
        
        }
        System.out.println("el total es:"+total);
        Restaurante.mostrarDatos(total);
        return true;
    }
  private static void mostrarDatos(double total){
        Scanner obj1=new Scanner(System.in);
        System.out.println("Seleccione el metodo de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de credito");
        System.out.println("3. Cheque");
        System.out.print("Seleccione el metodo de pago (1, 2 o 3): ");
        int metodoPago = obj1.nextInt();

       
        double descuento = 0;
        switch (metodoPago) {
            case 1:  
                descuento = total * 0.10;  
                break;
            case 2:  
                descuento = total * 0.05;  
                break;
            case 3:  
                descuento = 0;  
                break;
            default:
                System.out.println("Metodo de pago inválido.");
                break;
        }
        
        double totalpagar= total- descuento;
        
        System.out.println("El descuento es de: "+descuento);
        System.out.println("El total a pagar es: "+totalpagar );
        System.out.println("GRACIAS POR TU COMPRA");
        
               
    }
        
    }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
