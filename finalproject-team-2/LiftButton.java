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
    private PathTransition ptr, ptrp;
    private Line path, pathp;
    private double posX, posY;
    private Group liftGroup;
  
    
    public LiftButton( int liftX, int liftY, Lift lift, Pane root)
    {
        super.button = Game.createEntity(liftX+65, liftY-10, 20, 20, Color.RED, root);
        myLift = lift.getNode();
        groot = root;
        //liftGroup = new Group();
        
        // Add the lift to the liftGroup
        //liftGroup.getChildren().add(myLift);
        //groot.getChildren().add(liftGroup);
        
        posX = myLift.getTranslateX()+75;
        posY = myLift.getTranslateY()+20;
        path = new Line(posX, posY, posX, posY - 500);//moves up 500 and back
        pathp = new Line(posX, posY-20, posX, posY - 520);
        

        
        //transition - initialize
        ptr = new PathTransition();
        ptr.setNode(myLift);
        ptr.setDuration(Duration.seconds(0.5));
        ptr.setPath(path);
        ptr.setCycleCount(2);
        ptr.setAutoReverse(true);
        
        //transition - player
        ptrp = new PathTransition();
        ptrp.setDuration(Duration.seconds(0.5));
        ptrp.setCycleCount(1);
        //ptrp.setAutoReverse(true);
      
        
    }
    
    public void function(Node player)
    {
        //build = new Build(0, groot, new Point2D(0,0));
        //phys = new PhysicsMove(build.getPlatform());
        if(isPressed(player)){
            
            pathp.setStartX(player.getTranslateX());
            pathp.setStartY(player.getTranslateY());
            pathp.setEndX(player.getTranslateX());
            pathp.setEndY(player.getTranslateY()-500);
            ptrp.setPath(pathp);
            ptrp.setNode(player);
            ptrp.play();
            
            //liftGroup.getChildren().add(player);
            ptr.play();
            //phys.moveY(-10,player);
            
            
        }
    }
    
    public void down()
    {
        System.out.println("Lift going down");
    }
}
