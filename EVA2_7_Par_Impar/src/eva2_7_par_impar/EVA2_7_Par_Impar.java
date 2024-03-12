/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_7_Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, divi, resi;
        Scanner sc= new Scanner (System.in);
        System.out.println("introduce el numero a dividir");
        num=sc.nextInt();
        divi=num /2;
        
        System.out.println("divicion entera de "+num +" / 2 = "+ divi);
        
        resi= num%2;
        System.out.println("el residuo de "+num+" % 2 = "+resi);
        
        if (resi==1){ 
            System.out.println(num+" es impar");
        }
        else
            System.out.println(num+" es par");
    }
    
}
