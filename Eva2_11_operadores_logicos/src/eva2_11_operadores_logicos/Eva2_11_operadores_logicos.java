/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_operadores_logicos;

/**
 *
 * @author Usuario
 */
public class Eva2_11_operadores_logicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean hayDinero, hayBuenClima;
        /* para hacer la carne asada se nesesita:
        haya dinero y haya buen clima*/

        hayDinero=false;
        hayBuenClima=false;
        
        System.out.println("1. No hay dinero y no hay buen clima");
        if (hayDinero==true && hayBuenClima==true){
            System.out.println("Se va hacer la carnita asada");
        }
        else 
            System.out.println("buevito estrellado :c");
        
        
        
        hayDinero=false;
        hayBuenClima=true;
        System.out.println("");
        System.out.println("2. No hay dinero y hay buen clima");
        if (hayDinero==true && hayBuenClima==true){
            System.out.println("Se va hacer la carnita asada");
        }
        else 
            System.out.println("buevito estrellado :c");
        
        
        
        hayDinero=true;
        hayBuenClima=false;
        System.out.println("");
        System.out.println("3.  hay dinero y no hay buen clima");
        if (hayDinero==true && hayBuenClima==true){
            System.out.println("Se va hacer la carnita asada");
        }
        else 
            System.out.println("buevito estrellado :c");
        
        
        hayDinero=true;
        hayBuenClima=true;
        System.out.println("");
        System.out.println("4.  hay dinero y  hay buen clima");
        if (hayDinero==true && hayBuenClima==true){
            System.out.println("Se va hacer la carnita asada");
        }
        else 
            System.out.println("buevito estrellado :c");
    }
    
}
