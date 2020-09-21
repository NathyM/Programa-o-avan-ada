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
public class AdapterCD  implements IAdapter{

   private CD cd = new CD();
   
   public AdapterCD(String titulo, String artista, String gravadora, int ano){
       this.cd =  new CD(titulo, artista,  gravadora, ano);
   }

   
    @Override
    public String imprimir() {
        return cd.imprimirDadosCD();
        
    }
    
}
