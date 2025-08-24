package main.java.com.exemplo.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Agora, o nome do arquivo está correto.
        Parent root = FXMLLoader.load(getClass().getResource("/AbaPrincipal.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Minha Aplicação JavaFX");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}