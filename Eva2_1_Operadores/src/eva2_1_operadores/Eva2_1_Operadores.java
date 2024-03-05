/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author Usuario
 */
public class Eva2_1_Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // operadores aridmeticos:
        // suma +, resta -, multiplicacion *, divicion /
        
        int num1, num2;
        num1=5;
        num2=3;
        int suma= num1+ num2; //operador de suma +
        /* si en el operador + uno de los terminos es
        una cadema de tecto, todo se conviete a cadena y se unen*/
        System.out.println("la suma es: "+ suma);
        
        //suma de textos
        boolean prueba = true;
        System.out.println("el valor de la prueva es: "+ prueba);
        
        //multiplicacion
        int mult;
        mult= num1*num2;
        System.out.println("el resultado de la multiplicacion es: "+ mult);
        
        //divicion
        int divi= 7/2;
        System.out.println("la divicion de 7/2 es: "+ divi);
        double diviDouble= 7/2.0;// se deve poner uno de los valores en decimal
        System.out.println("la divicion de 7/2 es: "+ diviDouble);
        
        //acomuladores
        //sumas +=, restas -=, multiplicacion *=, divicion /=
        int sumatoria = 0;
        /*sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80;
        sumatoria= sumatoria +80;
        System.out.println("la sumatoria es: "+ sumatoria);*/
        
        sumatoria += 90;//agrega 90
        sumatoria += 80;//agrega 80
        sumatoria += 80;//agrega 80
        System.out.println("la sumatoria es: "+ sumatoria);
        
        //
        sumatoria -= 70;//resta 70
        System.out.println("la sumatoria es: "+ sumatoria);
        
        //
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("multiAcum = "+multiAcum);
        multiAcum *= 5;
        System.out.println("multiAcum = "+multiAcum);
        
    }
    
}
