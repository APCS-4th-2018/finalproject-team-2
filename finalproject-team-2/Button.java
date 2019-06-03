import javafx.scene.Node;
/**
 * Abstract class Button - write a description of the class here
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public abstract class Button
{
    private Node player;
    private Node button;
    public abstract void function();
    public boolean isPressed()
    {
        if(player.getBoundsInParent().intersects(button.getBoundsInParent()))
        return true;
        else 
        return false;
    }
}
