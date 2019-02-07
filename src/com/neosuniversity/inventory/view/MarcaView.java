package com.neosuniversity.inventory.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MarcaView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/marca.fxml"));
        primaryStage.setTitle("Nueva Marca");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
