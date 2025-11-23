package br.unipar.atividadesfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        Parent root = FXMLLoader.load(
                HelloApplication.class.getResource("HubInicial.fxml")
        );

        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Atividades FX");
        stage.setScene(scene);
        stage.show();
    }

    public static void mudarCena(String fxmlNome) {
        try {
            Parent root = FXMLLoader.load(
                    HelloApplication.class.getResource(fxmlNome + ".fxml")
            );
            Scene scene = new Scene(root, 500, 500);
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
