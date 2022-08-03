/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg49.ejercicio_18;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir 10 números. Mostrar la media de los números positivos, la media de los negativos y la cantidad de ceros.
        */
        
        float num,contadorP=0,contadorN=0,contador0=0,sumaP=0,sumaN=0;
        float promP,promN;
        
        for(int i=1; i<=10; i++){
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        if(num>0){
            contadorP++;
            sumaP=sumaP+num;
            }
        if(num<0){
            contadorN++;
            sumaN=sumaN+num;
            }
        if(num==0){
            contador0++;
            }
        }
        
        promP=sumaP/contadorP;
        promN=sumaN/contadorN;
        
        JOptionPane.showMessageDialog(null, "El promedio positivo es: "+promP+"\nEl promedio negativo es: "+promN+"\nLa cantidad de ceros es: "+contador0);
    }
    
}
