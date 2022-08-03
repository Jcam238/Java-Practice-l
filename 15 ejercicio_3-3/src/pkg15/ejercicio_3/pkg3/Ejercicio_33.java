/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15.ejercicio_3.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float a,b,pot=2;
        double resultado;
        
        a=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de a: "));
        b=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de b:"));
        
        resultado=Math.pow(a, pot)+Math.pow(b, pot)+2*(a*b);
        
        JOptionPane.showMessageDialog(null, "El resultado es: "+resultado+".");
        
    }
    
}
