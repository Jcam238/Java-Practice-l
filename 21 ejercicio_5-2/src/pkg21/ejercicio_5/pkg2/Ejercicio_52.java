/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21.ejercicio_5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir dos números y decír cual es el mayor o si son iguales.
        */
        
        float num1,num2;
        
        num1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número: "));
        num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        
        if(num1<num2){
            JOptionPane.showMessageDialog(null, "El número "+num1+" es menor a "+num2);
        }
        if(num1>num2){
            JOptionPane.showMessageDialog(null, "El número "+num1+" es mayor a "+num2);
        }
        if (num1==num2){
            JOptionPane.showMessageDialog(null, "Ambos números son iguales");
        }
    }
    
}
