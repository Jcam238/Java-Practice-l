/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg50.ejercicio_18.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_182 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir 10 sueldos. Mostrar la suma y cuantos hay mayores de $1000.
        */
        
        int sueldo,suma=0,contador=0;
        
        for(int i=1; i<=10; i++){
        sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado: "));
        
        suma=suma+sueldo;
        
        if(sueldo>=1000){
            contador++;
            }
        else{
            
            }
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los sueldos es: $"+suma+"\nY hay "+contador+" sueldos mayores a $1000");
        
    }
    
}
