/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jonat
 */
public class Frm01 {
    
    public void main (String[] args){
        criaTela();
    }
    
    
    public void criaTela()
{
//criando o Frame
JFrame f= new JFrame();
f.setSize(290,100);
f.setTitle("Cadastro de Categorias");
f.setLocation(10,10);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
////criando o Painel
//JPanel pl = new JPanel();
//pl.setLayout(null);// gerenciador de Layout
////Criando os componentes:
////Label
//JLabel meuLabel = new JLabel("Código");
//meuLabel.setBounds(10, 10, 60, 20);
//// Campo de Texto
//JTextField meuCampoTexto = new JTextField(" ");
//meuCampoTexto.setBounds(80, 10, 60, 20);
//// Botão
//JButton meuBotao = new JButton("NomeBotão");
//meuBotao.setBounds(150, 10, 100, 20);
////colando os componentes no Painel
//pl.add(meuLabel);
//pl.add(meuCampoTexto);
//pl.add(meuBotao);
////colando o painel no frame
//f.add(pl);
//f.setVisible(true);
}
}
