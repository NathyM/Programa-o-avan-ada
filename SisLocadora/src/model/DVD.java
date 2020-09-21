/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author franklin
 */
public class DVD {
    private String titulo;
    private String elenco;
    private String diretor;
    private int ano; 

    public DVD() {
    }

    public DVD(String titulo, String elenco, String diretor, int ano) {
        this.titulo = titulo;
        this.elenco = elenco;
        this.diretor = diretor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    public String imprimirDadosDVD(){
        return  "DVD{" + "Titulo:'" + titulo + ", Elenco: '" + elenco + ", Diretor:'" + diretor + ", Ano='" + ano +"\n" +'}';
        
    }
    
}
