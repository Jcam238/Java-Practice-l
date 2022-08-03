/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg48.ejercicio_17.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir un número y calcular su factorial. (N!=1*2*3*4...*N).
        */
        
        int N,cuenta=0;
        long factorial=1;
        
        N=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para calcular su factorial: "));
        
        for(int i=1; i<=N; i++){
            cuenta=i;
            factorial=factorial*cuenta;
        }
        
        JOptionPane.showMessageDialog(null, "El factorial es: "+factorial);
    }
    
}
