/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.dao;

import database.DB;
import database.entities.Terceirizacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lieds
 */
public class ItemDAO {
    Connection conn = null;
    PreparedStatement st = null;
    
    public void insertTerceirizacao(Terceirizacao terceirizacao) {
        conn = DB.getConnection();
        
        try {
            st = conn.prepareStatement(
                    "INSERT INTO item "
                            + "(tipo_item, nome_item, quantidade_item, preco_item, descricao)"
                            + "VALUES "
                            + "(?,?,?,?,?)",
                            Statement.RETURN_GENERATED_KEYS);
            
            st.setString(1, terceirizacao.getTipo());
            st.setString(2, terceirizacao.getNome_terceirizacao());
            st.setFloat(3, terceirizacao.getQuantidade_remessa());
            st.setFloat(4, terceirizacao.getPreco_terceirizacao());
            st.setString(5, terceirizacao.getDescricao());
            
            int rowsAffected = st.executeUpdate();
            
            if(rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while(rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
     }
}
