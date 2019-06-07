import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.image.*;
/**
 *  class Charge here.
 *
 * @author Manjari Senthilkumar
 * @version 6/6/2019
 */
public class Charge
{
    private Node platform;
    private int width, height;
      /**
     * Constructor for Charge class
     * @param i, j positions 
     * @param root Pane
     */

    public Charge(Pane root, int j, int i) throws Exception
    {
        width = 180;//(int)pic.getFitWidth();
        height = 240;//(int)pic.getFitHeight();
        //platform = Game.createEntity(j*60, i*60, width, height, Color.DARKSEAGREEN, root);
        platform = Game.convertImageView("graphics\\chargingStation.png");
        platform.setTranslateX(j*60);
        platform.setTranslateY(i*60);
        root.getChildren().add(platform);
    }
        /**
     * @return node
     */
    public Node getNode(){return platform;}
      /**
     * @return width
     */
    public int getWidth(){return width;}
        /**
     * @return height
     */
    public int getHeight(){return height;}
}
