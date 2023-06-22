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
    public void start(Stage primaryStage)   {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/clinicamed/login.fxml"));
            Parent logFxml= fxmlLoader.load();
            LoginController cadController= fxmlLoader.getController();

            Scene loginScene = new Scene(logFxml);
           primaryStage.resizableProperty().setValue(Boolean.FALSE);   //redimensionamento
            primaryStage.setScene(loginScene);
           primaryStage.setTitle("Tela de Login ");
           primaryStage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}