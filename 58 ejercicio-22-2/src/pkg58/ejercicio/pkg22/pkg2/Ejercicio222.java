/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg58.ejercicio.pkg22.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio222 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
        */
        
        int cali;
        boolean sus = false;
        
        for(int i=1; i<=5; i++){
            do{
            cali=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación "+i));
            }while(cali<0 || cali>10);
                    
            if(cali<4){
                sus=true;
            }
        }
        
        if(sus==true){
            JOptionPane.showMessageDialog(null, "Hay suspensos.");
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay suspensos.");
        }
    }
    
}
