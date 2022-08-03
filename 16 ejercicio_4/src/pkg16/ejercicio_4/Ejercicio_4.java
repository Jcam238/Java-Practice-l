/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16.ejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes. Por
        ejemplo, dado un total de 1000 horas, debe mostrar 5 semanas, 6 días y 16 horas.
        */
        
        int dias,semanas,horasT,horas;
        
        horasT=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas deseada: "));
        dias=horasT%168 / 24;
        horas=horasT%24;
        semanas=horasT/168;
        
        JOptionPane.showMessageDialog(null, "Han transcurrido: "+semanas+" semanas,"+dias+" días y "+horas+" horas.");
        
    }
    
}
