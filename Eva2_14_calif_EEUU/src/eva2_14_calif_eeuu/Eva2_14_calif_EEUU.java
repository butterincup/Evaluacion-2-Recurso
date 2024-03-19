/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_14_calif_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cal;
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce su calificacion");
        cal=sc.nextInt();
        
        if ((90<=cal)&&(cal<=100))
            System.out.println("A");
        else if ((80<=cal)&&(cal<=89))
            System.out.println("B");
        else if ((70<=cal)&&(cal<=79))
            System.out.println("C");
        else if ((60<=cal)&&(cal<=69))
            System.out.println("D");
        else if ((0<=cal)&&(cal<=59))
            System.out.println("F");
        else
            System.out.println("introduce un numero valido");
        
        
        
    }
    
}
