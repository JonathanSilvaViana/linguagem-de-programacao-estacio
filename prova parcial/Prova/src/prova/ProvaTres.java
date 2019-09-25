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
public class ProvaTres {
     public boolean estadoTV;

    public TV(boolean estadoTV){
        this.estadoTV=estadoTV;
    }

    public void ligaTV() {estadoTV=true;}

    public void desligaTV( ) {estadoTV=false;}
}
