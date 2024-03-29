import javafx.scene.layout.Pane;
import javafx.scene.image.*;
import javafx.scene.Node;

import javafx.geometry.Rectangle2D;
/**
 * Health class
 *
 * @author Manjari Senthilkumar
 * @version 6/5/2019
// */
public class Health
{
    //instance variables
    private final int FULL = 2000;
    private final int stepsize = 5;
    int health = FULL;
    boolean recharged = false;
    ImageView barimgV;
    int width;
    Death death;
    Node myPlayer;
      /**
     * constructs and initializes health object
     * @param root pane
     */
    public Health(Pane root) throws Exception
    {
        //initialize
        barimgV = Game.convertImageView("graphics\\healthbar2.png");
        barimgV.setX(160);
        //barimgV.setPreserveRatio(true);
        //barimgV.setFitWidth(200);
        //barimgV.setFitHeight(20);
        //barimgV.setLayoutX(200);
        root.getChildren().add(barimgV);

    }
    /** 
     * decrement health
     * set health bar constantly on top of screen, refer to player
     */
    public void update(Node player)
    {
        //decrement health
        health--;
        //cam location stable
        barimgV.setTranslateY(player.getTranslateY()-550);
        if (health > 0 & (health % stepsize) == 0 )
        {
             barimgV.setViewport(new Rectangle2D(0,0,health/stepsize,20));
        }
    }
     /**
     * @return true if alive false if not
     */
    public boolean isAlive()
    {
        //life stats
        if(health < 1)
            return false;
        else
            return true;
    }
    /**
     * set Full 
     */
    public void setFull()
    {
        health = FULL;
       // barimgV.setViewport(new Rectangle2D(0,0,health,20));

        //recharged = true;
        //addListener part;
    }

}
