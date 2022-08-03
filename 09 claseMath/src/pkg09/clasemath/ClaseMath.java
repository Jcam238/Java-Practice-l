/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.clasemath;

/**
 *
 * @author Intel
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Raíz cuadrada de 9:
        double raiz = Math.sqrt(9);
        //Potancia de base 5 y exponente 2:
        double base = 5, exponente = 2;
        double potencia = Math.pow(base, exponente);
        //Redondear:
        double num = 4.56;
        long redondear = Math.round(num);
        //Número random:
        double numRan = Math.random();
        
        System.out.println("La raíz es: "+raiz);
        System.out.println("La potencia es: "+potencia);
        System.out.println("El redondeo es: "+redondear);
        System.out.println("El número random es: "+numRan);
    }
    
}
