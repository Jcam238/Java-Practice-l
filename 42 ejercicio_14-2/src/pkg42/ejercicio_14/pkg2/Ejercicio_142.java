/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg42.ejercicio_14.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_142 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir números hasta q se teclee un 0. Mostrar la suma de todos los números introducidos.
        */
        
        int numero,numero2=0,suma;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Este programa sumará todos los números que ingrese.\nPara finalizar la suma, debe teclar 0.\nIngrese un número: "));
        
        while(numero!=0){
            suma=numero+numero2;
            JOptionPane.showMessageDialog(null, "El número que tienes hasta el momento es de: "+suma);
            numero2=suma;
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Si desea finalizar, ingrese 0.\nIngrese otro número: "));
        }
        
        JOptionPane.showMessageDialog(null, "Has seleccionado 0. El programa se cerrará.");
        
    }
    
}
