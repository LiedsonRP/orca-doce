/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */
public class ItemReceitaProduto {
    private Item fk_item;
    private float quantidade_usada;
    private float custo_individual;

    public ItemReceitaProduto() {
    }        

    public ItemReceitaProduto(Item fk_item, float quantidade_usada, float custo_individual) {
        this.fk_item = fk_item;
        this.quantidade_usada = quantidade_usada;        
        this.custo_individual = custo_individual;
    }
        

    public Item getFk_item() {
        return fk_item;
    }

    public void setFk_item(Item fk_item) {
        this.fk_item = fk_item;
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
    
    public Float calcCustoIndividual(float quant_usada, float preco, float quant_pacote) {
        float valor = (quant_pacote * quant_usada) / preco;
        
        return valor;
    }
    
}
