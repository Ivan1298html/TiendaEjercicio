/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class IMC {
    public IMC(){
    }

public boolean tomarDatos(){
    Scanner obj =new Scanner(System.in);
       System.out.println("Digitar su nombre");
       String Nombre=obj.nextLine();
       
       System.out.println("Digitar su peso corporal");
       double peso=obj.nextDouble();
       System.out.println("Digitar su altura corpoal");
       double altura=obj.nextDouble();
            
      IMC.calcularDatos(peso, altura);
      
      
       return true;
   }
   
   private static boolean calcularDatos( double peso, double altura){
       
       double categoria =peso/ (altura*altura);
       
       if (categoria<18.5) {
           System.out.println("Su indice de masa corpotal es bajo "+categoria);
       }
       else if (categoria>18.5 & categoria<24.9) {
           System.out.println("Su indice de masa corpotal es normal "+categoria);
       }
        else if (categoria>24.9 & categoria<29.9) {
           System.out.println("Su indice de masa corpotal es sobre peso "+categoria);
         
        }
        else if (categoria>29.9 & categoria<29.90) {
           System.out.println("Su indice de masa corpotal es obesidad "+categoria);
        }
        else{
            System.out.println("Empiece hacer Ejercicio");
        }
     
    
    
    
    return true;
    
}




}





