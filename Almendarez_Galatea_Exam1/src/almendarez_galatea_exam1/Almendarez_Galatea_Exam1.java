/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almendarez_galatea_exam1;

/**
 *
 * @author USER
 */

import java.util.Scanner;
import java.util.Random;
        
public class Almendarez_Galatea_Exam1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        obj.useDelimiter("\n");
        int opcionU=0;
        
        while(opcionU !=5){
          System.out.println("----MENU----");
            System.out.println("1. PIRAMIDE");
            System.out.println("2. CLAVE");
            System.out.println("3. JUEGO DE PIEDRA; PAPEL Y TIJERA");
            System.out.println("4. ADIVINAR");
            System.out.println("5: SALIR");

            System.out.println("Ingrese la opcion a la que desea entrar:");
            opcionU = obj.nextInt();
            
            //switch para ingresar a las opciones 
            switch(opcionU){
                case 1:
                    System.out.println("---------------");
                    System.out.println("    PIRAMIDE   ");
                    System.out.println("---------------");
                    
                    break;
                case 2:
                    System.out.println("---------------");
                    System.out.println("     CLAVE     ");
                    System.out.println("---------------");
                    
                    break;
                case 3:
                    System.out.println("---------------");
                    System.out.println("     JUEGO     ");
                    System.out.println(" piedra, papel ");
                    System.out.println("    o tijera   ");
                    System.out.println("---------------");
                    
                    break;
                case 4:
                    System.out.println("---------------");
                    System.out.println("    ADIVINAR   ");
                    System.out.println("---------------");
                    
                    break;
                case 5:
                    System.out.println("Saliendo del sistema");
                    
            }
     
        }
            
      
        
        
  
   
    }
}
