/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg27.ejercicio_8.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir un nùmero entre 0 y 99.999 y decír cuantas cifras tiene.
        */
        
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 0 a 99.999: "));
        
        if(numero<10){
            JOptionPane.showMessageDialog(null, "El número tiene una sola cifra.");
        }
        else if(numero<100 && numero>=10){
            JOptionPane.showMessageDialog(null, "El número tiene dos cifras.");
        }
        else if(numero<1000 && numero>=100){
            JOptionPane.showMessageDialog(null, "El número tiene tres cifras.");
        }
        else if(numero<10000 && numero>=1000){
            JOptionPane.showMessageDialog(null, "El número tiene cuatro cifras.");
        }
        else if(numero<100000 && numero>=10000){
            JOptionPane.showMessageDialog(null, "El número tiene cinco cifras.");
        }
    }
    
}
