/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17.ejercicio_4.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a,b,c,x,pot=2,p1,p2,p3,p4,p5,r1,r2;
        
        a=Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor de a?"));
        b=Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor de b?"));
        c=Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor de c?"));
        
        p1=Math.pow(b, pot);
        p2=p1-(4*a*c);
        p3=Math.sqrt(p2);
        p4=-b+p3;
        p5=-b-p3;
        r1=p4/(2*a);
        r2=p5/(2*a);
        
        JOptionPane.showMessageDialog(null, "El valor de X1 es: "+r1+". El valor de X2 es: "+r2+".");
    }
    
}
