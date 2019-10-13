/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;


/**
 *
 * @author jonat
 */
public class Lampada {

    
    private boolean estado; //ligado ou não
    /**
     * @param args the command line arguments
     */

    public static void main(String args[])
    {
        System.out.printf("executando..." + '\n');
    }
    
    public void mainy(String args[])
    {
    
        if(estado = false)
        {System.out.printf("Estado da lâmpada é desligado" );}
        else{System.out.printf("Estado da lâmpada é ligado" );}
        
        
        
    }
     
    public Lampada(){

this.estado = false;

}

public void setEstado(boolean estado){

this.estado = estado;

}

public boolean getEstado(){

return this.estado;

 }
}
