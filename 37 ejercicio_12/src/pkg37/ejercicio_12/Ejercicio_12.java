/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg37.ejercicio_12;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Leer un número y mostrar su cuadrado. Repetir el proceso hasta que se introduzca un número negativo.
        */
        
        int numero,cuadrado;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para sacar su cuadrado: "));
        
        while(numero>=0){
            //cuadrado=numero*numero;
            cuadrado=(int)Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El cuadrado es: "+cuadrado);
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
    }
    
}
