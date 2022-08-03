/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg59.arreglosarray;

/**
 *
 * @author Intel
 */
public class ArreglosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ARRAY O ARREGLOS
        */
        
        
        int[]numeros=new int[3];
        //int[]numeros={5,7,9,10};
        numeros[0]=7;
        numeros[1]=10;
        numeros[2]=13;
        
        //De esta forma se llena de forma manual el array (recordar q empieza del 0 y termina un valor anterior);
        //En los arreglos se utiliza mucho en Arrays.
        
        
        //System.out.println(numeros[2]); //Esto solo imprimiría un número, según el valor asignado.
        //Para imprimir todo podmos utilizar un bucle.
        
        for(int i=0;i<3;i++){
            System.out.println(numeros[i]); //acá colocamos el iterador o "i" ya que es el que va a asignar el valor del array.
        }
        
    }
    
}
