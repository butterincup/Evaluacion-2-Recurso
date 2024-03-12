/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_volado;

/**
 *
 * @author Usuario
 */
public class EVA2_8_volado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // numero aleatorio en java:
        // valores entre o y 1.
        
        double moneda;
        moneda = Math.random();
        
        System.out.println("el valor de la moneda = "+ moneda);
        
        //0.5 es la mitad del rngo 
        if (moneda>0.5){
            System.out.println("CARA");
        }
         else
            System.out.println("CRUZ");
                
    }
    
}
