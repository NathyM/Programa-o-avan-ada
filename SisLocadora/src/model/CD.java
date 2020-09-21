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
public class CD {
    private String titulo;
    private String artista;
    private String gravadora;
    private int ano; 

    public CD() {
        
    }

    public CD(String titulo, String artista, String gravadora, int ano) {
        this.titulo = titulo;
        this.artista = artista;
        this.gravadora = gravadora;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String imprimirDadosCD(){
        return  "CD{" +"Titulo:'" + titulo  + ", " + "Artista:'" + artista + ", "+ "Gravadora: '" + gravadora  + ", "+ "Ano:'" + ano  +'}';
        
    }
    
    
    
}
