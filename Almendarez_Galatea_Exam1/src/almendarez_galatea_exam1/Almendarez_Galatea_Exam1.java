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
                case 1://-------------------------------------------------------------------------------------------------------
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
                case 2: //-------------------------------------------------------------------------------------------------------
                    System.out.println("---------------");
                    System.out.println("     CLAVE     ");
                    System.out.println("---------------");

                    //minimenu de cifrar
                    System.out.println("1.cifrar");
                    System.out.println("2.descifrar");

                    System.out.println("Que desea hacer?");
                    int opci = obj.nextInt();
                    switch (opci) {
                        case 1:
                            System.out.println("Ingrese la palabra que desea cifrar:");
                            String cifrarmen= obj.next();
                           String cifrado="";
                           for(int ini=0; ini<cifrarmen.length(); ini++){
                                char d = cifrarmen.charAt(ini);
                                if(Character.isLowerCase(d)){
                                    cifrado+=(char)('z'-(d-'a'));   
                                }else if(Character.isUpperCase(d)){
                                    cifrado+=(char)('Z'-(d-'A'));
                                }else{
                                    cifrado+= d;
                                }
                            }
                            System.out.println("su mensaje descifrado es: "+ cifrado);

                           
                           
                            
                            break;
                            
                            
                        case 2:
                            System.out.println("Ingrese la palabra que desea descifrar:");
                            String descifrarmen= obj.next();
                            String guarda="";
                            
                           // char d = descifrarmen.charAt(ini);
                            
                            for(int ini=0; ini<descifrarmen.length(); ini++){
                                char d = descifrarmen.charAt(ini);
                                if(Character.isLowerCase(d)){
                                    guarda+=(char)('z'-(d-'a'));   
                                }else if(Character.isUpperCase(d)){
                                    guarda+=(char)('Z'-(d-'A'));
                                }else{
                                    descifrarmen+= d;
                                }
                            }
                            System.out.println("su mensaje descifrado es: "+ guarda);

                            break;
                        default:

                          
                                System.out.println("opcion invalida :(");
                               
                                break;

               

                case 3://-------------------------------------------------------------------------------------------------------
                    System.out.println("---------------");
                    System.out.println("     JUEGO     ");
                    System.out.println(" piedra, papel ");
                    System.out.println("    o tijera   ");
                    System.out.println("---------------");
                    
                    String ppotpc= "";//opcion que elije el sistema
                    boolean jugar = false;
                    
                    while(!jugar){
                      System.out.println("Elija una opcion: piedra, papel o tijera");
                    String opcionppot = obj.next().toLowerCase(); //opcion usuario
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
                        }else if(opcionppot.equals("piedra") &&  ppotpc.equals("tijera") ||opcionppot.equals("papel") &&  ppotpc.equals("piedra") ||opcionppot.equals("tijera") &&  ppotpc.equals("papel")){
                            System.out.println("GANASTE!!");
                        }else{
                            System.out.println("perdiste :(");
                        }
                        System.out.println("desea jugar otra vez?(si/no)");
                        String otravez= obj.next().toLowerCase();
                        if(otravez.equals("si")){
                            System.out.println("empezando otra partida");
                        }else if(otravez.equals("no")){
                            jugar= true;
                        }
                    
                    
                    }   
                    
                    break;
                case 4://-------------------------------------------------------------------------------------------------------
                    System.out.println("---------------");
                    System.out.println("    ADIVINAR   ");
                    System.out.println("---------------");
                    int numeropro= alea.nextInt(101);//agarra hasta el 100 yuju eleccion de la pc
                    int contador=10;
                    
                    System.out.println("adivine el numero que elijio el sistema en 10 intentos o menos(0 al 100)");
                    int adiusu= obj.nextInt();//numero del usuario
                   
                    
                    while(adiusu!= numeropro){
                       
                       if(adiusu>numeropro){
                           System.out.println("el numero que ingreso es mayor al numero que el sistema eligio");
                           contador--;
                           
                           
                           System.out.println("tiene " + contador + " intentos");
                           System.out.println("vuelva a ingresar un numero:");
                          adiusu= obj.nextInt();
                                
                       } else if (adiusu<numeropro){
                           System.out.println("el numero que ingreso es menor al numero que el sistema eligio");
                           contador--;
                           
                           System.out.println("tiene  " + contador + " intentos");
                           System.out.println("vuelva a ingresar un numero:");
                          adiusu= obj.nextInt();
                       }
                      if(adiusu==numeropro){
                          System.out.println("GANASTE!! ");
                          System.out.println("el numero que el sistema elijio fue " +numeropro );
                   
                      }
                      if(contador==1){
                          System.out.println("limite de intentos excedido");
                          System.out.println("Perdio :(");
                          break;
                      }
                          

                      
                 
                    
                    }    
                    
                    
                    
                    
                    
                    break;
                case 5://-------------------------------------------------------------------------------------------------------
                    System.out.println("Saliendo del sistema");
                    
            }
     
        }
            
      
        
        
  
   
    }
}}
