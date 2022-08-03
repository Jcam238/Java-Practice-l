/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg56.ejercicio_21.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir un número N de sueldos, introducir N sueldos y mostrar el sueldo máximo.
        */
        
        int n,sueldo,sueldoMax=0,sueldo1;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos a analizar: "));
        
        for(int i=1;i<=n;i++){
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo "+i));
            
            sueldo1=sueldo;
            if(sueldoMax<sueldo1){
                sueldoMax=sueldo1;
            }
            else{
            }
        }
        
        JOptionPane.showMessageDialog(null, "El sueldo máximo es de: "+sueldoMax);
    }
    
}
