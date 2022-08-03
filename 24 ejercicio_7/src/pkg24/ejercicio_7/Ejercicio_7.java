/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24.ejercicio_7;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Un obrero necesita calcular su salario semanas, el cual se obtiene de la siguiente manera:
        -Si trabaja 40 horas o menos, se le paga $16 la hora.
        -Si trabaja más de 40 horas, se le paga $16 por cada una de las primeras 40 horas y $20 por cada extra.
        */
        
        float horasT, horasE, salarioMe, extras, salarioMa;
        
        horasT=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas: "));
        
        if(horasT<40){
            salarioMe=horasT*16;
            JOptionPane.showMessageDialog(null, "La el salario del empleado es de: "+salarioMe);
        }
        else{
            horasE=horasT-40;
            extras=horasE*20;
            salarioMa=(40*16)+(horasE*20);
            
            JOptionPane.showMessageDialog(null, "El salario del empleado es de: "+salarioMa);
        }
    }
    
}
