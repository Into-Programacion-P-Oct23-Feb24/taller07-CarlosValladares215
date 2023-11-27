/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //Variables
        String acumulador = "1";
        String signo;
        int aumento = 1;
        int contador = 0;
        
        // do while
        do {
            aumento = aumento + 2;
            if (contador % 2 == 0) {
                signo = "-";
            } else {
                signo = "+";
            }
            acumulador = String.format("%s %s 1/%d",
                     acumulador,
                     signo,
                     aumento);
            contador = contador + 1;
        } while (contador < 7);
        
        // Se presenta por pantalla el resultado
        System.out.printf("%s \n", acumulador);
    }

}
