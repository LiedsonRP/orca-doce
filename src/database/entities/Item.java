/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */
public class Item {
    final String[] LIST_TYPE_ITEM = {"Simples", "Composto", "Terceirização"};
    
    public String tipo;
    public String nome_item;
    public float quantidade_embalagem;
    public float valor_embalagem;
    public float peso_item;
    public float custo_kg;
    public String descricao;
    public int id_embalagem;
    
    public Item() {
        
    }

    public Item(String nome_item, float quantidade_embalagem, float valor_embalagem, 
            float peso_item, float custo_kg, String descricao, int id_embalagem) {
        this.nome_item = nome_item;
        this.quantidade_embalagem = quantidade_embalagem;
        this.valor_embalagem = valor_embalagem;
        this.peso_item = peso_item;
        this.custo_kg = custo_kg;
        this.descricao = descricao;
        this.id_embalagem = id_embalagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome_item() {
        return nome_item;
    }

    public void setNome_item(String nome_item) {
        this.nome_item = nome_item;
    }

    public float getQuantidade_embalagem() {
        return quantidade_embalagem;
    }

    public void setQuantidade_embalagem(float quantidade_embalagem) {
        this.quantidade_embalagem = quantidade_embalagem;
    }

    public float getValor_embalagem() {
        return valor_embalagem;
    }

    public void setValor_embalagem(float valor_embalagem) {
        this.valor_embalagem = valor_embalagem;
    }

    public float getPeso_item() {
        return peso_item;
    }

    public void setPeso_item(float peso_item) {
        this.peso_item = peso_item;
    }

    public float getCusto_kg() {
        return custo_kg;
    }

    public void setCusto_kg(float custo_kg) {
        this.custo_kg = custo_kg;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_embalagem() {
        return id_embalagem;
    }

    public void setId_embalagem(int id_embalagem) {
        this.id_embalagem = id_embalagem;
    }    
    
}
