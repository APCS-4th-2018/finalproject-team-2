import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.image.*;
/**
 * class Ladder here.
 *
 * @author Manjari Senthilkumar 
 * @version 6/4/2019
 */
public class Ladder
{
    private Node platform;
    private int width, height;
    /**
     * Constructor for objects of class Ladder
     */
    public Ladder(Pane root, int j, int i, ImageView pic)
    {
        width = 150;//(int)pic.getFitWidth();
        height = 300;//(int)pic.getFitHeight();
        //platform = Game.createEntity(j*60, i*60, width, height, Color.BURLYWOOD, root);
        platform = pic;
        platform.setTranslateX(j*60);
        platform.setTranslateY(i*60);
        root.getChildren().add(platform);
    }
       /**
     * @return node of platform
     */
    public Node getNode(){return platform;}
    /**
     * @return width of platform
     */
    public int getWidth(){return width;}
     /**
     * @return height of platform
     */

    public int getHeight(){return height;}
}
