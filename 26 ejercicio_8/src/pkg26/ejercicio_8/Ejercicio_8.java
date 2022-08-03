/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg26.ejercicio_8;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir tres números y mostrarlos ordenados de mayor a menor.
        */
        
        int x,y,z;
        
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer nùmero: "));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        z=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número: "));
        
        if(x>y && y>z){
            JOptionPane.showMessageDialog(null, x+","+y+","+z);
        }
        else if (x>z && z>y){
            JOptionPane.showMessageDialog(null, x+","+z+","+y);
        }
        else if(y>x && x>z){
            JOptionPane.showMessageDialog(null, y+","+x+","+z);
        }
        else if(y>z && z>x){
            JOptionPane.showMessageDialog(null, y+","+z+","+x);
        }
        else if(z>x && x>y){
            JOptionPane.showMessageDialog(null, z+","+x+","+y);
        }
        else if(z>y && y>x){
            JOptionPane.showMessageDialog(null, z+","+y+","+x);
        }
    }
    
}
