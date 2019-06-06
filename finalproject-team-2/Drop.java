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
    public Drop(int x, int y, int w, int h, Pane root) throws Exception
    {
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
    public void fall()
    {
        vel.add(0,1);
        if(vel.getY() < 10)
        posY += vel.getY();
        phys.moveY(posY, drop);
    }
    public void show()
    {
        drop = Game.createEntity(posX, posY, width, height, Color.ALICEBLUE, groot);
    }
    
}
