/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.ejercicio_2.pkg2;

import java.util.Scanner;
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
        
        Scanner entrada = new Scanner (System.in);
        int mensual = 1000;
        
        String nombre = JOptionPane.showInputDialog(null, "¿Quién es el empleado?");
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos autos vendió "+nombre+"?"));
        int comision = cantidad*150;
        
        int sumaVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la suma del valor de todos los autos vendidos por "+nombre));
        double porcVenta = sumaVentas*0.5;
        
        double total = mensual+comision+porcVenta;
        
        JOptionPane.showMessageDialog(null, "El empleado deberá cobrar: "+total);
        
    }
    
}
