/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */ 
public abstract class Item {
    protected final String TIPO_ITENS_LIST[] = {"Simples", "Composto", "Terceirização", "Embalagem"};
    
    private int id_item;
    private String tipo_item;
    private String nome_item;
    private UnidadeMedida unidadeMedida;

    public Item() {
    }        

    public Item(int id_item, String nome_item, UnidadeMedida unidadeMedida) {
        this.id_item = id_item;        
        this.nome_item = nome_item;
        this.unidadeMedida = unidadeMedida;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public String getTipo_item() {
        return tipo_item;
    }

    public void setTipo_item(String tipo_item) {
        this.tipo_item = tipo_item;
    }

    public String getNome_item() {
        return nome_item;
    }

    public void setNome_item(String nome_item) {
        this.nome_item = nome_item;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
}
