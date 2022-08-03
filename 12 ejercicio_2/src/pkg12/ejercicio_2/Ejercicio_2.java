/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.ejercicio_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        // Guillermo tiene N dolares. Luis tiene la mitad de Guillermo. Juan tiene la mitad de Luis y Guillermo
        // juntos. Hacer un programa que imprima e indique la cantdad de dinero que tienen los tres.
        
        float Guillermo, Luis, Juan, total;
        
        Guillermo=Float.parseFloat(JOptionPane.showInputDialog("¿Cuánto dinero tiene Guillermo?"));
        Luis=Guillermo/2;
        Juan=(Guillermo+Luis)/2;
        total=Guillermo+Luis+Juan;
        
        JOptionPane.showMessageDialog(null, "Guillermo tiene: "+Guillermo);
        JOptionPane.showMessageDialog(null, "Luis tiene: "+Luis);
        JOptionPane.showMessageDialog(null, "Juan tiene: "+Juan);
        JOptionPane.showMessageDialog(null, "El total es de: "+total);

        
    }
    
}
