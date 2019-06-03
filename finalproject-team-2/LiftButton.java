import javafx.scene.Node;
/**
 * Write a description of class LiftButton here.
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public class LiftButton extends Button
{
    private Node player;
    private Node button;
    public LiftButton(Node player, int liftX, int liftY, Pane groot)
    {
        super.player = player;
        super.button = createEntity(liftX+75, liftY+20, 20, 20, root);
    }
    
    public void function()
    {
        if(isPressed())
        entity.setTranslateY(entity.getTranslateY() + 500);
        }
    }

