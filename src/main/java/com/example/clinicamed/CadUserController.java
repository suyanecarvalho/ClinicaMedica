package com.example.clinicamed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class CadUserController implements Initializable {
    private Stage stage;
    public Stage getStage() {
        return stage;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }

 @FXML
 void onClickCadastrar(ActionEvent event) throws IOException {
    Alert painel=new Alert(Alert.AlertType.CONFIRMATION);
    painel.setTitle("Pergunta");
    painel.setContentText(">>Cadastro efetuado com sucesso<<");
    painel.setHeaderText("Deseja voltar para Login?");
    ButtonType btnSim= ButtonType.YES;
    ButtonType btnNao= ButtonType.NO;
    painel.getButtonTypes().setAll(btnSim,btnNao);
    Optional<ButtonType> btnClicado=painel.showAndWait();

    if (btnClicado.get()==btnSim){
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/clinicamed/login.fxml"));
            Parent logFxml= fxmlLoader.load();

            LoginController cadController= fxmlLoader.getController();
            Scene loginScene = new Scene(logFxml);
            this.getStage().setScene(loginScene);
            this.getStage().setTitle("cadastro paciente");
            this.stage.show();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
    public void configuraStage(){
        this.setStage(new Stage());

        this.getStage().initModality(Modality.APPLICATION_MODAL);
        this.getStage().resizableProperty().setValue(Boolean.FALSE);    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.configuraStage();
        // fechar();
    }
}
