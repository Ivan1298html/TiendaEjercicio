/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Vehiculos {
  
    
    
    public boolean tomarDatos(){
      Scanner obj = new Scanner(System.in);

        
        System.out.print("Ingrese el numero de vehiculos que ingresaran al parqueadero: ");
        int numero = obj.nextInt();
          

        
        String[] placas = new String[numero];
        String[] horasIngreso = new String[numero];

        
        for (int i = 0; i < numero; i++) {
            System.out.print("Ingrese la placa del vehiculo #" + (i + 1) + ": ");
            placas[i] = obj.next();

            System.out.print("Ingrese la hora de ingreso del vehiculo #" + (i + 1) + " (HH:MM): ");
            horasIngreso[i] = obj.next();
        }

        
        System.out.println("\nResumen de vehiculos registrados:");
        for (int i = 0; i < numero; i++) {
            System.out.println("Vehiculo #" + (i + 1) + " - Placa: " + placas[i] + " | Hora de ingreso: " + horasIngreso[i]);
        }   
        
     return true;   
    }
}
