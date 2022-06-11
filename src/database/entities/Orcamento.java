/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

import java.util.ArrayList;

/**
 *
 * @author lieds
 */
public class Orcamento {
    private int id_orcamento;
    private String nome_cliente;
    private float desconto;
    private float custo_total;
    private float valor_orcamento;
    private ArrayList<ItemListaProdutoPedido> itemProdutoPedidoList;

    public Orcamento() {
    }    
    
    public Orcamento(int id_orcamento, String nome_cliente, float desconto, float custo_total, float valor_orcamento) {
        this.id_orcamento = id_orcamento;
        this.nome_cliente = nome_cliente;
        this.desconto = desconto;
        this.custo_total = custo_total;
        this.valor_orcamento = valor_orcamento;
    }
    
    
    public int getId_orcamento() {
        return id_orcamento;
    }

    public void setId_orcamento(int id_orcamento) {
        this.id_orcamento = id_orcamento;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getCusto_total() {
        return custo_total;
    }

    public void setCusto_total(float custo_total) {
        this.custo_total = custo_total;
    }

    public float getValor_orcamento() {
        return valor_orcamento;
    }

    public void setValor_orcamento(float valor_orcamento) {
        this.valor_orcamento = valor_orcamento;
    }

    public ArrayList<ItemListaProdutoPedido> getItemProdutoPedidoList() {
        return itemProdutoPedidoList;
    }

    public void addItemProdutoPedidoList(ItemListaProdutoPedido itemProdutoPedido) {
        this.itemProdutoPedidoList.add(itemProdutoPedido);
    }
    
    
}
