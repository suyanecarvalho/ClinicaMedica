package com.example.clinicamed;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends javafx.application.Application {
    private static Stage stage;
    public static Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage stage)   {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/clinicamed/login.fxml"));
            Parent logFxml= fxmlLoader.load();
            LoginController cadController= fxmlLoader.getController();

            Scene loginScene = new Scene(logFxml);
            Stage janelaLogin= new Stage();
            janelaLogin.initModality(Modality.APPLICATION_MODAL);

            //n podera redimensionar
            janelaLogin.resizableProperty().setValue(Boolean.FALSE);
            janelaLogin.close();;
            janelaLogin.setScene(loginScene);

            janelaLogin.setTitle("Tela de Login ");
            janelaLogin.setOnCloseRequest(e->{
                if (cadController.onCloseQuery()){
                    System.exit(0);
                }else {
                    e.consume();
                }
            });
            janelaLogin.show();



        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}