/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.ejerciciooperaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class EjercicioOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un programa que calcule e imprima la suma de tres califiaciones.
        
        Scanner entrada = new Scanner (System.in);
        float cal1, cal2, cal3, suma;
        
        System.out.println("La primera calificaciòn es: ");
        cal1=entrada.nextFloat();
        System.out.println("La segunda calificacion es: ");
        cal2=entrada.nextFloat();
        System.out.println("La tercera calificacion es: ");
        cal3=entrada.nextFloat();
        
        suma=cal1+cal2+cal3;
        
        System.out.println("La suma de las calificaciones es: "+suma);
        
    }
    
}
