/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg32.ejercicio_11;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dolares, con el siguiente menú:
        1-Ingresar dinero a la cuenta.
        2-Retirar dinero a la cuenta.
        3-Salir.
        */
        
        int saldo=1000,op,ingreso,egreso;
        
        JOptionPane.showMessageDialog(null, "Usted cuenta con: "+saldo+" dolares en su cuenta.");
        op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese: \n1-Ingresar dinero \n2-Retirar dinero \n3-Salir"));
        
        switch(op){
            case 1:
                ingreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a depositar: "));
                saldo=saldo+ingreso;
                JOptionPane.showMessageDialog(null, "Su nuevo saldo es de: "+saldo);
                break;
            case 2:
                egreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
                if(saldo<egreso){
                    JOptionPane.showMessageDialog(null, "No cuenta con suficiente saldo en su cuenta.");
                }
                else{
                    saldo=saldo-egreso;
                    JOptionPane.showMessageDialog(null, "Su nuevo saldo es de: "+saldo);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Muchas gracias por usar nuestro servicio. ¡Hasta luego!");
                break;
        }
    }
    
}
