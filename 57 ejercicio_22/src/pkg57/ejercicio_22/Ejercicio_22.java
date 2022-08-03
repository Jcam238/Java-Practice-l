/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg57.ejercicio_22;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir 10 números y mostrar al final si se ha introducido alguno negativo.
        */
        
        int numero,contadorNeg=0;
        boolean negativos=false;
        
        for(int i=1; i<=10; i++){
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo o negativo: "));

            if(numero<0){
                negativos=true;
            }
        }
        
        if(negativos==true){
            JOptionPane.showMessageDialog(null, "Se han introducido números negativos: "+negativos+".");
        }
        else{
            JOptionPane.showMessageDialog(null, "Se han introducido números negativos: "+negativos+".");
        }
    }
    
}
