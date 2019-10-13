/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

/**
 *
 * @author jonat
 */
public class Aleatorio {

    int numero;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aleatorio();
        
    }
    
    Aleatorio(int max)
    {
     numero new Random().nextInt(max);
    }
    
}
