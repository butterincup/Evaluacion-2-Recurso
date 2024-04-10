/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_for;

/**
 *
 * @author Usuario
 */
public class Eva2_18_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //     Inicio; condicion; incremento/decremento
        for(int i = 1;   i <= 10; i++){
            /*llaves son opciponales, usalas cuando
            tengas mas de una intruccion a repetir*/
            System.out.print(i + ", ");
        }
        System.out.println("");
        for(int i = 10;   i >= 1; i--){
            /*llaves son opciponales, usalas cuando
            tengas mas de una intruccion a repetir*/
            System.out.print(i + ", ");
        }
        System.out.println("");
        //imprimir los numeros pares del 0-100
        for(int i = 0; i<=100; i+=2){
            System.out.print(i + ", ");    
        }
        //NOTA IMPORTANTE EL PRINT SE IMPRIME 51 vezes (PREGUNTA DE EXAMEN)
    }
    
}
