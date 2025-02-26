/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Coche {
    public Coche(){}
    
    
    public boolean tomarDatos(){
    
     Scanner scanner = new Scanner(System.in);

        
        String respuesta;

       
        while (true) {
           
            System.out.print("Ingrese la distancia del viaje: ");
            double distancia = scanner.nextDouble();

            
            System.out.print("Ingrese la velocidad coche: ");
            double velocidad = scanner.nextDouble();

            
            double tiempo = distancia / velocidad;

            
            System.out.printf("El tiempo estimado del viaje es: "+ tiempo);

           
            System.out.print("Desea hacer otro viaje (si/no): ");
            respuesta = scanner.next().toLowerCase();

            
            if (!respuesta.equals("si")) {
                break;
            }
        }

        
        System.out.println("Gracias por usar el programa. ¡Buen viaje!");
       
        return true;
    }
}
