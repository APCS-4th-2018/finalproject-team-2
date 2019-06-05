import javafx.scene.shape.Line;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;

import javafx.animation.PathTransition;

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
    public PortalButton(Pane root, Portal portal)
    {
       posX = portal.getXPos() + portal.getWidth()/4;
       width = portal.getWidth()/2;
       posY = portal.getYPos() + portal.getHeight()/2;
       height = portal.getHeight()/2;
       super.button = Game.createEntity(posX, posY, width,height, Color.RED, root);
       myPortal = portal.getNode();
       path = new Line(posX,posY,posX,posY-500);     
    }
    
    public void function(Node player)
    {
        if(super.isPressed(player)){
        ptr = new PathTransition();
        ptr.setNode(player);
        ptr.setDuration(Duration.seconds(2));
        ptr.setPath(path);
        ptr.play();
    }
    }
}