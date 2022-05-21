/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import database.DB;
import database.entities.Embalagem;
import java.sql.SQLException;

/**
 *
 * @author lieds
 */
public class EmbalagemDAO {
    Connection conn = null;
    PreparedStatement st = null;
    
    public void insertInto(Embalagem embalagem) {
        conn = DB.getConnection();
        
        try {
            st = conn.prepareStatement(
                    "INSERT INTO embalagem "
                            + "(nome_embalagem, quantidade_pacote, preco_pacote, preco_unidade)"
                            + "VALUES "
                            + "(?,?,?,?)",
                            Statement.RETURN_GENERATED_KEYS);
            
            st.setString(1, embalagem.getNomeEmbalagem());
            st.setInt(2, embalagem.getQuantidade_pacote());
            st.setFloat(3, embalagem.getPreco_pacote());
            st.setFloat(4, embalagem.getPreco_unidade());
            
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

