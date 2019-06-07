
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

        
        TextFlow text_flow = new TextFlow(); 
        // create text 
        Text text_1 = new Text("H"); 
        Text text_2 = new Text("O"); 
        Text text_3 = new Text("M"); 
        Text text_4 = new Text("E");

        // set the text color 
        text_1.setFill(Color.WHITE); 

        // set font of the text 
        text_1.setFont(Font.font("Montserrat", FontWeight.EXTRA_BOLD, 100)); 
        text_2.setFont(Font.font("Montserrat", FontWeight.EXTRA_BOLD, 100));
        text_3.setFont(Font.font("Montserrat", FontWeight.EXTRA_BOLD, 100));
        text_4.setFont(Font.font("Montserrat", FontWeight.EXTRA_BOLD, 100));

        text_1.setRotate(-30);
        text_2.setRotate(-30);
        text_3.setRotate(-30);
        text_4.setRotate(-30);

        // set text 
        text_flow.getChildren().add(text_1); 
        text_flow.getChildren().add(text_2); 
        text_flow.getChildren().add(text_3); 
        text_flow.getChildren().add(text_4); 

        // set text Alignment 
       // text_flow.setTextAlignment(TextAlignment.CENTER); 

        // set line spacing 
        text_flow.setLineSpacing(20.0f); 

        // create VBox 
        VBox vbox = new VBox(text_flow); 

        // set alignment of vbox 
        vbox.setAlignment(Pos.CENTER); 

        //FadeTransition fade = new FadeTransition(); 

        FadeTransition fade1 = new FadeTransition(Duration.millis(5000), text_1); 
        FadeTransition fade2 = new FadeTransition(Duration.millis(6000), text_1); 
        FadeTransition fade3 = new FadeTransition(Duration.millis(7000), text_1); 
        FadeTransition fade4 = new FadeTransition(Duration.millis(8000), text_1); 

        //fade.setDuration(Duration.millis(5000), text_1);  
        fade1.setFromValue(0);  
        fade1.setToValue(10);  

        fade2.setFromValue(0);  
        fade2.setToValue(10);  

        fade3.setFromValue(0);  
        fade3.setToValue(10);

        fade4.setFromValue(0);  
        fade4.setToValue(10);

        //fade1.setCycleCount(1000);  
        fade1.setNode(text_1);  
        fade2.setNode(text_2); 
        fade3.setNode(text_3);
        fade4.setNode(text_4);

        fade1.play(); 
        fade2.play(); 
        fade3.play();
        fade4.play();;

       
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