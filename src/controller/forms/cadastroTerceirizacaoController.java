package controller.forms;

import database.DbSearch;
import database.entities.Terceirizacao;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import resources.StageManagement;
import resources.maskInputs;

public class cadastroTerceirizacaoController {

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnClosePopUp;

    @FXML
    private Label dbLabelMessage;

    @FXML
    private TextArea inputDescrpField;

    @FXML
    private TextField inputNameField;

    @FXML
    private TextField inputPriceField;

    @FXML
    private TextField inputQuantField;

    @FXML
    private Label nameLabelMessage;

    @FXML
    private Label priceLabelMessage;

    @FXML
    private Label quantLabelMessage;

    @FXML
    void closeRegister(MouseEvent event) {
        StageManagement stage = new StageManagement();
        stage.closeStage(this.btnClosePopUp);
    }

    @FXML
    void formatPriceValue(MouseEvent event) {
        String inputField = this.inputPriceField.getText();
        
        if(!inputField.isEmpty()) {
            String inputNumber = this.inputPriceField.getText();            
            String formatedNumber = maskInputs.format_money(inputNumber, ",");
            inputPriceField.setText(formatedNumber);
        }

    }

    @FXML
    void registerPacking(MouseEvent event) {
        Terceirizacao terc = new Terceirizacao();
        
        int ocurrences = 0;        
        boolean[] validateFields = {this.validadeNameField(), 
            this.validatePriceField(), this.validadeQuantField(), this.validadeValueNotDuplicate()};
        
        for (boolean isValid: validateFields) {
            if(!isValid) {
                ocurrences++;
            }
        }
        
        if(ocurrences == 0) {
            String nameFieldValue = this.inputNameField.getText();
            int quantFieldValue = Integer.parseInt(this.inputNameField.getText());
            float priceFieldValue = this.removeMoneyFormat();
            String descriptionFieldValue = this.inputDescrpField.getText();
            
            terc.setNome_terceirizacao(nameFieldValue);
            terc.setQuantidade_remessa(quantFieldValue);
            terc.setPreco_terceirizacao(priceFieldValue);
            terc.setDescricao(descriptionFieldValue);
        }
        
        
                
        
    }
    
    private float removeMoneyFormat() {
        String priceField = maskInputs.remove_format_money(this.inputPriceField.getText(), ",");
        float priceFieldFormatted = Float.parseFloat(priceField);        
        
        return priceFieldFormatted;
        
    }
    
    private boolean validadeNameField() {
        String nameField = this.inputNameField.getText();
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
    
    private boolean validatePriceField() {                
        String priceField = this.inputPriceField.getText();
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
    
    private boolean validadeQuantField() {
        String quantField = this.inputQuantField.getText();
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
            this.quantLabelMessage.setText("O campo apenas aceita números inteiros!");
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
        String tableName = "orcadocedb.item";
        String fieldName = "nome_item";
        
        String value = this.inputNameField.getText();
        
        DbSearch filter = new DbSearch();
        boolean isValid = false;
        
        isValid = filter.valueExists(tableName, fieldName, value);
        
        if (!isValid) {
            this.dbLabelMessage.setText("Uma mesma terceirização não pode ser cadastrada 2 vezes!");
            this.dbLabelMessage.setVisible(true);
        } else {
            this.dbLabelMessage.setText("");
            this.dbLabelMessage.setVisible(false);
        }
        
        return isValid;
    }

}
