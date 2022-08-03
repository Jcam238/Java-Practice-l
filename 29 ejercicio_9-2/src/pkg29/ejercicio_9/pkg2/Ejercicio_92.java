/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg29.ejercicio_9.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class Ejercicio_92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28,30 y 31 días sin bisiestos.
        */
        
        int dia,mes,año;
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del dia: "));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes: "));
        año=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del año: "));
        
        if (año!=0){
            if (mes>0 && mes<=12){
                if(mes==2){
                    if(dia>1 && dia<=28){
                        JOptionPane.showMessageDialog(null, "La fecha "+dia+"/"+mes+"/"+año+" es correcta.");
                        }
                    else {
                        JOptionPane.showMessageDialog(null, "El día es incorrecto.");
                        }
                    }
                if(mes==4 || mes==6 || mes==9 || mes==11){
                    if(dia>0 && dia<=30){
                    JOptionPane.showMessageDialog(null, "La fecha "+dia+"/"+mes+"/"+año+" es correcta.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El día es incorrecto.");
                    }
                }
                if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                    if(dia>0 && dia<=31){
                    JOptionPane.showMessageDialog(null, "La fecha "+dia+"/"+mes+"/"+año+" es correcta.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El día es incorrecto.");
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "El mes es incorrecto.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El año es incorrecto.");
        }
    }
    
}
