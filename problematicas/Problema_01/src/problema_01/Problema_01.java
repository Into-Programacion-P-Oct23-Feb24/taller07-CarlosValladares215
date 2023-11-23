/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String posicion;
        String lista = "Listado de Jugadores";
        String acumulador = "";
        int numero = 1;
        int edad;
        double edadTotal = 0;
        double estatura;
        double estaturaTotal = 0;
        String fin;
        boolean bandera = true;
        
        do{
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su posicion en el campo de juego");
            posicion = entrada.nextLine();
            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
            System.out.println("Ingrese su estatura");
            estatura = entrada.nextDouble();
            
            lista = String.format("\n%s\n%d. %s -%s-"
                    + ", edad %d, estatura %.2f",lista,numero, nombre, 
                    posicion,
                    edad,
                    estatura);
            acumulador = String.format("%s \n%d ",acumulador,
                    edad );
            
            numero = numero + 1;
            edadTotal = edadTotal + edad;
            estaturaTotal = estaturaTotal + estatura;
            
            entrada.nextLine();
            System.out.println("¿Desea terminar con la lista de jugadores?"
                    + "si es escriba (x)");
            fin = entrada.nextLine();
            
            if (fin.equals("x")){
                bandera = false;
            }
    }while(bandera);
        edadTotal = edadTotal / numero;
        estaturaTotal = estaturaTotal / numero;
        System.out.printf("%s",lista);
        System.out.printf("\nListados de Edades %s \n",acumulador);
        System.out.printf("Promedio de edades:  %.1f\n",edadTotal);
        System.out.printf("Promedio de estaturas: %.2f \n",estaturaTotal);
    }
                
                
        
    }
    

