import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

import javafx.animation.PathTransition;
import javafx.animation.KeyValue;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.geometry.Point2D;

import javafx.util.Duration;
/**
 * Write a description of class LiftButton here.
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public class LiftButton extends Button
{
    private Node myLift;
    private Build build;
    private PhysicsMove phys;
    private Pane groot;
    private PathTransition ptr;
    private Line path;
    private double posX, posY;
    public LiftButton( int liftX, int liftY, Lift lift, Pane root)
    {
        super.button = Game.createEntity(liftX+65, liftY-10, 20, 20, Color.RED, root);
        myLift = lift.getNode();
        groot = root;
        posX = myLift.getTranslateX()+75;
        posY = myLift.getTranslateY()+20;
        path = new Line(posX, posY, posX, posY - 500);//moves up 500 and back
        
        //transition - initialize
        ptr = new PathTransition();
        ptr.setNode(myLift);
        ptr.setDuration(Duration.seconds(3));
        ptr.setPath(path);
        ptr.setCycleCount(2);
        ptr.setAutoReverse(true);
        
    }
    
    public void function(Node player)
    {
        //build = new Build(0, groot, new Point2D(0,0));
        //phys = new PhysicsMove(build.getPlatform());
        if(isPressed(player)){
            
            ptr.play();
            
        }
    }
}
