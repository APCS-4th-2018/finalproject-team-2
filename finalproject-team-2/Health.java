import javafx.scene.layout.Pane;
import javafx.scene.image.*;
import javafx.scene.Node;
/**
 * Write a description of class Health here.
 *
 * @author Manjari Senthilkumar
 * @version 6/5/2019
// */
public class Health
{
    private final int FULL = 100;
    int health = FULL;
    ImageView barimgV;
    public Health(Pane root) throws Exception
    {
        barimgV = Game.convertImageView("C:\\Users\\Manjari\\Desktop\\platform game\\graphics\\healthbar2.png");
        barimgV.setX(160);
        //barimgV.setPreserveRatio(true);
        //barimgV.setFitWidth(200);
        //barimgV.setFitHeight(20);
        //barimgV.setLayoutX(200);
        root.getChildren().add(barimgV);
        
        
    }
    public void update(Node player)
    {
        
        barimgV.setTranslateY(player.getTranslateY()-750);
        //change imageViewport with the change Listener
        //implemented in update class
    }
    public boolean isAlive()
    {
        if(health < 1)
            return false;
        else
            return true;
    }
    
    public void setFull()
    {
        health = FULL;
        //addListener part;
    }
    
}
