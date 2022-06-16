import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.layout.*; 
import javafx.scene.paint.*; 
import javafx.scene.text.*; 
import javafx.geometry.*; 
import javafx.scene.layout.*; 
import javafx.scene.shape.*; 
import javafx.animation.FadeTransition;
import javafx.util.Duration;  
import javafx.scene.image.*;
/**
 * @author Marwa Danish, Manjari Senthilkumar
 * @version 06/07/2019
 */
public class StartScreen { 

    Scene myScene;
    VBox vbox;
    private ImageView bgImg;
    
    // launch the application 
    /**
     * constructor to launch scene
     */
    public StartScreen(Stage stage) 
    { 

        try { 
            
            String file = "graphics\\startScreen.png";
            try {
                bgImg = Game.convertImageView(file);
            } catch (java.lang.Exception e) {
                System.out.println("File not found " + file);
            }
            

            // create TextFlow 
            TextFlow text_flow = new TextFlow(); 

            // create text 
            Text text_1 = new Text("H"); 
            Text text_2 = new Text("O"); 
            Text text_3 = new Text("M"); 
            Text text_4 = new Text("E");

            // set the text color 
            text_1.setFill(Color.BLACK); 

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
            text_flow.setTextAlignment(TextAlignment.CENTER); 

            // set line spacing 
            text_flow.setLineSpacing(20.0f); 

            // create VBox 
            vbox = new VBox(text_flow); 

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

            // create a scene 
            //myScene = new Scene(vbox, 800, 800); 
        } 

        catch (Exception e) { 

            System.out.println(e.getMessage()); 
        } 
    } 

    public Scene getScene()
    {
        return myScene;
    }

    public VBox getVbox()
    {
        return vbox;
    }
} 

