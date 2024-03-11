/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_5_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("introduce la temperatura en (°c)");
        temp=sc.nextInt();
        //si la temperatura es mayor a 22°, se enciende el clima
        if (temp>22){ 
            System.out.println("ENCIENDE EL AIRE");
        }
        else 
            System.out.println("EL AIRE NO SE ENCIENDE");
    }
    
}
