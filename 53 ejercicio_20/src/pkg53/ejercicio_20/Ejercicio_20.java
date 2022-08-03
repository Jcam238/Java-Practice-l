/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg53.ejercicio_20;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_20 {

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
        */
        
        int codigo,litros,litrosArt1=0,importemayor600=0;
        float precioLitro,importeFactura,facturacionTotal=0;
        
        for(int i=1; i<=5; i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto: "));
            litros=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de litros vendidos: "));
            precioLitro=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por litro: "));
            
            importeFactura= (float) litros*precioLitro;
            facturacionTotal += importeFactura;
            
            if(codigo==1){
                litrosArt1+=litros;
            }
            if(importeFactura>600){
                importemayor600++;
            }
            
            System.out.println("Resumen de ventas");
            System.out.println("Facturación total: "+facturacionTotal);
            System.out.println("Cantidad de litros del artículo 1: "+litrosArt1);
            System.out.println("La cantidad de facturas mayores a $600: "+importemayor600);
        }
    }
    
}
