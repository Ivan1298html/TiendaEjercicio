/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Libros {
    public Libros(){}
    public boolean tomarDatos(){
       
        Scanner obj = new Scanner(System.in);
        
        
        StringBuilder listaLibros = new StringBuilder();
        
        
        String respuesta;
        
       
        do {
           
            System.out.println("Ingrese el título del libro:");
            String titulo = obj.next();
            
            System.out.println("Ingrese el autor del libro:");
            String autor = obj.nextLine();
            
            System.out.println("Ingrese el numero de páginas del libro:");
            int paginas = obj.nextInt();
            obj.nextLine(); 
            
           
            listaLibros.append("Titulo: ").append(titulo).append("\n");
            listaLibros.append("Autor: ").append(autor).append("\n");
            listaLibros.append("Paginas: ").append(paginas).append("\n");
            listaLibros.append("-------------------------------\n");
            
            
            System.out.println("Desea ingresar otro libro (si/no):");
            respuesta = obj.next();
            
           
            
             
        
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("/nLista de libros registrados:");
        System.out.println(listaLibros.toString());
       
        
        
        return true;
    }
    
}
