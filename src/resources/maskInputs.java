/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resources;

/**
 *
 * @author lieds
 */
public class maskInputs {
   
    public static String format_money(String num, String symbol) {
        String text = num;
        
        try {
            int value = Integer.parseInt(text);
            
            if (text.indexOf(",00") == -1) {
                text = text.concat(",00");
            }
            
        } catch (NumberFormatException ex) {
            
        }
        
        if (text.indexOf("R$") == -1) {
            
            text = "R$" + text;
            text = text.replace(".", symbol);
        }
        
        return text; 
    }
    
    public static String remove_format_money(String num, String symbol) {
        String text = num;
        
        if(text.indexOf("R$") != -1) {
            text = text.replace("R$", "");
        } 
        
        text = text.replace(symbol, ".");
        
        return text;
    }
}
