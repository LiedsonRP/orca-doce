/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.entities;

/**
 *
 * @author lieds
 */
public class UnidadeMedida {
    
    private int id_unidade_medida;
    private String nome_unidade;
    private String sigla_unidade;

    public int getId_unidade_medida() {
        return id_unidade_medida;
    }

    public void setId_unidade_medida(int id_unidade_medida) {
        this.id_unidade_medida = id_unidade_medida;
    }

    public String getNome_unidade() {
        return nome_unidade;
    }

    public void setNome_unidade(String nome_unidade) {
        this.nome_unidade = nome_unidade;
    }

    public String getSigla_unidade() {
        return sigla_unidade;
    }

    public void setSigla_unidade(String sigla_unidade) {
        this.sigla_unidade = sigla_unidade;
    }
}
