/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22.ejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
        */
        
        char letra;
        
        letra=JOptionPane.showInputDialog("Ingrese una letra mayúscula o minúscula: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayúscula.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Es una letra minúscula.");
        }
    }
    
}
