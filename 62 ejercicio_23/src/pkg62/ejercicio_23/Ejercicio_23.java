/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg62.ejercicio_23;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Leer 5 números, guardarlos en un Array y mostrarlos en el mismo orden introducido.
        */
        
        float[] numeros=new float[5];
        
        for(int i=0; i<5; i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Ingrese el número: "));
        }
        
        for(float i:numeros){
            System.out.println("Numeros: "+i);
        }
        
    }
    
}
