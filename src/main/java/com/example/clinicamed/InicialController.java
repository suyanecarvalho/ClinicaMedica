package com.example.clinicamed;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class InicialController implements Initializable {
    @FXML
    private Hyperlink planoSaude;
    @FXML
    private Hyperlink agendarConsulta;
    private Stage stage;
    public Stage getStage() {
        return stage;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void clickPlanoSaude(ActionEvent event){
        System.out.println("clicouu no plano de saude");
        planoSaude.hoverProperty();

    }

    @FXML
    void clickAgendar(ActionEvent event) {

        System.out.println("clicouu no agendamento");
        agendarConsulta.hoverProperty();
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/clinicamed/agendamento.fxml"));
            Parent logFxml= fxmlLoader.load();

            //CadUserController cadController= fxmlLoader.getController();
            Scene loginScene = new Scene(logFxml);
            this.getStage().setScene(loginScene);
            //this.getStage().setTitle("Agendamento");
            this.stage.show();



        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public void clickUser(){
        System.out.println("clicouu");
    }
    public void clickSaida(){
        Alert painel=new Alert(Alert.AlertType.WARNING);
        painel.setTitle("Janela de Saída");
        painel.setHeaderText("ATENÇÃO!\nDESEJA SAIR DO SISTEMA?");
        ButtonType btnSim= ButtonType.YES;
        ButtonType btnNao= ButtonType.NO;
        painel.getButtonTypes().setAll(btnSim,btnNao);
        Optional<ButtonType> btnClicado=painel.showAndWait();

        if (btnClicado.get()==btnSim){
            System.exit(0);

        }
    }


    public void configuraStage(){

        this.setStage(new Stage());

        this.getStage().initModality(Modality.APPLICATION_MODAL);
        this.getStage().resizableProperty().setValue(Boolean.FALSE);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.configuraStage();
    }

}
