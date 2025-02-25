/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Scanner;
public class Campeonato {

public Campeonato(){}
public boolean tomarDatos(){
    
    Scanner scanner = new Scanner(System.in);

        
        int puntosEquipoA = 0;
        int puntosEquipoB = 0;

        
        System.out.println("Sistema de clasificación para el campeonato deportivo");

        
        System.out.println("Ingrese el resultado del partido:");
        System.out.print("Equipo A (ganado, perdido, empatado): ");
        String resultadoA = scanner.nextLine().toLowerCase();

        System.out.print("Equipo B (ganado, perdido, empatado): ");
        String resultadoB = scanner.nextLine().toLowerCase();

       
        switch (resultadoA) {
            case "ganado":
                if (resultadoB.equals("perdido")) {
                    puntosEquipoA += 3;  
                }
                break;
            case "perdido":
                if (resultadoB.equals("ganado")) {
                    puntosEquipoB += 3;  
                }
                break;
            case "empatado":
                if (resultadoB.equals("empatado")) {
                    puntosEquipoA += 1; 
                    puntosEquipoB += 1;
                }
                break;
            default:
                System.out.println("Resultado de Equipo A inválido.");
                break;
        }

        switch (resultadoB) {
            case "ganado":
                if (resultadoA.equals("perdido")) {
                    puntosEquipoB += 3; 
                }
                break;
            case "perdido":
                if (resultadoA.equals("ganado")) {
                    puntosEquipoA += 3;  
                }
                break;
            case "empatado":
                if (resultadoA.equals("empatado")) {
                    puntosEquipoB += 1;  
                    puntosEquipoA += 1;
                }
                break;
            default:
                System.out.println("Resultado de Equipo B inválido.");
                break;
        }

        
        System.out.println("Clasificación actual:");
        System.out.println("Equipo A: " + puntosEquipoA + " puntos");
        System.out.println("Equipo B: " + puntosEquipoB + " puntos");

        
       return true;
    }
}
