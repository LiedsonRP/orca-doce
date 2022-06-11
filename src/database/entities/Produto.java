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
public class Produto {
    private final String TIPO_PRODUTO_LIST[] = {"Alimentício", "Varejo", "Kit"};
    
    private int id_produto;
    private String nome_produto;
    private String tipo_produto;
    private UnidadeMedida unidadeMedida;
    private float preco;
    private String descricao;
    private float custo_produto;
    private float peso_produto; 
    private ArrayList<ItemReceitaProduto> ItemReceitaProdutoList;
    private ArrayList<ItemReceitaKit> ItemReceitaKitList;

    public Produto() {
    }

    public Produto(int id_produto, String nome_produto, String tipo_produto, UnidadeMedida unidadeMedida, float preco, String descricao, float custo_produto, float peso_produto) {
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.tipo_produto = tipo_produto;
        this.unidadeMedida = unidadeMedida;
        this.preco = preco;
        this.descricao = descricao;
        this.custo_produto = custo_produto;
        this.peso_produto = peso_produto;
    }
    
    

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getTipo_produto() {
        return tipo_produto;
    }

    public void setTipo_produto(int index) {
        this.tipo_produto = this.TIPO_PRODUTO_LIST[index];
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getCusto_produto() {
        return custo_produto;
    }

    public void setCusto_produto(float custo_produto) {
        this.custo_produto = custo_produto;
    }

    public float getPeso_produto() {
        return peso_produto;
    }

    public void setPeso_produto(float peso_produto) {
        this.peso_produto = peso_produto;
    }

    public ArrayList<ItemReceitaProduto> getItemReceitaProdutoList() {
        return ItemReceitaProdutoList;
    }

    public void addItemReceitaProdutoList(ItemReceitaProduto ItemReceitaProduto) {
        this.ItemReceitaProdutoList.add(ItemReceitaProduto);
    }

    public ArrayList<ItemReceitaKit> getItemReceitaKitList() {
        return ItemReceitaKitList;
    }

    public void addItemReceitaKitList(ItemReceitaKit ItemReceitaKit) {
        this.ItemReceitaKitList.add(ItemReceitaKit);
    }
        
}
