/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19.pkgswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dato;
        
        dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero entre 1 y 5: "));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el número 1");
                break;
            case 2: JOptionPane.showMessageDialog(null, "Es el número 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "Es el número 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "Es el número 4");
                break;
            case 5: JOptionPane.showMessageDialog(null, "El número es 5");
                break;
            default: JOptionPane.showMessageDialog(null, "El número no entra en los parámetros.");
                break;
        }
        
    }
    
}
