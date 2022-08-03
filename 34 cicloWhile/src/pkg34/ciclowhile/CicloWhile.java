/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg34.ciclowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Copiar todos los número del 1 al 10 con while;
        */
        
        int i=1,contador;
        
        contador=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces que quiere repetir el contaor: "));
        
        while(i<=contador){
            JOptionPane.showMessageDialog(null, i);
            i++;
            //i+=2 
        }
        
    }
    
}
