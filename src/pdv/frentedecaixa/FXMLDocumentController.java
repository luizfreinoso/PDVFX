/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdv.frentedecaixa;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Luiz Fernando Reinos
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label status;
    @FXML
    private AnchorPane principal;
    @FXML
    private TextField codigo;
    @FXML
    private TextField codigo_barra;
    @FXML
    private TextField quantidade;
    @FXML
    private TextField tipo;
    @FXML 
    private TextField valor;
    @FXML 
    private Label valor_total;
    
    public enum Atalhos{
        F2(KeyCode.F2),
        F3(KeyCode.F3),
        F4(KeyCode.F4),
        F5(KeyCode.F5),
        F6(KeyCode.F6),
        F7(KeyCode.F7),
        F8(KeyCode.F8),
        F9(KeyCode.F9);
        
        private KeyCode codigo;
        
        Atalhos(KeyCode valor){
            codigo = valor;
        }
    }
    
    @FXML
    public void handle(KeyEvent ke) {
        KeyCode code = ke.getCode();
        switch(code){
            case F2:
                codigo.requestFocus();
                break;
            case F3:
                System.out.println("Key Released: " + ke.getCode().getName());
                break;
            case F4:
                System.out.println("Key Released: " + ke.getCode().getName());
                break;
            case F5:
                System.out.println("Key Released: " + ke.getCode().getName());
                break;
            case F6:
                System.out.println("Key Released: " + ke.getCode().getName());
                break;
            case F7:
                System.out.println("Key Released: " + ke.getCode().getName());
                break;
            case F8:
                System.out.println("Key Released: " + ke.getCode().getName());
                break;
            case F9:
                loadView("FXMLBuscaProduto.fxml", "Buscar Por Produto");
                break;
            case F12:
                this.principal.requestFocus();
                break;
            default:
                System.out.println("Key Released: " + ke.getCode().getName());
        }
        this.principal.requestFocus();
    }
    
    @FXML
    public void cancelar(KeyEvent ke) {
        KeyCode code = ke.getCode();
        if(code == KeyCode.F12){
            System.out.println("Key Released: " + ke.getCode().getName());
            this.principal.requestFocus();
        }
    }
    
    private void loadView(String FXMLName, String titulo){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXMLName));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle(titulo); 
            Scene scene = new Scene(root1);
            scene.setOnKeyPressed((final KeyEvent keyEvent) -> {
                if (keyEvent.getCode() == KeyCode.F12) {
                    stage.close();
                    keyEvent.consume();
                }
            });
            stage.setScene(scene); 
            stage.centerOnScreen();
            stage.show();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
}
