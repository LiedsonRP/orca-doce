/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */
public class Embalagem extends Item {
    
    private int quant_pacote;
    private float preco_pacote;

    public Embalagem() {
        this.setTipo_item(this.TIPO_ITENS_LIST[3]);
    }

    public Embalagem(int id_item, String nome_item, UnidadeMedida unidadeMedida) {
        super(id_item, nome_item, unidadeMedida);
        this.setTipo_item(this.TIPO_ITENS_LIST[3]);
    }

    public int getQuant_pacote() {
        return quant_pacote;
    }

    public void setQuant_pacote(int quant_pacote) {
        this.quant_pacote = quant_pacote;
    }

    public float getPreco_pacote() {
        return preco_pacote;
    }

    public void setPreco_pacote(float preco_pacote) {
        this.preco_pacote = preco_pacote;
    }        
}