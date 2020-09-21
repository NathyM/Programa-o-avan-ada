/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.AdapterCD;
import model.AdapterDVD;
import model.Sistema;

/**
 *
 * @author Natalie
 */
public class Client {
     public static void main(String[] args) {
    
    Sistema sistema = Sistema.getInstance();
    AdapterCD cd1 = new AdapterCD("Rainhas do arrocha", "Marilia e Naiara", "Universal",20);
    AdapterDVD dvd1 = new AdapterDVD("Velozes e furiosos", "Sei lá", "Rubinho", 21);
    
    sistema.cadastrarMidia(dvd1);
    sistema.cadastrarMidia(cd1);
    sistema.listarMidia();
    
  
    
}
}