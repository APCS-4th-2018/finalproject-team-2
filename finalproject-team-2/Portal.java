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
public class Portal
{
    private Node platform;
    private int width, height, xpos,ypos;
    /**
     * Constructor for objects of class Lift
     */
    public Portal(Pane root, int j, int i, ImageView pic)
    {
        width = 10;//(int)pic.getFitWidth();
        height = 60;//(int)pic.getFitHeight();
        xpos = j*60 ;
        ypos = i*60 ;
        //platform = Game.createEntity(xpos,ypos, width, height, Color.BLUE, root);
        platform = pic;
        platform.setTranslateX(j*60-50);
        platform.setTranslateY(i*60);
        root.getChildren().add(platform);
    }

    public Node getNode(){return platform;}
    
    public int getWidth(){return width;}
    
    public int getHeight(){return height;}
    
    public int getXPos() {return xpos;}
    
    public int getYPos() {return ypos; }
}
