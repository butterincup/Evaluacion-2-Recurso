/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_13_Else_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner sc= new Scanner (System.in);
        System.out.println("introduce el dua de la semana en numero (1-7): ");
        dia = sc.nextInt();
        
        
        if(dia == 1)
            System.out.println("domingo");
        else if (dia == 2)
                System.out.println("lunes");
        else if (dia == 3)
                System.out.println("martes");
        else if (dia == 4)
                System.out.println("miercoles");
        else if (dia == 5)
                System.out.println("jueves");
        else if (dia == 6)
                System.out.println("viernes");
        else if (dia == 7)
                System.out.println("sabado");
        
        else
            System.out.println("error, introduce un numero valido");
        
    }
    
}
