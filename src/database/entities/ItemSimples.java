/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */
public class ItemSimples extends Item {
    
    private float quant_pacote;
    private float preco_pacote;

    public ItemSimples() {
        this.setTipo_item(this.TIPO_ITENS_LIST[0]);
    }

    public ItemSimples(int id_item, String nome_item, UnidadeMedida unidadeMedida,
            float quant_pacote, float preco_pacote) {
        super(id_item,nome_item, unidadeMedida);
        quant_pacote = this.quant_pacote;
        preco_pacote = this.preco_pacote;
        this.setTipo_item(this.TIPO_ITENS_LIST[0]);
    }
    
    public float getQuant_pacote() {
        return quant_pacote;
    }

    public void setQuant_pacote(float quant_pacote) {
        this.quant_pacote = quant_pacote;
    }

    public float getPreco_pacote() {
        return preco_pacote;
    }

    public void setPreco_pacote(float preco_pacote) {
        this.preco_pacote = preco_pacote;
    }        
}
