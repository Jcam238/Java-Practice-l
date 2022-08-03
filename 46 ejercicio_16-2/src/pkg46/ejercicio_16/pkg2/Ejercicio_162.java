/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg46.ejercicio_16.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_162 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir 10 números y escribir la suma total.
        */
        
        int numero,suma=0;

        
        for(int i=1; i<=10; i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            suma=numero+suma;
        }

        JOptionPane.showMessageDialog(null, "La suma total es de: "+suma+".");
    }
    
}
