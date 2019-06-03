import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
/**
 * Write a description of class LiftButton here.
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public class LiftButton extends Button
{
    private Lift myLift;
    public LiftButton( int liftX, int liftY, Lift lift, Pane root)
    {
        super.button = Game.createEntity(liftX+65, liftY-10, 20, 20, Color.RED, root);
        myLift = lift;
    }
    
    public void function(Node player)
    {
        if(isPressed(player))
        myLift.getNode().setTranslateY(myLift.getNode().getTranslateY() + 500);
        }
    }

