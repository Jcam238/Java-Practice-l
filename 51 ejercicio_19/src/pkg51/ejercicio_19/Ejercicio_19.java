/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg51.ejercicio_19;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Dadas las edades y alturas de 5 alumnos, mostrar la edad, estatura media y la cantidad de alumnos mayores de 18 años,
        y la cantidad de alumnos que miden mas de 1.75m.
        */
        
        int edad, cantidadEdad=0, cantidadAltura=0, edadM, sumaE=0;
        float altura, alturaM, sumaA=0;
        
        for(int i=1; i<=5; i++){
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno: "));
            altura=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del alumno: "));
            
            if(edad>=18){
                cantidadEdad++;
            }
            if(altura>=1.75){
                cantidadAltura++;
            }
            
            sumaE=edad+sumaE;
            sumaA=altura+sumaA;
        }
        
        alturaM=sumaA/5;
        edadM=sumaE/5;
        
        JOptionPane.showMessageDialog(null, "La edad media es de: "+edadM+"\nLa altura media es de: "+alturaM+"\nLa cantidad mayor de 18 es de: "+cantidadEdad+"\nLa cantidad mayor de 1,75 es: "+cantidadAltura);
        
    }
    
}
