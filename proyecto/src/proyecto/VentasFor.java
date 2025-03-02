/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class VentasFor {
    public boolean tomarDatos(){
    
  Scanner obj=new Scanner(System.in);
  

  double totalf=0;
  double total=0;
        System.out.println("cuantos productos vas a ingresar");
      int num=obj.nextInt();
    
        for (int i = 0; i < num; i++) { 
        System.out.println("Digitar producto");
        String producto=obj.next();
        System.out.println("Digitar precios");
        double precio=obj.nextDouble();
        System.out.println("Digitar cantidad");
        int cantidad=obj.nextInt();
       total=precio*cantidad;    
       totalf+=total;
    
        System.out.println("PRODUCTO: "+producto);
        System.out.println("PRECIO: "+precio);
        System.out.println("CANTIDAD: "+cantidad);
        System.out.println("TOTAL VENTA: "+total);
    
  
        
      }  
   
    
    System.out.println("El monto total de ventas es : "+totalf);
    
    
    
    
    return true;
}
    
}
