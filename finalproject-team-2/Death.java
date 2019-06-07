import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
/**
 * Write a description of class Death here.
 *
 * @author Megha K
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
        
        scene = new Scene(label, 100,150);
        stage.setScene(scene);
        stage.show();
    }
}
