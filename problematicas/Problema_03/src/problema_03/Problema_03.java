/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Variables
        int numero = 2;
        int aumento = 3;
        int contador = 1;
        
        // do whjle
        do {
            System.out.printf("%d \n", numero);
            numero = numero + aumento;
            aumento = aumento + 2;
            contador = contador + 1;
        } while (contador <= 6);
    }

}
