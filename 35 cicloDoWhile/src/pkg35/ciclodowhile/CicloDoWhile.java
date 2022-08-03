/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ciclodowhile;

/**
 *
 * @author Intel
 */
public class CicloDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i=1;
        //int i=11; por ejemplo en este caso, nos imprimiría el 11, pero se dejaría de ejecutar luego. 
        
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
    
}
