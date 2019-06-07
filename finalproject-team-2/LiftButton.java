import javafx.scene.Node;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

import javafx.animation.PathTransition;
import javafx.animation.KeyValue;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.geometry.Point2D;

import javafx.util.Duration;
import java.util.Timer; 
import java.util.TimerTask; 
/**
 * class LiftButton here.
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public class LiftButton extends Button
{
    //instance variables
    private Node myLift;
    private Build build;
    private PhysicsMove phys;
    private Pane groot;
    private PathTransition ptr, ptrRev, ptrp;
    private Line path,pathRev, pathp;
    private double posX, posY;
    private Group liftGroup;
  
    
    /**
     * @param lift x, y coordinates
     * @param root pane
     * @param lift object
     * initialize and construts button
     */
    public LiftButton( int liftX, int liftY, Lift lift, Pane root)
    {
        super.button = Game.createEntity(liftX+65, liftY-10, 20, 20, Color.TRANSPARENT, root);
        myLift = lift.getNode();
        groot = root;
        //liftGroup = new Group();
    
        //positoins
        posX = myLift.getTranslateX()+75;
        posY = myLift.getTranslateY()+20;
        path = new Line(posX, posY, posX, posY - 500);//moves up 500 and back
        pathRev = new Line(posX, posY-500, posX, posY); // moves back to original coordinates
        pathp = new Line(posX, posY+10, posX, posY - 500);// path for the player
        // reverse path not needed for the player as player will get off at the platform

        
        //transition - initialize
        ptr = new PathTransition();
        ptr.setNode(myLift);
        ptr.setDuration(Duration.seconds(1.5));
        ptr.setPath(path);
        ptr.setCycleCount(2);
        ptr.setAutoReverse(true);

        
        
        //transition - player
        ptrp = new PathTransition();
        ptrp.setDuration(Duration.seconds(1.5));
        ptrp.setCycleCount(1);
        //ptrp.setAutoReverse(true);
      
        
    }
     /**
     * performs lift function if button isPressed 
     * @param player who presses
     */
    public void function(Node player)
    {
        //build = new Build(0, groot, new Point2D(0,0));
        //phys = new PhysicsMove(build.getPlatform());
        if(isPressed(player)){
            
            //move the player up the lift
            pathp.setStartX(player.getTranslateX());
            pathp.setStartY(player.getTranslateY());
            pathp.setEndX(player.getTranslateX());
            pathp.setEndY(player.getTranslateY()-500);
            ptrp.setPath(pathp);
            ptrp.setNode(player);
            ptrp.play();
            
            //move the lift up
            ptr.play();
            
           
        }
    }
    
    
}
