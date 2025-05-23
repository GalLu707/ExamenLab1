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
        Random alea= new Random();//el import del randoom
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
                    
                    System.out.println("Ingrese de cuantas lineas quiere hacer su piramide");
                    int tamañopira = obj.nextInt();
                    
                    int i,k,j;
                    int numerobase = 1;
                    

                    for (i = 1; i <= tamañopira; i++) {
                        int aumento = 0;
                        for (j = 1; j <= i; j++) {
                            //pone en una sola linea los numeros
                            System.out.print(numerobase + " ");
                            aumento = aumento + numerobase;
                            //tiene que ir aumentando 2 para que sea impar 
                            numerobase = numerobase + 2;
                        }
                        System.out.println("=" + aumento);
                    }
                    
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
                    String ppotpc= "";
                    boolean jugar = false;
                    int contador;
                    
                    while(!jugar){
                      System.out.println("Elija una opcion: piedra, papel o tijera");
                    String opcionppot = obj.next().toLowerCase();
                    int opcionpc = alea.nextInt(3);
                    
                    
                    if(opcionpc==0){
                        ppotpc="piedra";   
                    }else if (opcionpc==1){
                        ppotpc="papel";
                    }else{
                        ppotpc="tijera";
                    }
                        System.out.println("el sistema elijio:" + ppotpc);
                        
                        if(ppotpc.equals(opcionppot)){
                            System.out.println("es un empate!!");
                        }
                    
                    
                    
                    }
                    
                    
                    
                    
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
