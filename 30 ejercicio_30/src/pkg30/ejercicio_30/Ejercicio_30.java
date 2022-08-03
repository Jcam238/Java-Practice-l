/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg30.ejercicio_30;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Hacer un programa que simule el funcionamiento de una calculadora aritmética básica(suma, resta, producto y división)con
        valores numéricos enteros. El usuario debe especificar la operación con el primer caracter del parámestro (S/s de suma, 
        R/r de resta, P/p/M/m para producto y D/d para división.
        */
        
        int num1,num2,resultado;
        char operacion;
        
        JOptionPane.showMessageDialog(null, "Suma=S / Resta=R / Producto=P o M / División=D");
        operacion=JOptionPane.showInputDialog("Ingrese el caracter de la operación: ").charAt(0);
        JOptionPane.showMessageDialog(null, "Has seleccionado "+operacion+".");
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        
        switch(operacion){
            case 's':
            case 'S':
                resultado=num1+num2;
                JOptionPane.showMessageDialog(null, "El resultado es: "+resultado+".");
                break;
            case 'R':
            case 'r':
                resultado=num1-num2;
                JOptionPane.showMessageDialog(null, "El resultado es: "+resultado+".");
                break;
            case 'P':
            case 'p':
            case 'M':
            case 'm':
                resultado=num1*num2;
                JOptionPane.showMessageDialog(null, "El resultado es: "+resultado+".");
                break;
            case 'D':
            case 'd':
                resultado=num1/num2;
                JOptionPane.showMessageDialog(null, "El resultado es: "+resultado+".");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No entra en los parámetros.");
        }
    }
    
}
