package controller.forms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;

import database.entities.Embalagem;
import database.dao.EmbalagemDAO;
import database.DbSearch;

import resources.maskInputs;
import resources.StageManagement;

public class cadastroEmbalagemController {

    @FXML
    private Button btnCadastrarEmb;

    @FXML
    private Button btnCancelarEmb;
    
    @FXML
    private Button btnClosePopUp;

    @FXML
    private TextField inputNomeEmb;

    @FXML
    private TextField inputPrecoPac;

    @FXML
    private TextField inputQuantEmb;
    
    @FXML
    private Label nameLabelMessage;

    @FXML
    private Label priceLabelMessage;

    @FXML
    private Label quantLabelMessage;
    
    @FXML
    private Label DbLabelMessage;


    @FXML
    void cancelRegister(MouseEvent event) {
        StageManagement stage = new StageManagement();
        stage.closeStage(this.btnCancelarEmb);
    }
    

    @FXML
    void registerPacking(MouseEvent event) {
        Embalagem emb = new Embalagem();
        EmbalagemDAO embDAO = new EmbalagemDAO();
        int ocurrences = 0;
        
        boolean[] validateFields = {this.validadeNameField(), 
            this.validatePriceField(), this.validadeQuantField(), this.validadeValueNotDuplicate()};
       
        for (boolean isValid : validateFields){
            if (!isValid) {
                ocurrences++;
            }
        }
        
        if (ocurrences == 0) {
            String namePacking = this.inputNomeEmb.getText();
            float pricePacking = removeMoneyFormat();
            int quantPacking = Integer.parseInt(inputQuantEmb.getText());
            float price_unit = emb.calcPrecoUnidade(quantPacking, pricePacking);                        
            
            emb.setNomeEmbalagem(namePacking);
            emb.setQuantidade_pacote(quantPacking);
            emb.setPreco_pacote(pricePacking);
            emb.setPreco_unidade(price_unit);
            
            System.out.println("funcionou");
            embDAO.insertInto(emb);
            
            StageManagement stage = new StageManagement();
            stage.closeStage(this.btnCancelarEmb);
        }
    }
    
    @FXML
    void formatPriceValue(MouseEvent event) {
        String inputField = inputPrecoPac.getText();
        
        if(!inputField.isEmpty()) {
            String inputNumber = inputPrecoPac.getText();            
            String formatedNumber = maskInputs.format_money(inputNumber, ",");
            inputPrecoPac.setText(formatedNumber);
        }
    }
    
    private float removeMoneyFormat() {
        String priceField = maskInputs.remove_format_money(this.inputPrecoPac.getText(), ",");
        float priceFieldFormatted = Float.parseFloat(priceField);        
        
        return priceFieldFormatted;
        
    }
    
    private boolean validatePriceField() {                
        String priceField = this.inputPrecoPac.getText();
        boolean isValueValid = false;                
        
        if(priceField.isEmpty()) {
            this.priceLabelMessage.setText("O campo deve ser obrigatoriamente preenchido!");
            this.priceLabelMessage.setVisible(true);
            isValueValid = false;
        } else {
            this.priceLabelMessage.setText("");
            this.priceLabelMessage.setVisible(false);
            isValueValid = true;
        }
        
        return isValueValid;
    }
    
    private boolean validadeNameField() {
        String nameField = this.inputNomeEmb.getText();
        boolean isValueValid = false;
        
        if(nameField.isEmpty()) {
            this.nameLabelMessage.setText("O campo deve ser obrigatoriamente preenchido!");
            this.nameLabelMessage.setVisible(true);
            isValueValid = false;
        } else {
            this.nameLabelMessage.setText("");
            this.nameLabelMessage.setVisible(false);
            isValueValid = true;
        }
        
        return isValueValid;
    }
    
    private boolean validadeQuantField() {
        String quantField = this.inputQuantEmb.getText();
        boolean isValueValid = false;
        int ocurrences = 0;
        
        if(quantField.isEmpty()) {
            this.quantLabelMessage.setText("O campo deve ser preenchido!");
            this.quantLabelMessage.setVisible(true);            
            ocurrences++;
        } else {
            this.quantLabelMessage.setText("");
            this.quantLabelMessage.setVisible(false);
        }
        
        try {
            int valor = Integer.parseInt(quantField);
            this.quantLabelMessage.setVisible(false);
        } catch(NumberFormatException ex) {
            this.quantLabelMessage.setText("O campo apenas aceita n??meros inteiros!");
            this.quantLabelMessage.setVisible(true);
            ocurrences++;                    
        }
        
        if (ocurrences>0) {
            isValueValid = false;
        } else {
            isValueValid = true;
        }
        
        return isValueValid;
    }
    
    private boolean validadeValueNotDuplicate() {
        String tableName = "orcadocedb.embalagem";
        String fieldName = "nome_embalagem";
        
        String value = this.inputNomeEmb.getText();
        
        DbSearch filter = new DbSearch();
        boolean isValid = false;
        
        isValid = filter.valueExists(tableName, fieldName, value);
        
        if (!isValid) {
            this.DbLabelMessage.setText("Uma mesma embalagem n??o pode ser cadastrada 2 vezes!");
            this.DbLabelMessage.setVisible(true);
        } else {
            this.DbLabelMessage.setText("");
            this.DbLabelMessage.setVisible(false);
        }
        
        return isValid;
    }
}
