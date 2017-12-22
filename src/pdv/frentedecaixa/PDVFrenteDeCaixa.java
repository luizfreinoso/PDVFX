/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdv.frentedecaixa;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Luiz Fernando Reinos
 */
public class PDVFrenteDeCaixa extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(PDVFrenteDeCaixa.class.getResource("fxmldocument.css").toExternalForm());
        
//        scene.setOnKeyPressed((final KeyEvent keyEvent) -> {
//            if (keyEvent.getCode() == KeyCode.F12) {
//                AnchorPane p = (AnchorPane) scene.lookup("#principal");
//                p.requestFocus();
//                keyEvent.consume();
//            }
//        });
        
        stage.setScene(scene);
        //stage.setMaximized(true);
        //stage.setFullScreen(true);
        
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
