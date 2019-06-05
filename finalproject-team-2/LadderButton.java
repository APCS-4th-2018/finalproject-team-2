import javafx.scene.shape.Line;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;

import javafx.animation.PathTransition;

import javafx.util.Duration;
/**
 * Write a description of class LadderButton here.
 *
 * @author Manjari Senthilkumar
 * @version 06/04/2019
 */
public class LadderButton extends Button
{
    private PathTransition ptr;
    private Node myLadder;
    private Line path;
    private int posX, posY;
    public LadderButton(int ladX, int ladY, Pane root, Ladder ladder)
    {
       super.button = Game.createEntity(ladX+75, ladY+300, 20, 20, Color.RED, root);
       myLadder = ladder.getNode();
       posX, 
       path = new Line(l, ladY, posX, posY - 500);
    }
    
    public void function(Node player)
    {
        ptr = new PathTransition();
        ptr.setNode(myLadder);
        ptr.setDuration(Duration.seconds(3));
        ptr.setPath(path);
    }
}
