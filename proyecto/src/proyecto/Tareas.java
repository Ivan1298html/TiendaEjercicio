/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Tareas {
   public Tareas(){}
   public boolean tomarDatos(){
   Scanner obj =new Scanner(System.in);
   StringBuilder listadoTareas = new StringBuilder();
   String respuesta;
   
   
    do {
    System.out.println("Digitar tarea por digitar");
    String tarea=obj.next();
    System.out.println("Digitar fechas de vencimiento");
    String fecha = obj.nextLine();
    System.out.println("Descripcion de la tarea");
    String descripcion=obj.nextLine();
    
    
    listadoTareas.append("tarea: ").append(tarea).append("\n");
    listadoTareas.append("fecha: ").append(fecha).append("\n");
    listadoTareas.append("descripcion:").append(descripcion).append("\n");
    listadoTareas.append("-------------------------------\n");        
    System.out.println(" Desea ingresar mas tareas (si/no)");      
    respuesta=obj.next();
                   
    } while (respuesta.equalsIgnoreCase("si"));
       System.out.println("Gracias por usar nuestros servicios");
       System.out.println("\n lista de tareas");
       System.out.println(listadoTareas.toString());
       
       return true;
   
    
   }
   
}
