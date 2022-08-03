/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg43.ejercicio_15;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir números hasta que se introduzca uno negativo y calcular la media.
        */
        
        int numero,suma=0,contador=0;
        float media;
        
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo: "));
        
        while(numero>0){
            contador++;
            suma=numero+suma;
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero positivo: "));
        }
        
        if(contador==0){
            JOptionPane.showMessageDialog(null, "Error, no ha intoruducido un número positivo.");
        }
        else{
            media= (float) suma/contador;
        
            JOptionPane.showMessageDialog(null, "La media es de: "+media);
        }
    }
    
}
