import javafx.scene.shape.Line;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;

import javafx.util.Duration;
/**
 * class ChargeButton here.
 *
 * @author Manjari Senthilkumar
 * @version 6/6/2019
 */
public class ChargeButton extends Button 
{
    double posX, posY;
    Node myCharge; 
    Health health;
    /**
     * constructs and initialize 
     * @param posX ,Y
     * @param root pane
     * @parma charge object
     */
    public ChargeButton(int charX, int charY, Pane root, Charge charge) throws Exception
    {
       super.button = Game.createEntity(charX+80, charY+220, 20, 20, Color.RED, root);
       myCharge = charge.getNode();
       posX = charX + charge.getWidth()/2.0;
       posY = charY + charge.getHeight();
       health = new Health(root);
    }   
    /**
     * @param player
     * set full
     */
    public void function(Node player)
    {
        //if(isPressed(player))
          //  health.setFull();
        
    }
    
}
