/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg39.ejercicio_13;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
        */
        
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número diferente a cero: "));
        
        while(numero!=0){
            if(numero%2==0){
                JOptionPane.showMessageDialog(null, "El número es par.");
                numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número diferente a cero: "));
            }
            if(numero%2!=0){
                JOptionPane.showMessageDialog(null, "El número es impar.");
                numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número diferente a cero: "));
            }
        }
    }
    
}
