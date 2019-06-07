import javafx.scene.shape.Line;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;

import javafx.animation.*;

import javafx.util.Duration;
/**
 * Write a description of class portderButton here.
 *
 * @author Manjari Senthilkumar
 * @version 06/04/2019
 */
public class PortalButton extends Button
{
    private PathTransition ptr;
    private Node myPortal;
    private Line path;
    private int posX, posY;
    private int width,height;
    private PauseTransition wait;
    public PortalButton(Pane root, Portal portal)
    {
       posX = portal.getXPos() + portal.getWidth()/2-10;
      
       posY = portal.getYPos()-10;
      
       super.button = Game.createEntity(posX, posY, 20,20, Color.RED, root);
       myPortal = portal.getNode();
       path = new Line(posX,posY,posX,posY-500);     
    }
    
    public void function(Node player)
    {
        if(super.isPressed(player)){
        /*
            ptr = new PathTransition();
            ptr.setNode(player);
            ptr.setDuration(Duration.seconds(2));
            ptr.setPath(path);
            //ptr.play();
            */
           wait = new PauseTransition(Duration.millis(1000));
           player.setTranslateX(player.getTranslateX()- 600);
           player.setTranslateY(player.getTranslateY()+300);
    }
    }
}