/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class factura {
    String saludocliente="hola cliente..."; 
    public factura(){              
    }
    
    public boolean tomarDatos(){
        Scanner obj=new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre=obj.nextLine();
        System.out.println("producto que desea llevar");
        String producto=obj.nextLine();
        System.out.println("digite la cantidad a llevar");
        int cantidad=obj.nextInt();
        System.out.println("precio unitario");
        double precio=obj.nextDouble();
        System.out.println("eres estudiante"
                + "1:si"
                + "2:no");
        int estudiante=obj.nextInt();
        
        factura.calcularDatos(precio, cantidad, estudiante);
        return true;
        
    }
        public static void calcularDatos(double datoprecio, int datocantidad, int estudiante){
        
            if (estudiante==1) {
                double total=datoprecio*datocantidad;
                double impuesto=total*0.13;
                
                
            }
        
        
        
        }
    
    
    
}
