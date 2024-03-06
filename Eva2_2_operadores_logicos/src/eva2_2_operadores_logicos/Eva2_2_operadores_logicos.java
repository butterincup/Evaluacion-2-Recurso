/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_2_operadores_logicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean A, B;
        A=false;
        B=false;
        boolean resu;
        
        //operador and --->  && (shift + 6 dos veses)
        resu= A && B;
        System.out.println("resultado and = " + resu);
        
        A=true;
        B=false;
        resu= A && B;
        System.out.println("resultado and = " + resu);
        
        A=true;
        B=true;
        resu= A && B;
        System.out.println("resultado and = " + resu);
        
        //operador or ---> || (a la izquierda del 1)
        A=false;
        B=false;
        resu= A || B;
        System.out.println("resultado or = "+ resu);
        
        A=false;
        B=true;
        resu= A || B;
        System.out.println("resultado or = "+ resu);
        
        A=true;
        B=false;
        resu= A || B;
        System.out.println("resultado or = "+ resu);
        
        //operador not ----> ! (shift + 1)
       A= false;
       resu= !A;
        System.out.println("resultado de not = "+ resu);
        
       A= true;
       resu= !A;
        System.out.println("resultado de not = "+ resu);
        
        //operador igual ---> == (dos =) son solo iguales
        
    }
    
}
