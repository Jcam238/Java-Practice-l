/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg44.ejercicio_15.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_152 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir un número N y mostrar todos los números del 1 al N
        */
        
        int n;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        for(int i=1; i<=n; i++){
            JOptionPane.showMessageDialog(null, i);
        }
    }
    
}
