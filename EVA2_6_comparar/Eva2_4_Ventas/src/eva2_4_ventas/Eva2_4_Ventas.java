/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_4_Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pieza, CalPie;
        Scanner su=new Scanner  (System.in);
        
        System.out.println("¿Cuantas piezas quieres comprar?");
        pieza=su.nextInt();
        
        if (pieza>1000){
            CalPie=pieza*500;
           
        }
        else
                 CalPie=pieza*800;

        System.out.println("el costo serian = "+ CalPie);
    }
    
}
