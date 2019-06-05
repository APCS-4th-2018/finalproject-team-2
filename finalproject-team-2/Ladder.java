import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.image.*;
/**
 * Write a description of class Ladder here.
 *
 * @author Manjari Senthilkumar 
 * @version 6/4/2019
 */
public class Ladder
{
    private Node platform;
    private int width, height;
    /**
     * Constructor for objects of class Lift
     */
    public Ladder(Pane root, int j, int i, ImageView pic)
    {
        width = (int)pic.getFitWidth();
        height = (int)pic.getFitHeight();
        platform = Game.createEntity(j*60, i*60, width, height, Color.BURLYWOOD, root);
    }

    public Node getNode(){return platform;}
    
    public int getWidth(){return width;}
    
    public int getHeight(){return height;}
}
