/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_10_operadores_logicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        double moneda, elec;
        moneda = Math.random();
        
        System.out.println("introduce tu eleccion de volado");
        System.out.println("1 = cara y 2= cruz");
        elec=sc.nextDouble();
        System.out.println("Si es mayor a 0.5 es cara");
        System.out.println("el valor de la moneda = "+ moneda);
        // 0.5 para arriba es cara
        
        if(moneda>0.5 && elec==1){
            System.out.println("adivinaste, es cara");
        }
         else
            if (moneda<0.5 && elec==2)
                System.out.println("adivinaste, es cruz");    
            else 
                System.out.println("perdiste");
        
    }
    
}
