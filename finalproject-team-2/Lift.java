import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
/**
 * Write a description of class Lift here.
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public class Lift
{
    private Node platform;

    /**
     * Constructor for objects of class Lift
     */
    public Lift(Pane root, int j, int i)
    {
       platform = Game.createEntity(j*60, i*60, 150, 40, Color.WHITE, root);
    }

    public Node getNode(){return platform;}
}
