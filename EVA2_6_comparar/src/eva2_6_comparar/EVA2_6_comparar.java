/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_comparar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_6_comparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner sc1=new Scanner (System.in);
        
        System.out.println("ingrece el primer numreo");
        num1=sc1.nextInt();
        System.out.println("ingrece el segundo numero");
        num2=sc1.nextInt();
        
        if (num1>num2){
            System.out.println("El mas grande es: "+num1);
        }
        else{
            if (num1<num2){ 
                System.out.println("El mas grande es: "+num2);
            }
        }
            System.out.println("ninguno es mas grande, son iguales" );
        
        
    }
    
}
