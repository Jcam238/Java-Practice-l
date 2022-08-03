/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Intel
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float num1,num2,suma,resta,multiplicacion,division,resto;
        
        System.out.println("Digite dos numeros: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        
        suma=num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;
        resto=num1%num2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El resto es: "+resto);
        
    }
    
}
