/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg47.ejercicio_17;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Diseñar un programa que muestre el producto de los 10 primeros números impares.
        */
        
        long producto=1;
        
        
        for(int i=1; i<=20; i+=2){
            producto*=i;
            
            JOptionPane.showMessageDialog(null, producto);
        }
    }
    
}
