
/**
 * Write a description of class EndButton here.
 *
 * @author Manjari
 * @version 6/7/2019
 */
public class EndButton extends Button
{
    public EndButton()
    {
        super.button = Game.createEntity(liftX+65, liftY-10, 20, 20, Color.RED, root);
        myLift = lift.getNode();
        groot = root;
    }
}
