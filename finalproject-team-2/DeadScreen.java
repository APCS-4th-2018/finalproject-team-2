import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Modality;
import javafx.scene.image.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
/**
 * Write a description of JavaFX class DeadScreen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeadScreen 
{
    private boolean answer;
    
    /**
     * default contructor that initialzes answer 
     */
    public DeadScreen()
    {
        answer = false;
    }
    
    /**
     * invokes popup screen with "RESTART" and "QUIT" buttons
     * 
     * @return        true if user clicked "RESTART" and false if user clicked "QUIT"
     */
    public boolean display()
    {
        Stage stage = new Stage();
       
        //set background image
        Pane pane = new Pane(Graphics.getDeathScreen());
        
        //create, add, and modify text
        Label label = new Label("PLAYER DIED");
        pane.getChildren().add(label);
        label.setTextFill(Color.web("#FFFFFF"));
        label.setFont(Font.font("Quicksand", 20));
        label.setLayoutX(70);
        label.setLayoutY(50);
        
        //create, add, and modify restart button
        Button restart = new Button("RESTART");
        restart.setOnAction(e ->{
            answer = true; //change answer
            stage.close();
        });
        pane.getChildren().add(restart);
        restart.setLayoutX(60);
        restart.setLayoutY(120);
        restart.setEffect(new DropShadow());
       
        //create, add, and modify quit button
        Button quit = new Button("QUIT");
         quit.setOnAction(e ->{
            stage.close();  //answer remains false
        });
        pane.getChildren().add(quit);
        quit.setLayoutX(160);
        quit.setLayoutY(120);
        quit.setEffect(new DropShadow());
        
        Scene scene = new Scene(pane, 250, 250);
        stage.setScene(scene);
        
        stage.initModality(Modality.APPLICATION_MODAL); //prevent user from making changes to main window
        stage.initStyle(StageStyle.UNDECORATED); //removes buttons(minimize, maximize, close)
        stage.setResizable(false);
        stage.showAndWait();
        return answer;
    }

}
