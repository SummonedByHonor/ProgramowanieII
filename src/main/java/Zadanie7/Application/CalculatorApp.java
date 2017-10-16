package Zadanie7.Application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorApp extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent loader = FXMLLoader.load(this.getClass().getResource("/FXML/Calculator.fxml"));
        Scene scene = new Scene(loader);
        primaryStage.setTitle("Kalkulator");

        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
