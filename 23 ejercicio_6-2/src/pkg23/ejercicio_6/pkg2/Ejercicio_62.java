/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23.ejercicio_6.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300. Determinar la cantidad que una
        persona pagará por su compra.
        */
        
        float precio,desc,preciof;
        
        precio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la compra: "));
        
        if(precio > 300){
            desc=(float) (precio*0.20);
            preciof=precio-desc;
            
            JOptionPane.showMessageDialog(null, "El precio a pagar es de: $"+preciof+".");
        }
        else {
            JOptionPane.showMessageDialog(null, "El precio a pagar es de: $"+precio+".");
        }
    }
    
}
