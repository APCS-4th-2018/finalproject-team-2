

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Write a description of JavaFX class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        
        Button bt1 = new Button("Press");

        Pane pane = new Pane(bt1);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        DeadScreen dead = new DeadScreen();
        bt1.setOnAction(e -> {
            boolean result = dead.display();
            if (result) pane.getChildren().remove(bt1);
    });
        Scene scene = new Scene(pane, 300,100);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);

        // Show the Stage (window)
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
