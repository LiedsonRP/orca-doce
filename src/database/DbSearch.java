/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lieds
 */
public class DbSearch {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    
    public boolean valueExists(String tableName, String fieldName, String value) {        
        boolean valueExists = false;        
        String sql = "SELECT * FROM " + tableName + " WHERE " + fieldName + " = ?";
       
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement(sql);           
            
            stmt.setString(1, value);                                       
            
            rs = stmt.executeQuery();    
            
            if(!rs.next()) {
                valueExists = true;
            }
                                    
        } catch(SQLException e) {
            e.printStackTrace();        
        } finally {                
            DB.closeResultSet(rs);
            DB.closeStatement(stmt);            
        }                                
        
        return valueExists;
    }
}
