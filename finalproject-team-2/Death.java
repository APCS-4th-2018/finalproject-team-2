import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.scene.image.*;
/**
 * Write a description of class Death here.
 *
 * @author Megha K, Manjari Senthilkumar
 * @version 06/06/2019
 */
public class Death
{
    private Scene death;
    private Stage stage;
    private Scene play;
    private Scene bgSc;
    private ImageView bgImg;
    private Pane root = new Pane();
    public Death(Scene play)
    { 
        
    }
    public void show()
    {
        
        stage = new Stage();
        
        //Label label = new Label("Congrats you died! lol");
        Button button1= new Button("restart");
        button1.setOnAction(e -> stage.setScene(play));   
        VBox layout1 = new VBox(20);     
        layout1.getChildren().addAll( button1);
        death = new Scene(layout1);
        stage.setScene(death);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
    public Scene getScene() throws Exception
    {
       bgImg = Game.convertImageView("C:\\Users\\Manjari\\Desktop\\platform game\\graphics\\death screen.jpg");
       root.getChildren().add(bgImg);
       bgSc = new Scene(root);
       return bgSc;
    }
}
