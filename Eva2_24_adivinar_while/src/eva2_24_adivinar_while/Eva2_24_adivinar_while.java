/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_24_adivinar_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        int num=5; //numero que tiene que adivinar
        int valor = 0; //valor para almacenar lo que capture el usuario
        Scanner sc=new Scanner (System.in);
        
            
        while(valor != num){
        System.out.println("¿Cual es el numero? (entre el 1 al 10)");
            valor=sc.nextInt();
       
    }
        System.out.println("ADIVINASTE!!");
    }
    
}
