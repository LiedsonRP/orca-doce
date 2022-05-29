package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import resources.StageManagement;

public class consultarItensController {
    
    String[] scenesPath = {"../view/cadastro-embalagem.fxml"};
    StageManagement stage = new StageManagement();
    Stage actualForm;

    @FXML
    private Button btnCadastrarEmb;

    @FXML
    private Button btnCadastrarItemCompost;

    @FXML
    private Button btnCadastrarItemSimples;

    @FXML
    private Button btnCadastrarTerceirizacao;

    @FXML
    void cadastrarEmbalagem(MouseEvent event) throws Exception  {   
        this.actualForm = this.stage.createPopUpStage(scenesPath[0], this.btnCadastrarEmb);                
    }

    @FXML
    void cadastrarItemComposto(MouseEvent event) {

    }

    @FXML
    void cadastrarItemSimples(MouseEvent event) {

    }

    @FXML
    void cadastrarTerceirizacao(MouseEvent event) {

    }

}
