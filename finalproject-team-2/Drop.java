import javafx.scene.shape.Line;
import javafx.scene.paint.*;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.geometry.Point2D;
/**
 * Write a description of class Drop here.
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public class Drop
{
    private int posX,  posY;
    private int width, height;
    private Node drop; 
    private Pane groot;
    private Point2D vel = new Point2D(0,1);
    private int ySpeed = 1;
    Build build;
    PhysicsMove phys;
    
    /**
     * the object would be able to fall by using this class
     */
    public Drop(int x, int y, int w, int h, Pane root)
    {
        //initialize the variables
        posX = x;
        posY = y;
        width = w;
        height = h; 
        groot = root;
        vel = new Point2D(0,0);
        build = new Build(10,root, vel);
        phys = new PhysicsMove(build.getPlatform());
        show();
    }
    
    
    /**
     * uses physics to make the objects to fal
     */
    public void fall()
    {
        //makes it to move it in y axis
        phys.moveY(posY, drop);
    }
    
    /**
     * shows the action on the screen
     */
    public void show()
    {
        drop = Game.createEntity(posX, posY, width, height, Color.ALICEBLUE, groot);
    }
    
}
