/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */
public class Embalagem {
    
    final int MAX_NAME_LENGTH = 120;
   
    private String nomeEmbalagem;
    private int quantidade_pacote;
    private float preco_pacote;
    private float preco_unidade;
    
    public Embalagem() {
        
    }
    
    public Embalagem(String nomeEmbalagem, int quantidade_pacote,
            float preco_pacote, float preco_unidade) {
        this.nomeEmbalagem = nomeEmbalagem;
        this.quantidade_pacote = quantidade_pacote;
        this.preco_pacote = preco_pacote;
        this.preco_unidade = preco_unidade;
    }

    public String getNomeEmbalagem() {
        return nomeEmbalagem;
    }

    public void setNomeEmbalagem(String nomeEmbalagem) {
        if(nomeEmbalagem.length() <= MAX_NAME_LENGTH) {
            this.nomeEmbalagem = nomeEmbalagem;
        }
    }

    public int getQuantidade_pacote() {
        return quantidade_pacote;
    }

    public void setQuantidade_pacote(int quantidade_pacote) {
        this.quantidade_pacote = quantidade_pacote;
    }

    public float getPreco_pacote() {
        return preco_pacote;
    }

    public void setPreco_pacote(float preco_pacote) {
        this.preco_pacote = preco_pacote;
    }

    public float getPreco_unidade() {
        return preco_unidade;
    }

    public void setPreco_unidade(float preco_unidade) {
        this.preco_unidade = preco_unidade;
    }
    
    public float calcPrecoUnidade(int quantidade, float preco_pacote) {
        float precoUnidade = preco_pacote/quantidade;
        
        return precoUnidade;
    }
    
}