/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_15_Comparar_Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dia;
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce el dia de la semana");
        dia = sc.nextLine();
        
        if (dia.equals("lunes"))
            System.out.println("2");
        
        else if (dia.equals("martes"))
            System.out.println("3");
        else if (dia.equals("miercoles"))
            System.out.println("4");
        else if (dia.equals("jueves"))
            System.out.println("5");
        else if (dia.equals("viernes"))
            System.out.println("6");
        else if (dia.equals("savado"))
            System.out.println("7");
        else if (dia.equals("domingo"))
            System.out.println("1");
        else 
            System.out.println("ingrece un dia valido ");
    }
    
}
