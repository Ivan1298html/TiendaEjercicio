/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Scanner;
public class Asensor {
    String saludo="bienvenido al Asensor";

    public Asensor(){
    }
  
     public boolean tomarDatos(){
            Scanner obj=new Scanner(System.in);
            System.out.println("ingresar el piso que desea ir: 1 al 10");
            int piso=obj.nextInt();
            System.out.println("ingresar el peso corporal");
            int peso=obj.nextInt();
            System.out.println("ingresar la temperatura corporal");
            int temperatura=obj.nextInt();
            
            Asensor.calcularDatos(piso,peso, temperatura);
            return true;
        }
            
         private static boolean calcularDatos(int piso,int peso, int temperatura){
             if (piso>1 & piso<10) {
                 System.out.println("el piso es valido");
             }else{
                 System.out.println("error el piso no es valido");
             }
             if (peso>100){
                 System.out.println("el peso esta dentro de los limites");
             }
             else{
                 System.out.println("error no puede entrar");
             
             }
             if(temperatura>=18 & temperatura<=25){
                 System.out.println("puede ingresar al Asensor");
             }
             else{
                 System.out.println("error no puede ingresar al Asensor");
       
             }
         return true;
         }
}

        
    

