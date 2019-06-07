import javafx.scene.shape.Line;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;

import javafx.animation.PathTransition;

import javafx.util.Duration;
/**
 *  This class represents LadderButton, which when pressed takes the player up the ladder.
 *
 * @author Manjari Senthilkumar
 * @version 06/04/2019
 */
public class LadderButton extends Button
{
    //instance variables
    private PathTransition ptr;
    private Node myLadder;
    private Line path;
    private double posX, posY;
       /**
     * Constructor for LadderButton
     * @param ladder x, y coordinates
     * @param root pane
     * @param ladder object
     * initialize and construts button
     */
    public LadderButton(int ladX, int ladY, Pane root, Ladder ladder)
    {
       //initialize
        super.button = Game.createEntity(ladX+65, ladY+280, 20, 20, Color.TRANSPARENT, root);
       myLadder = ladder.getNode();
       posX = ladX + ladder.getWidth()/2.0;
       posY = ladY + ladder.getHeight();
       
    }
     /**
     * performs function if @param player intersects bounds with button
     */

    public void function(Node player)
    {
        //trigger functionality - transition up
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
