/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20.ejercicio_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10.
        */
        
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero: "));
        
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número NO es múltiplo de 10");
        }
    }
    
}
