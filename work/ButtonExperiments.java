
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

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

public class ButtonExperiments extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Start Button");

        
        Button button1 = new Button("Start");
        button1.setStyle("-fx-background-color: LIGHTBLUE; -fx-font-size: 2em; ");
        HBox hbox = new HBox(button1);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER); 

       FileInputStream input = new FileInputStream("f:\\gfg.png"); 
  
            // create a image 
           
  
            // create Background 
          
          
  


        Scene scene = new Scene(hbox, 400, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}