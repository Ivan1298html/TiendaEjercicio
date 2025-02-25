/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java. util.Scanner;
public class Cajero {
public Cajero(){
}
public boolean tomarDatos(){
    Scanner obj=new Scanner(System.in);
 
        
        double saldo = 1000.00;  
       
        while (true) {
            System.out.println("Saldo disponible: $" + saldo);
            System.out.print("Ingrese el monto que desea retirar: ");
           double monto = obj.nextDouble();
 
     if (monto == 0) {
              break;
            }

            if (monto > saldo) {
                System.out.println("Error: El monto excede el saldo disponible. Intente nuevamente.");
            } else {
                saldo -= monto;
                System.out.println("Retiro exitoso. Su saldo restante es: $" + saldo);
            }
    
}
    return true;
}

}

