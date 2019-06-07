import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
/**
 * Lift platform class
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
    public Lift(Pane root, int j, int i) throws Exception
    {
       //platform = Game.createEntity(j*60, i*60, 150, 40, Color.WHITE, root);
       platform = Game.convertImageView("C:\\Users\\Manjari\\Desktop\\platform game\\graphics\\cloud-platform.png");
       platform.setTranslateX(j*60);
       platform.setTranslateY(i*60);
       root.getChildren().add(platform);
    }
    /**
     * @return platform node
     */
    public Node getNode(){return platform;}
}
