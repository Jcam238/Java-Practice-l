/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg38.ejercicio_12.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Leer un número e indicar si es positivo o negativo. El proceso se repite hasta que se intrduzca un 0.
        */
        
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número diferente a cero: "));
        
        while(numero!=0){
            if (numero>=1){
                JOptionPane.showMessageDialog(null, "El número es positivo.");
                numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número diferente a cero: "));
            }
            if (numero<0){
                JOptionPane.showMessageDialog(null, "El número es negativo.");
                numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número diferente a cero: "));
            }
        }
    }
    
}
