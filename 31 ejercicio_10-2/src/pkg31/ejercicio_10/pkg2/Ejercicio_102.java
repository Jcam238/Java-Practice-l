/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg31.ejercicio_10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
        */
        
        int nota;
        
        nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación del alumno: "));
        
        switch(nota){
        case 0:
        case 1:
        case 2:JOptionPane.showMessageDialog(null, "La nota es: Insuficiente.");
        break;
        
        case 3:
        case 4:JOptionPane.showMessageDialog(null, "La nota es: Suficiente.");
        break;
        
        case 5:
        case 6:JOptionPane.showMessageDialog(null, "La nota es: Bien.");
        break;
        
        case 7:
        case 8:JOptionPane.showMessageDialog(null, "La nota es: Notable.");
        break;
        
        case 9:
        case 10:JOptionPane.showMessageDialog(null, "La nota es: Sobresaliente.");
        break;
        }
    }
    
}
