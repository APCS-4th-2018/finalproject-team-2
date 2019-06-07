import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.scene.image.*;
import javafx.application.Platform;
/**
 * When char dies
 *
 * @author Manjari Senthilkumar
 * @version 06/06/2019
 */
public class Death
{
    //initialize
    private Scene death;
    private Stage stage;
    private Scene play;
    private Scene bgSc;
    private ImageView bgImg;
    private Pane root = new Pane();
    private Rain[] rain = new Rain[8];
    /**
     * constructs death object
     */
    public Death(Scene play, Stage st) throws Exception
    { 
        bgImg = Game.convertImageView("graphics\\death screen.jpg");
       root.getChildren().add(bgImg);
       for(int i = 0; i < rain.length; i++)
            rain[i] = new Rain(root);
    }
     /**
     * shows exit screen - new stage
     */
    public void show()
    {
        //new screen
        stage = new Stage();
        //create buttom
        //Label label = new Label("Congrats you died! lol");
        Button button1= new Button("You are Dead. Restart the game");
        button1.setOnAction(e -> Platform.exit());   
        VBox layout1 = new VBox(20);     
        layout1.getChildren().addAll( button1);//add btt
        death = new Scene(layout1);
        stage.setScene(death);
        stage.initModality(Modality.APPLICATION_MODAL);//unable to close
        stage.show();
    }
    /**
     * gives death scene to be implemented
     * @return the death scene
     */

    public Scene getScene()
    {
       //death scene
       bgSc = new Scene(root);
       for(int i = 0; i < rain.length; i++)
            rain[i].move();
       
       return bgSc;
    }
    public void rainfall()
    {
        
    }
}
