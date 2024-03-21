/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_17_Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año , resi,resi2,resi3;
        
        Scanner sc =new Scanner (System.in);
        System.out.println("ingrece el año");
        año=sc.nextInt();
        resi=año%4;
        
        resi2=año%100;
        resi3=año%400;
                
        if (resi==0){
                if(resi2!=0)
        System.out.println("es bisiesto");
                else if (resi2 == 0)
                    if (resi3==0)
                        System.out.println("es bisiesto");
                  
                        
                        }else
            System.out.println("no es bisiesto");
        
        
        
    }
    
}
