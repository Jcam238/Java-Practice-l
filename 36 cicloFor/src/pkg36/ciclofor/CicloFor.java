/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg36.ciclofor;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador;
        
        contador=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números a imprimir: "));
        
        for(int i=1; i<=contador; i++){
            JOptionPane.showMessageDialog(null, i);
        }
    }
    
}
