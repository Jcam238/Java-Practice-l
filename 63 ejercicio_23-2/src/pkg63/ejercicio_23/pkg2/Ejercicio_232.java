/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg63.ejercicio_23.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Leer 5 números y guardarlos en un array. Mostrar en el orden inverso al introducido.
        */
        
        float numeros[]=new float[5];
        
        
        for(int i=0; i<5; i++){
            numeros[i]=Float.parseFloat(JOptionPane.showInputDialog((i+1)+"Ingrese el número: "));
        }
        
        for(int i=4; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
    
}
