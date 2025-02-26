/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Impresora {
     public Impresora(){
        
    }
    
    public boolean tomarDatos(){
        Scanner obj=new Scanner(System.in);
        
        int papel=50000;
        
         int imprimir;
        
        
          
        while (papel>0) {                 
            
        System.out.println("Digitar la cantidad de papel a imprimir");
           imprimir=obj.nextInt();
           
                  
            if (imprimir<=papel) {
                papel -= imprimir;
                System.out.println("se han impreso: "+imprimir);
                System.out.println("papel restante: "+ papel);
                
            }else{
                System.out.println("CALMATE RECARGA PAPEL....");
                System.out.println("solo puedes imprimir: "+papel);
            }
            if (papel>0) {
                System.out.println("Deseas imprimir mas paginas (1. si/ 2.no)");
                String respuesta=obj.next().toLowerCase();
            
            
                if (respuesta.equals("si")) {
                    break;
              } 
                 
               
        } 
         
        }
         return true;
            
            
       
            }
                
                   
            }
           
             
        
        
    


