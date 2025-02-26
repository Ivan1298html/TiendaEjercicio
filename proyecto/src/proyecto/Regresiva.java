/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
public class Regresiva {
    public Regresiva(){}
    
    
    public boolean tomarDatos(){
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digitar numero positivo: ");
        int numero = scanner.nextInt();            
            while (numero >= 0) {
                System.out.println(numero);
                numero--; 
            }
           
            System.out.println("Tiempo cumplido");
        
        return true;
        
    }
}
