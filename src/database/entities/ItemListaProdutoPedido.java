/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */
public class ItemListaProdutoPedido {
    private Produto produto;
    private int quantidade;
    private float desconto_produto;
    private float custo_individual;

    public ItemListaProdutoPedido() {
    }           
    
    public ItemListaProdutoPedido(Produto produto, int quantidade, float desconto_produto, float custo_individual) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto_produto = desconto_produto;
        this.custo_individual = custo_individual;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getDesconto_produto() {
        return desconto_produto;
    }

    public void setDesconto_produto(float desconto_produto) {
        this.desconto_produto = desconto_produto;
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
