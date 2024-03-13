/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8.pkg5_juego_volado;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_85_juego_volado {

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
        
        //0.5 es la mitad del rngo 
        if (elec==1){
         if (moneda>0.5){
            System.out.println("ganaste");
        }
         else
            System.out.println("perdiste");
        }
        else
            if (elec==2){
                if (moneda>0.5){
            System.out.println("perdiste");
        }
         else
            System.out.println("ganaste");
            }
            else 
                System.out.println("introduce un numero valido");
    
        
        
    }
    
}
