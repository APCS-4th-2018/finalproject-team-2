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
 * Write a description of class EndButton here.
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public class EndButton extends Button
{
    private Node myEndNode;
    private End  myEnd;
    private Build build;
    private PhysicsMove phys;
    private Pane groot;
    private PathTransition ptr, ptrRev, ptrp;
    private Line path,pathRev, pathp;
    private double posX, posY;
    private Group EndGroup;
    private boolean gameEnded = false;
  
    /**
     * constructs EndButton
     * @param index X, Y
     * @param end class
     * @param root Pane
     */
    public EndButton( int EndX, int EndY, End end, Pane root)
    {
        super.button = Game.createEntity(EndX+65, EndY+30, 20, 20, Color.RED, root);
        myEnd = end;
        myEndNode = end.getNode();
        groot = root;
        //EndGroup = new Group();
        
        // Add the End to the EndGroup
        //EndGroup.getChildren().add(myEnd);
        //groot.getChildren().add(EndGroup);
        
       //posX = myEndNode.getTranslateX()+75;
       // posY = myEndNode.getTranslateY()+50;
       // reverse path not needed for the player as player will get off at the platform
  
    }
    /**
     * prompts end scene
     * @param player node
     */
    public void function(Node player) 
    {
        //build = new Build(0, groot, new Point2D(0,0));
        //phys = new PhysicsMove(build.getPlatform());
        if(isPressed(player) && !gameEnded){
            myEnd.show();
            gameEnded = true;
        }
    }
    
    
}
