/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg28.ejercicio_9;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir el día, mes y año de una fecha e indicar si la fecha es correcta, suponiendo que todos los meses son de 30 días.
        */
        
        int dia, mes, anio;
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del dia: "));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes: "));
        anio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del año: "));
        
        if(dia>0 && dia<=30 && mes>0 && mes<=12 && anio != 0){
            JOptionPane.showMessageDialog(null, "La fecha: "+dia+"/"+mes+"/"+anio+" es correcta.");
        }
        else {
            JOptionPane.showMessageDialog(null, "La fecha: "+dia+"/"+mes+"/"+anio+" es incorrecta.");
        }
    }
    
}
