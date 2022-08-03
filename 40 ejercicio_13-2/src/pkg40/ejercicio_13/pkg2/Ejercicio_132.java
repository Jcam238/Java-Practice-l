/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg40.ejercicio_13.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_132 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir números hasta que se teclee uno negativo. Mostrar cuantos números se han introducido.
        */
        
        int numero,contador=0;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo: "));
        
        do{
            contador++;
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo: "));
        }while(numero>0);
        
        JOptionPane.showMessageDialog(null, "La cantidad de números introducidos es de: "+contador);
    }
    
}
