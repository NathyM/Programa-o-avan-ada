
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Natalie
 */
public class AdapterDVD implements IAdapter {

    private DVD dvd = new DVD();
       
   public AdapterDVD(String titulo, String elenco, String diretor, int ano){
       this.dvd =  new DVD(titulo, elenco,  diretor, ano);
   }

    @Override
    public String imprimir() {
       return dvd.imprimirDadosDVD();
    }
    
}
