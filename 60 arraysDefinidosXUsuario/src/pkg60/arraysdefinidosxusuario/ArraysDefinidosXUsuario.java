/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg60.arraysdefinidosxusuario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class ArraysDefinidosXUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ¿Qué hacemos si no sabemos el largo del Array ni los valores asignados? Se lo pedimos al usuario.
        */
        
        Scanner entrada=new Scanner(System.in); //Asignamos scanner para pedirle datos al usuario.
        int nElementos; //Asignamos un dato para que el usuario nos díga el número de elementos para el Array.
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos para el Array: "));
        
        char[] letras=new char[nElementos]; //Acá declaramos el Array LUEGO de declarar el nElementos para que nos tome el dato.
        
        for(int i=0; i<nElementos; i++){
            System.out.println((i+1)+". Digite un caracter: ");
            letras[i]=entrada.next().charAt(0);
        }//Con esto le pedimos los datos a ingresar al usuario. El (i+1) es solo una formalidad para que el usuario no vea el
        //cero (0) como contador inicial, por el el i+1, sería 0+1 y el contador empezaría en 1.
        
        System.out.println("\nLos caracteres del arreglo son: ");
        for(int i=0; i<nElementos; i++){
            System.out.println(letras[i]+" ");
        }//Acá simplemente mostramos los carácteres seleccionados en la posición establecida.
        
    }
    
}
