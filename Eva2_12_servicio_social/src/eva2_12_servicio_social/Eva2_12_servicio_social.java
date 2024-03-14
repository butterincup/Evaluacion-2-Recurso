/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_12_servicio_social {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int creditos, semestre;
        Scanner sc=new Scanner (System.in);
        System.out.println("que semestre cursa?");
        semestre = sc.nextInt();
        System.out.println("que creditos llevas?");
        creditos = sc.nextInt();
        /*
        indicar si puede o no realizar el servicio social
        ir en 6to semestre o superior
        tiene al menos 150 creditos
        */
        if (semestre>=6 && creditos>=150){
            System.out.println("Puedes realizar el servicio social");
        }
        else
            System.out.println("No cumples con los requisitos para llevar el sevicio social");
    }
    
}
