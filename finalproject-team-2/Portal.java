import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.image.*;
/**
 *  class portal here.
 *
 * @author Manjari Senthilkumar 
 * @version 6/4/2019
 */
public class Portal
{
    //initialize
    private Node platform;
    private int width, height, xpos,ypos;
    /**
     * Constructor for objects of class Portal, initialize node data
     */
    public Portal(Pane root, int j, int i, ImageView pic)
    {
        //initialize
        width = 10;//(int)pic.getFitWidth();
        height = 60;//(int)pic.getFitHeight();
        xpos = j*60 ;
        ypos = i*60 ;
        //platform = Game.createEntity(xpos,ypos, width, height, Color.BLUE, root);
        //set position
        platform = pic;
        platform.setTranslateX(j*60-50);
        platform.setTranslateY(i*60);
        root.getChildren().add(platform);
    }
    //getters
    /**
     * @return node of portal
     */
    public Node getNode(){return platform;}
      /**
     * @return int of width
     */
    public int getWidth(){return width;}
      /**
     * @return int of height
     */

    public int getHeight(){return height;}
      /**
     * @return int of x position
     */
    public int getXPos() {return xpos;}
      /**
     * @return int of y position
     */
    public int getYPos() {return ypos; }
}
