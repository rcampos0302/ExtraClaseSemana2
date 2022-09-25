/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraclasesemana2;

import javax.swing.JOptionPane;


/**
 *
 * @author ricar
 */
public class ExtraClaseSemana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte antiguedad;
        byte HoraSemanales;
        float salarioHora;
        double salarioBruto;
        double salarioNeto;
        
        antiguedad  = Byte.parseByte(JOptionPane.showInputDialog("Digite su "
                + "antiguedad en años en la empresa"));
        HoraSemanales  = Byte.parseByte(JOptionPane.showInputDialog("Digite "
                + "la cantidad de horas laboradas por semana"));
        salarioHora  = Byte.parseByte(JOptionPane.showInputDialog("Digite su"
                + " salario por hora"));
        
        salarioBruto = (HoraSemanales*salarioHora);
        
        if(antiguedad>=10){
            salarioBruto = salarioBruto + (salarioBruto*0.20);
            if(salarioBruto>=1000){
                salarioNeto = salarioBruto - (salarioBruto*0.10);
                JOptionPane.showMessageDialog(null,"Su salario neto"
                        + " es: " + salarioNeto);
            }
            else if (salarioBruto>=2000){
                salarioNeto = salarioBruto - (salarioBruto*0.15);
                JOptionPane.showMessageDialog(null,"Su salario neto"
                        + " es: " + salarioNeto);
            }
        }
        
        else {
            
             JOptionPane.showMessageDialog(null,"su salario es: "
                     + salarioBruto);
        }
                  
    }
    
}
