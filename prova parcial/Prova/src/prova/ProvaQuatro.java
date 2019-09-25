/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author jonat
 */
public class ProvaQuatro {
    class Primeira { int x = 20; void Calc(int aux1) { x*=aux1; } }

class Segunda extends Primeira { void Calc(int aux2) { x+=aux2; } }

class Terceira extends Segunda { String a = "Sistema de Informação"; }

class Testando { 
    
    public void  main(String[] args)
    {

        Terceira t = new Terceira();

        Primeira p = new Primeira();

        t.Calc(3);

        System.out.print(t.x+" "+p.x); 
    }
}
}
