/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25.ejercicio_7.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Hacer un programa que tome dos números y diga si ambos son pares o impares;
        */
        
        float num1, num2;
        
        num1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número: "));
        num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        
        if(num1%2==0 && num2%2==0){
            JOptionPane.showMessageDialog(null, "Ambos números "+num1+" y "+num2+" son pares.");
        }
        if(num1%2!=0 && num2%2==0){
            JOptionPane.showMessageDialog(null, num1+" es un número impar, "+num2+" es un número par.");
        }
        if(num1%2==0 && num2%2!=0){
            JOptionPane.showMessageDialog(null, num1+" es un número par, "+num2+" es un número impar.");
        }
        if(num1%2!=0 && num2%2!=0){
            JOptionPane.showMessageDialog(null, "Ambos números "+num1+" y "+num2+" son impares.");
        }
    }
    
}
