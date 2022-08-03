/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg61.bucleforeach;

/**
 *
 * @author Intel
 */
public class BucleForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        For each. Se utiliza cuando hay muchos elementos en el arreglo.
        */
        
        String[] nombres={"Alejandro","María","Luisa","Juan","Narciza","Luis","Roberto","Mariela"};
        //Supongamos que son muchisimos y no es posible o no conviene contar cada elemento.
        /*
        for(int i=0; i<nombres.length; i++){ //al colocar nombres.lenght el for utiliza el número máximo de elementos del array.
            
        } Podríamos utilizar un for con la longitud maxima del array.
        */
        
        //Pero también esta el for each.
        
        for(String i:nombres){//en el caso de "i" es el nombre q le vamos a dar, puede ser cualquier cosa.
            System.out.println("Nombres: "+i);
        }//Haciendo esto simplifica un montón, y hace exactamente lo mismo que el for normal. 
        
    }
    
}
