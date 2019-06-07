
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.canvas.*; 
import javafx.scene.web.*; 
import javafx.scene.layout.*; 
import javafx.scene.image.*; 
import java.io.*; 
import javafx.geometry.*; 
import javafx.scene.Group; 
import javafx.scene.paint.*; 

import javafx.scene.text.*;
import javafx.animation.FadeTransition;
import javafx.util.Duration;  


public class ButtonExperiments extends Application  {
    Pane firstRoot = new Pane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Start Button");

        //button
        
        //Scene scene = new Scene(hbox, 400, 100);

        // String file = "https://lh3.googleusercontent.com/-yrdopK7xOaM/XOdXHEXMJeI/AAAAAAAAGFw/9X_k5ySNe6oR4RdashVq8AIGybYb2XfcgCK8BGAs/s512/2019-05-23.jpg";
        // FileInputStream input = new FileInputStream(file);
        // Image image = new Image(input);
        // ImageView startPic = new ImageView(image);

        // Rectangle bg = new Rectangle(720,950);
        // firstRoot.getChildren().add(startPic);

        // Scene scene = new Scene(firstRoot);
        // primaryStage.setScene(scene);
        // primaryStage.show();
        // */

        //Rectangle bg = new Rectangle(720, 950);

        String file = "https://drive.google.com/uc?id=1GjRpHN-aSmvQ3c4hJZJhmm6-gytwf8Ma";
        Image image = new Image(file);
        ImageView startPic = new ImageView(image);

        
        
       
        Button button1 = new Button("Start");
        button1.setStyle("-fx-background-color: BLACK; -fx-font-size: 2em; ");
        HBox hbox = new HBox(button1);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER); 

        Pane root = new Pane();
        // root.getChildren().addAll(startPic);
        root.getChildren().add(startPic);

        Scene start = new Scene(root);
        primaryStage.setScene(start);

        primaryStage.setWidth(720);
        primaryStage.setHeight(950);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}