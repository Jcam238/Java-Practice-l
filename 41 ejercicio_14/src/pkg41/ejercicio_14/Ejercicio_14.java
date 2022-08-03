/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg41.ejercicio_14;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un juego apra adivinar un número. Para ello, generar un número aleatorio entre 0-100 y luego ir pidiendo núm
        indicando "es mayor" o "es menor", según sea el caso. El proceso termina cuando el usuario acierta y mostrar el num de 
        intentos que tuvo.
        */
        
        int contador=0, numero, secreto;
        
        secreto=(int) (Math.random()*100);
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Este juego generará un número al azar y usted deberá adivinarlo.\nIngrese un número: "));
                
        while(secreto!=numero){
            if (numero>secreto){
                JOptionPane.showMessageDialog(null, "El número "+numero+" es mayor al número secreto.");
                contador++;
                numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
            }
            else{
                JOptionPane.showMessageDialog(null, "El número "+numero+" es menor al número secreto.");
                contador++;
                numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
            }
        }
        
        JOptionPane.showMessageDialog(null, "¡Felicidades!\n¡Has adivinado el número!\nEl número era "+secreto+"\nHa tomado "+contador+" intentos.");
    }
    
}
