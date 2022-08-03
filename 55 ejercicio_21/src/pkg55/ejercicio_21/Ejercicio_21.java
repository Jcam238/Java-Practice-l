/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg55.ejercicio_21;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionado(=4) y suspendidos.
        */
        
        float nota;
        int contadorA=0,contadorC=0,contadorD=0;
        
        for(int i=1; i<=6; i++){
            do{
                nota=Float.parseFloat(JOptionPane.showInputDialog("Ingrese en orden las notas de los alumnos de 0-10: "));
            }while(nota<0 || nota>11);
            
            if(nota>4){
                contadorA++;
            }
            else if(nota==4){
                contadorC++;
            }
            else if(nota<4){
                contadorD++;
            }
            else{
                JOptionPane.showMessageDialog(null, "No entra dentro de las notas posibles.");
            }
        }
        
        JOptionPane.showMessageDialog(null, "La cantidad de alumnos aprobados es de: "+contadorA+"\nLa cantidad de alumnos condicionados es de: "+contadorC+"\nLa cantidad de alumnos desaprobados es de: "+contadorD);
    }
    
}
