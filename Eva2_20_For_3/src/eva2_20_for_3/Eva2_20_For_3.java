/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_20_For_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  rep, cant, cant2;
        String men;
        Scanner sc= new Scanner (System.in);
        
        System.out.println("ingrece el mensaje");
        men=sc.nextLine();
        System.out.println("Cuantas veses repetir el mensaje");
        rep=sc.nextInt();
        
        for (int i = 1; i <= rep; i++) {
            
            System.out.println(men);
            
        }
        
        System.out.println("ingrece la cantidad para la sumatoria");
        cant=sc.nextInt();
        int sumatoria=0;
        for(int i = 1; i<=cant;i++){
            sumatoria = sumatoria + i;
            System.out.println(sumatoria);
        }
        System.out.println("ingrece la cantidad de filas a imprimir");
        cant2=sc.nextInt();
        for (int i = 1; i <= cant2; i++) {//Filas
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
               
                }
            System.out.println("");
            }
        for (int i = cant2; i >= 1; i--) {//Filas
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
               
                }
            System.out.println("");
            }
        
        
            
            
        }
        
        
        
    }
    

