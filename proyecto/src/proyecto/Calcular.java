/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Scanner;
public class Calcular {
    public boolean tomarDatos(){
        
        
        Scanner obj=new Scanner(System.in);
        int totalsuma=0;
        
        
        System.out.println("Digitar cuantos numeros desea sumar");  
        int lista=obj.nextInt();
        
        
        int []suma=new int[lista];
        for (int i = 0; i < lista; i++) {
        System.out.println("Digitar la lista de numeros "+(i+1)+": " );
        suma[i]=obj.nextInt();
        totalsuma +=suma[i];   
           
        }
        System.out.println("Lista de numeros son: ");  
        for (int j = 0; j < lista; j++) {
        System.out.println(suma[j]);
            
        
        }
        
       System.out.println("TOTAL DE LA LISTA ES: "+totalsuma);
        
        
        
        
        
        
        
        return true;
    }
}
