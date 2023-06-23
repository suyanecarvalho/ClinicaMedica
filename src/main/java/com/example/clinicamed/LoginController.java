package com.example.clinicamed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    private Stage stage;
    public Stage getStage() {
        return stage;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    void onClickLogin(ActionEvent event) {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/clinicamed/telaInicial.fxml"));
            Parent logFxml= fxmlLoader.load();

            InicialController cadController= fxmlLoader.getController();
            Scene loginScene = new Scene(logFxml);
            this.getStage().setScene(loginScene);
            this.getStage().setTitle("cadastro paciente");
            this.stage.show();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void onClickCadUser(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/clinicamed/cadastro.fxml"));
            Parent logFxml= fxmlLoader.load();

            CadUserController cadController= fxmlLoader.getController();
            Scene loginScene = new Scene(logFxml);
            this.getStage().setScene(loginScene);
            this.getStage().setTitle("cadastro paciente");
            this.stage.show();



        }catch (Exception e){
            e.printStackTrace();
        }

    }
//metodo para centralizar telas
    public void configuraStage(){

        this.setStage(new Stage());

        this.getStage().initModality(Modality.APPLICATION_MODAL);
        this.getStage().resizableProperty().setValue(Boolean.FALSE);
        }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.configuraStage();
        //fechar();
    }
    public static void fechar(){
        //Main.getStage().close();
    }
}
