import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.image.*;
/**
 * Write a description of class Charge here.
 *
 * @author Manjari Senthilkumar
 * @version 6/6/2019
 */
public class Charge
{
    private Node platform;
    private int width, height;
    /**
     * Constructor for objects of class Charge
     */
    public Charge(Pane root, int j, int i) throws Exception
    {
        width = 180;//(int)pic.getFitWidth();
        height = 240;//(int)pic.getFitHeight();
        //platform = Game.createEntity(j*60, i*60, width, height, Color.DARKSEAGREEN, root);
        platform = Game.convertImageView("C:\\Users\\Manjari\\Desktop\\platform game\\graphics\\chargingStation.png");
        platform.setTranslateX(j*60);
        platform.setTranslateY(i*60);
        root.getChildren().add(platform);
    }
    
    public Node getNode(){return platform;}
    
    public int getWidth(){return width;}
    
    public int getHeight(){return height;}
}
