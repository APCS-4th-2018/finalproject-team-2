import javafx.scene.layout.Pane;
import javafx.scene.image.*;
import javafx.scene.Node;

import javafx.geometry.Rectangle2D;
/**
 * Write a description of class Health here.
 *
 * @author Manjari Senthilkumar
 * @version 6/5/2019
// */
public class Health
{
    private final int FULL = 400;
    private final int stepsize = 1;
    int health = FULL;
    boolean recharged = false;
    ImageView barimgV;
    int width;
    Death death;
    Node myPlayer;
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
        health--;
       
        barimgV.setTranslateY(player.getTranslateY()-750);
        if (health > 0 & (health % stepsize) == 0 )
        {
             barimgV.setViewport(new Rectangle2D(0,0,health/stepsize,20));
        }
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
       // barimgV.setViewport(new Rectangle2D(0,0,health,20));

        //recharged = true;
        //addListener part;
    }

}
