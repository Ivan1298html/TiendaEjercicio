/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Scanner;
public class Materias {
   public Materias(){} 
   
   
   public boolean tomarDatos(){
    Scanner obj=new Scanner(System.in);
    double total=0;
    String resultado;
    
       do {
           System.out.println("Digitar nombre del estudiante");
           String nombre=obj.nextLine();
           System.out.println("Digitar el nombre de la Materia");
           String materia=obj.nextLine();
           
           System.out.println("Digitar primer resultado");
           int R1=obj.nextInt();
           System.out.println("Digitar segundo resultado");
           int R2=obj.nextInt();
           System.out.println("Digitar tercer resultado");
           int R3=obj.nextInt();
           System.out.println("Digitar cuarto resultado");
           int R4=obj.nextInt();
           
           
           total=(R1+R2+R3+R4)/4;
           System.out.println("su resultado es: "+total);
           
           if (total>70) {
               System.out.println("HAS APROBADO"); 
           }
           else{
               System.out.println("NO HAS APROBADO");
           }
           System.out.println("Deseas ingresar mas resultados si/no");
           resultado=obj.next();
           
       } while (resultado.equalsIgnoreCase("si"));
       System.out.println("Gracias por usar nuestros servicios");
       
       
       return true;
   }
}
