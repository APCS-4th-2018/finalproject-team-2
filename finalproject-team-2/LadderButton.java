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
    private double posX, posY;
    public LadderButton(int ladX, int ladY, Pane root, Ladder ladder)
    {
       super.button = Game.createEntity(ladX+65, ladY+280, 20, 20, Color.RED, root);
       myLadder = ladder.getNode();
       posX = ladX + ladder.getWidth()/2.0;
       posY = ladY + ladder.getHeight();
       
    }
    
    public void function(Node player)
    {
        if(super.isPressed(player)){
        ptr = new PathTransition();
        path = new Line(player.getTranslateX(), player.getTranslateY(), player.getTranslateX(), player.getTranslateY()-370);
        ptr.setNode(player);
        ptr.setDuration(Duration.seconds(2));
        ptr.setPath(path);
        ptr.play();
    }
    }
}
