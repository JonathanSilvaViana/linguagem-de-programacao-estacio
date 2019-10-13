/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaexception;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class TestaException {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
    
        try 
        {
            int numero = entrada.nextInt();
            JOptionPane.showMessageDialog(null, "Acertou");
            System.out.printf("Você digitou: " + numero + " \n ");
        }
        catch(InputMismatchException e)
             {
                 JOptionPane.showMessageDialog(null, "Errou");
                 System.out.print("O digito não é válido. \n Tente novamente...");
                 
             }
        
        
    }
    
    
}
