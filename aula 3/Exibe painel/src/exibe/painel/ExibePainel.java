/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exibe.painel;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jonat
 */
public class ExibePainel extends JFrame {

    String janela = "Minha janela";
    
    /**
     * @param args the command line arguments
     */
    
    ExibePainel()
                {
                    setTitle(janela);
                    setSize(400,50);
                    setLocation(150,150);
                    setResizable(false);
                    getContentPane().setBackground(Color.gray);
                }
    
    public static void main(String[] args) {
        
        JFrame Janela = new ExibePainel();
        Janela.show();
        
    }
    
}
