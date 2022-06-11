/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */
public class ItemReceitaItemComposto {
    private ItemSimples fk_item_simples;
    private float quantidade_usada;
    private float custo_individual;      

    public ItemReceitaItemComposto(ItemSimples fk_item_simples, float quantidade_usada) {
        this.fk_item_simples = fk_item_simples;
        this.quantidade_usada = quantidade_usada;
        this.custo_individual = calcCustoIndividual(this.quantidade_usada, fk_item_simples.getPreco_pacote(), fk_item_simples.getQuant_pacote());
    }       
    
    public Float calcCustoIndividual(float quant_usada, float preco, float quant_pacote) {
        float valor = (quant_pacote * quant_usada) / preco;
        
        return valor;
    }

    public ItemSimples getFk_item_simples() {
        return fk_item_simples;
    }

    public void setFk_item_simples(ItemSimples fk_item_simples) {
        this.fk_item_simples = fk_item_simples;
    }

    public float getQuantidade_usada() {
        return quantidade_usada;
    }

    public void setQuantidade_usada(float quantidade_usada) {
        this.quantidade_usada = quantidade_usada;
    }

    public float getCusto_individual() {
        return custo_individual;
    }

    public void setCusto_individual(float custo_individual) {
        this.custo_individual = custo_individual;
    }
    
    
        
}
