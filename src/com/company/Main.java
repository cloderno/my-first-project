import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.util.Scanner;

public class Main extends Application {

    Button button;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Numbers Game");

        //кнопка 1
        button = new Button ("Click me");
        button.setOnAction(e -> System.out.println("I love when you touch it"));



        //макет
        StackPane layout = new StackPane();
        layout.getChildren().add(button);


        //сцена
        Scene scene = new Scene(layout,500,350);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
