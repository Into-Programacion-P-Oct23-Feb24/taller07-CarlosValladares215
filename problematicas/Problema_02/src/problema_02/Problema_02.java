/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // Vatiables
        int secuencia = 2;
        int numero = 0;
        
        // Estructura repetitiva while
        while (numero<110) {
            numero = numero + secuencia;
            secuencia = secuencia + 2;
            System.out.printf("%d \n",numero );
        }
    }
    
}
