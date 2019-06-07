import javafx.scene.shape.Line;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;

import javafx.animation.*;

import javafx.util.Duration;
/**
 * class portderButton here.
 *
 * @author Manjari Senthilkumar
 * @version 06/04/2019
 */
public class PortalButton extends Button
{
    //instance variables
    private PathTransition ptr;
    private Node myPortal;
    private Line path;
    private int posX, posY;
    private int width,height;
    private PauseTransition wait;
    /**
     * initialize constructor
     * @param root pane
     * @param portal class
     */
    public PortalButton(Pane root, Portal portal)
    {
       //initialize
        posX = portal.getXPos() + portal.getWidth()/2-10;
      
       posY = portal.getYPos()-10;
      //inherit
       super.button = Game.createEntity(posX, posY, 20,20, Color.RED, root);
       myPortal = portal.getNode();
       path = new Line(posX,posY,posX,posY-450);     
    }
    /**
     * perform function
     * @param who performs function
     */
    public void function(Node player)
    {
        if(super.isPressed(player)){
        
           //transitions
           wait = new PauseTransition(Duration.millis(1000));
           player.setTranslateX(player.getTranslateX()- 600);
           player.setTranslateY(player.getTranslateY()+300);
    }
    }
}