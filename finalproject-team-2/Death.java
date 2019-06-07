import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
/**
 * Write a description of class Death here.
 *
 * @author Megha K, Manjari Senthilkumar
 * @version 06/06/2019
 */
public class Death
{
    Scene scene;
    Stage stage;
    public Death()
    { 
        
    }
    public void show()
    {
        
        stage = new Stage();
        
        Label label = new Label("Congrats you died! lol");
        Button button1= new Button("Go to scene 2");
        button1.setOnAction(e -> stage.setScene(play));   
        VBox layout1 = new VBox(20);     
        layout1.getChildren().addAll( button1);
        scene = new Scene(label, 100,150);
        stage.setScene(scene);
        stage.show();
    }
}
