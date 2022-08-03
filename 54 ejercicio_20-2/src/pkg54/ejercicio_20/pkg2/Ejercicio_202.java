/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg54.ejercicio_20.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Una empresa se dedica a la venta de desinfectantes y necesita un programa para gestionar facturas.
        En cada factura figura: código del articulo / cantidad vendida en litros / precio x litro.
        Se pide de 5 facturas introducidas: Facturación total / cantidad de litros vendidos del articulo 1 y cuantas facturas
        se emitieron de mas de $600.
        
        Hacer unas modificaciones al ejercicio anterior suponiendo que no se intorudce el precio por litro. Solo eixten 3
        productos con precios:
        1-0,6/litro
        2-3/litro
        3-1,25/litro
        */
        
        int codigo,cantidadL,contador600=0;
        float litros1=(float) 0.6,litros2=3,litros3=(float) 1.25;
        float facturaT,litrosArt1=0,factura1,factura2,factura3,factura1T=0,factura2T=0,factura3T=0;
        
        for (int i=1; i<=5; i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto: "));
            cantidadL=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de litros vendidos: "));
            
            if(codigo == 1){
                factura1=litros1*cantidadL;
                litrosArt1+=cantidadL;
                factura1T+=factura1;
            }
            if(codigo == 2){
                factura2=litros2*cantidadL;
                factura2T+=factura2;
            }
            if(codigo == 3){
                factura3=litros3*cantidadL;
                factura3T+=factura3;
            }
            if(factura1T>600 || factura2T>600 || factura3T>600){
                contador600++;
            }
            
        }
        facturaT=factura1T+factura2T+factura3T;
        
        System.out.println("Resumen de facturación: ");
        System.out.println("La facturación total es de: "+facturaT);
        System.out.println("La cantidad de litros vendidos del articulo 1 es de: "+litrosArt1);
        System.out.println("La cantidad de facturas superiores a $600: "+contador600);
    }
    
}
