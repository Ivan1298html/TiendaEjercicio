/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Contactos {
    
    
    public boolean tomarDatos(){
        Scanner obj=new Scanner(System.in);
        
        
        System.out.println("cuantos contactos vas a registrar");
        int contacto=obj.nextInt();
        
        String[] nombre=new String[contacto];
        String[] telefono=new String[contacto];
        
        for (int i = 0; i < contacto; i++) {
            System.out.println("Digitar el nombre: "+(i+1) +": ");
            nombre[i]=obj.next();
            System.out.println("Digitar el telefono: "+(i+1)+":" );
            telefono[i]=obj.next();
            
            
            
            System.out.println("\nListado de los contactos");
            for (int j = 0; j < contacto; j++) {
                System.out.println("nombre: "+ nombre[j]+ "| " +"telefono: "+telefono[j]); 
            }
        }
        
        
        
        
        
        
        
        return true;
    }
    
}
