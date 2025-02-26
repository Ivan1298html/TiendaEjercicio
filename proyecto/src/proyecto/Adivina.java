/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Random;
import java.util.Scanner;


public class Adivina {
    public boolean tomarDatos(){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        
        
        int intento;
              
        System.out.println("Bienvenido al juego de adivinanza");
        System.out.println("Estoy pensando en un numero entre 1 y 100");
        System.out.println("Intenta adivinarlo");
        
        
        while (true) {
            System.out.print("Digita tu numero: ");
            intento = scanner.nextInt();
            
            
            if (intento < numeroAleatorio) {
                System.out.println("El numero es mayor. Intenta de nuevo");
            } else if (intento > numeroAleatorio) {
                System.out.println("El numero es menor. Intenta de nuevo");
            } else {
                System.out.println("Felicidades Adivinaste el numero.");
                break; 
            }
        }
        
        
        
        
        
        return true;
        
    }
}
