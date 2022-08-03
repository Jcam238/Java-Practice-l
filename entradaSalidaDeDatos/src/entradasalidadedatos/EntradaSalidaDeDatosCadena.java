/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradasalidadedatoscadena;

import java.util.Scanner;

/**
 *
 * @author Intel
 */
public class EntradaSalidaDeDatosCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String cadena;
        
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        
        System.out.println("La cadena digitada es: "+cadena);
    }
    
}