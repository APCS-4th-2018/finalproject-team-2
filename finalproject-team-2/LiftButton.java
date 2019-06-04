import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;

import javafx.geometry.Point2D;
/**
 * Write a description of class LiftButton here.
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public class LiftButton extends Button
{
    private Lift myLift;
    private Build build;
    private PhysicsMove phys;
    Pane groot;
    public LiftButton( int liftX, int liftY, Lift lift, Pane root)
    {
        super.button = Game.createEntity(liftX+65, liftY-10, 20, 20, Color.RED, root);
        myLift = lift;
        groot = root;
    }
    
    public void function(Node player)
    {
        build = new Build(0, groot, new Point2D(0,0));
        phys = new PhysicsMove(build.getPlatform());
        if(isPressed(player)){
            //myLift.getNode().setTranslateY(myLift.getNode().getTranslateY() + 500);//problem
            phys.moveY(-5, myLift.getNode());
        }
    }
}
