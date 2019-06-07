import javafx.scene.Node;
/**
 * Abstract class Button -inherited by other buttons that work on character "press"
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public abstract class Button
{
    //instance variables
    protected Node button;
    /**
     * perform function of button with the @param player
     */
    public abstract void function(Node player); //function depends on button
       /**
     * check bound intersections of player and button
     * @param playyer
     * @return boolean true if pressed, fales if not
     */
    public boolean isPressed(Node player) //checks collisoin with button and player
    {
        if(player.getBoundsInParent().intersects(button.getBoundsInParent()))
        return true;
        else 
        return false;
    }
}
