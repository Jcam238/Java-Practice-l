/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Intel
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus
        //horas semanales trabajadas y de su salario por hora. 
        
        int horas;
        float salarioH, salarioS;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Cuánto gana el empleado por hora: ");
        salarioH = entrada.nextFloat();
        System.out.println("Cuántas horas trabajó el empleado esta semana: ");
        horas = entrada.nextInt();
        
        salarioS = salarioH*horas;
        
        System.out.println("El empleado debe cobrar: "+salarioS);
    }
    
}
