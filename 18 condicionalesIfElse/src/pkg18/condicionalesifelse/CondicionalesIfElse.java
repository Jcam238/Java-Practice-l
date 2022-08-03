/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18.condicionalesifelse;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class CondicionalesIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero,dato=5;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if(numero==dato){
            JOptionPane.showMessageDialog(null, "El número es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número es diferente de 5");
        }
    }
    
}
