/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Scanner;

public class Pelicula {

    private static boolean recomendacion;
    public Pelicula(){
    }
    
    public boolean tomarDatos(){
    
    Scanner obj=new Scanner(System.in);
    System.out.println("Digite su Nombre");
    String Nombre=obj.nextLine();
    
        System.out.println("Digitar su edad");
        int edad=obj.nextInt();
        
    Pelicula.calcularDatos(Nombre,edad);
    return true;
    }
    
    private static boolean calcularDatos(String Nombre, int edad){
        String recomendacion;
        switch (edad){
        case 1:  case 2:case 3: case 4:case 5:case 6: case 7: 
        recomendacion="Se le recomienda las peliculas animadas";
        break;
        case 8: case 9: case 10:case 11:case 12:case 13:case 14: case 15: case 16: case 17:
        recomendacion="Se le recomienda las peliculas animadas, aventuras y comedias";
        break;
        case 18: case 19: case 20:case 21:case 22:case 23:case 24: case 25: case 26: case 27:
        case 28:  case 29:case 30:
        recomendacion="Se le recomienda las peliculas clasica, drama, comedia y ciencia ficcion";
        break;
        default:
        recomendacion = "Recomendamos películas clásicas y dramas que pueden ser de su interés.";
        break;
          }
       
        
        System.out.println("Señor usuario: "+recomendacion);
        return true;
         
    }
    }

