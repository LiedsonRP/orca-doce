/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resources;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

/**
 *
 * @author lieds
 */
public class StageManagement {
    
    Stage stage = new Stage();
    
    public Stage createPopUpStage(String scene_path, Node owner) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(scene_path));
        Scene scene = new Scene(root);
               
        this.stage.setScene(scene);        
        this.stage.initModality(Modality.APPLICATION_MODAL);        
        this.stage.initOwner(owner.getScene().getWindow());
        
        this.stage.initStyle(StageStyle.UNDECORATED);
        this.stage.centerOnScreen();                 
        
        this.stage.showAndWait();
        
        return stage;
    }
    
    public Stage createStage(String scene_path) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(scene_path));
        Scene scene = new Scene(root);        
        
        this.stage.setScene(scene);
        this.stage.show();
        
        return stage;
    }
    
    public void closeStage(Node component) {
        this.stage = (Stage) component.getScene().getWindow();
        stage.close();
    }
    
}
