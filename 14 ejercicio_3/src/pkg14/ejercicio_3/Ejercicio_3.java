/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14.ejercicio_3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //La calificacion final de un estudiante se calcula con base a las calificaciones de cuatro aspectos de su rendimiento
        //académico: participacion, primer examen, segundo examen y examen final.Sabiendo que las calificaciones anteriores
        //entran a la calficacion final con ponderaciones de 10%,25%,25% y 40%, hacer un programa que calcule e imprima la
        //calificacion final obtenida por un estudiante.
        
        
        Scanner entrada = new Scanner (System.in);
        String estudiante;
        double parti,examen1,examen2,examenfin,calificacion;
        
        estudiante = JOptionPane.showInputDialog("Escriba el nombre del estudiante: ");
        
        parti = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la participación"));
        
        examen1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el resultado del primer examen: "));
        
        examen2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el resultado del segundo examen: "));
        
        examenfin = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el resultado del examen final: "));
        
        calificacion = (parti*0.10)+(examen1*0.25)+(examen2*0.25)+(examenfin*0.40);

        JOptionPane.showMessageDialog(null, "La calificación final de "+estudiante+" es de: "+calificacion+".");
        
    }
    
}
