/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */
public class Terceirizacao extends Item{    

    private float valor_obra;
    private String descricao;
    
    public Terceirizacao() {
        this.setTipo_item(this.TIPO_ITENS_LIST[2]);
    }
       
    public Terceirizacao(int id_item, String nome_item, UnidadeMedida unidadeMedida) {
        super(id_item, nome_item, unidadeMedida);
        this.setTipo_item(this.TIPO_ITENS_LIST[2]);
        this.valor_obra = valor_obra;
        this.descricao = descricao;
    }           

    public float getValor_obra() {
        return valor_obra;
    }

    public void setValor_obra(float valor_obra) {
        this.valor_obra = valor_obra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
