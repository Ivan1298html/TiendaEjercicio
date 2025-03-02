/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Scanner;


public class Temperatura {
 
 
 public boolean tomarDatos(){
     Scanner obj=new Scanner(System.in);
     
     double temperaturaMaxima=25.0;
     double temperaturaMinima=18.0;
      String respuesta;
           
     double temperatura;
     
     do {
         System.out.println("Digitar su nombre:");
         String nombre=obj.nextLine();
         
         System.out.println("Digitar su temperatura");
         temperatura= obj.nextDouble();
         
         if (temperatura>=temperaturaMinima  && temperatura<=temperaturaMaxima) {
             System.out.println("su temperatura esta dentro del rango deseado");
            }
         else  {
             System.out.println("su temperatura no esta de los rangos limites");
         }
            System.out.println("Desea ingresar otro libro (si/no):");
            respuesta = obj.next();
     } 
         while (respuesta.equalsIgnoreCase("si"));
         System.out.println("Gracias por usar nuestros servicios.");
 
     
     return true;
     
 }
 
}
