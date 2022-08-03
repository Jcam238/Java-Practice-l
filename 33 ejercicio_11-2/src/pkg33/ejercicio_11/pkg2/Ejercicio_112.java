/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg33.ejercicio_11.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.
        */
        
        float kg,hg,dag,g,dg,cg,mg;
        
        kg=Float.parseFloat(JOptionPane.showInputDialog("El programa pasa Kg a otras medidas. \nIngrese la cantidad de Kg: "));
        
        hg=kg*10;
        dag=kg*100;
        g=kg*1000;
        dg=kg*10000;
        cg=kg*100000;
        mg=kg*1000000;
        
        JOptionPane.showMessageDialog(null, "Los valores son: \n"+kg+" Kg\n"+hg+" Hg\n"+dag+" Dag\n"+g+" G\n"+dg+" Dg\n"+cg+" Cg\n"+mg+" Mg");
       
    }
    
}
