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
        System.out.println("eres estudiante "
                + "1:si "
                + "2:no");
        int estudiante=obj.nextInt();
        
        
        
        double totalpagar= factura.calcularDatos(precio, cantidad, estudiante); 
      
        
        factura.mostrarResultados(nombre, producto,  totalpagar, cantidad, estudiante);
        return true;
        
        
        
       
    }
        private static double calcularDatos(double datoprecio, int datocantidad, int estudiante){
        double total=0;
        double impuesto=0;
        double totalpagar=0;
        
            if (estudiante==1) {
                total=datoprecio*datocantidad;
                 impuesto=total*0.05;
                 totalpagar=total+impuesto;
                
                
                }else{
               total=datoprecio*datocantidad;
              impuesto=total*0.13;
               totalpagar=total+impuesto;
               
                }
            
           return totalpagar;
            
            }
        
        private static void mostrarResultados(String nombre, String producto, double totalpagar, int cantidad, int estudiante){
                if (estudiante==1) {
                    System.out.println("nombre: "+nombre);
                    System.out.println("producto: "+producto);
                    System.out.println("cantidad: "+cantidad);
                    System.out.println("estudiante: "+estudiante);
                   System.out.println("el total de su factura es:"+ totalpagar);
            }
                else{
        
                System.out.println("nombre: "+nombre);
                    System.out.println("producto: "+producto);
                    System.out.println("cantidad: "+cantidad);
                    System.out.println("estudiante: "+estudiante);
                    System.out.println("el total de su factura es:"+ totalpagar);
    
                }
        }
}
