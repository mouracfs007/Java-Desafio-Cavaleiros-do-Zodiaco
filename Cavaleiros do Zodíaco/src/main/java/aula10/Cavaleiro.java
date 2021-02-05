/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * 
 */
public class Cavaleiro implements Golpe{
    private String nome;
    private String constelacao;
    private int vida;
    
    public Cavaleiro(String nome, String constelacao){
        this.nome = nome;
        this.constelacao = constelacao;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConstelacao() {
        return constelacao;
    }

    public void setConstelacao(String constelacao) {
        this.constelacao = constelacao;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public String toString (){
        String txt = "Nome: " + nome +
                "\n Constelacao: " + constelacao +
                "\n Vida: " + vida;
        return txt;
    }
    
    public void golpeFraco(Cavaleiro inimigo){
        int vidaAtual = inimigo.getVida();
        vidaAtual = vidaAtual - 3;
        inimigo.setVida(vidaAtual);
    }
    
    public void golpeForte(Cavaleiro inimigo){
        int vidaAtual = inimigo.getVida();
        vidaAtual = vidaAtual - 6;
        inimigo.setVida(vidaAtual);
    }
    
    
}
