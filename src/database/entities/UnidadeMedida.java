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
    final int NOME_UNIDADE_MAX_LENGTH = 45;
    final int SIGLA_UNIDADE_MAX_LENGTH = 5;
    
    private String nome_unidade;
    private String sigla_unidade;
    
    public UnidadeMedida() {
        
    }
    
    public UnidadeMedida(String nome_unidade, String sigla_unidade) {
        this.nome_unidade = nome_unidade;
        this.sigla_unidade = sigla_unidade;
    }   

    public String getNome_unidade() {
        return nome_unidade;
    }

    public void setNome_unidade(String nome_unidade) {
        if(nome_unidade.length() <= NOME_UNIDADE_MAX_LENGTH) {
            this.nome_unidade = nome_unidade;
        }
    }

    public String getSigla_unidade() {
        return sigla_unidade;
    }

    public void setSigla_unidade(String sigla_unidade) {
        if(sigla_unidade.length() <= SIGLA_UNIDADE_MAX_LENGTH) {
            this.sigla_unidade = sigla_unidade;
        }
    }
}
