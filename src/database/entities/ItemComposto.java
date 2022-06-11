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
public class ItemComposto extends Item {

    private float custo_itemComposto;
    private float peso_itemComposto;
    private float custo_Kg;
    private ArrayList <ItemReceitaItemComposto> receitaItemComposto;
    
    public ItemComposto() {    
        this.setTipo_item(this.TIPO_ITENS_LIST[1]);
    }

    public ItemComposto(int id_item, String nome_item, UnidadeMedida unidadeMedida) {
        super(id_item, nome_item, unidadeMedida);        
        this.setTipo_item(this.TIPO_ITENS_LIST[1]);        
    }

    public float getCusto_itemComposto() {
        return custo_itemComposto;
    }

    public void setCusto_itemComposto(float custo_itemComposto) {
        this.custo_itemComposto = custo_itemComposto;
    }

    public float getPeso_itemComposto() {
        return peso_itemComposto;
    }

    public void setPeso_itemComposto(float peso_itemComposto) {
        this.peso_itemComposto = peso_itemComposto;
    }

    public float getCusto_Kg() {
        return custo_Kg;
    }

    public void setCusto_Kg(float custo_Kg) {
        this.custo_Kg = custo_Kg;
    }

    public ArrayList<ItemReceitaItemComposto> getReceitaItemComposto() {
        return receitaItemComposto;
    }

    public void addReceitaItemComposto(ItemReceitaItemComposto itemReceitaItemComposto) {
        this.receitaItemComposto.add(itemReceitaItemComposto);
    }
    
}
