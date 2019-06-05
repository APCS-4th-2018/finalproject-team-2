import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
/**
 * Write a description of class Ladder here.
 *
 * @author Manjari Senthilkumar 
 * @version 6/4/2019
 */
public class Ladder
{
    private Node platform;

    /**
     * Constructor for objects of class Lift
     */
    public Ladder(Pane root, int j, int i)
    {
       platform = Game.createEntity(j*60, i*60, 150, 300, Color.BURLYWOOD, root);
    }

    public Node getNode(){return platform;}
}
