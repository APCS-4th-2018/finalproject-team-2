import java.util.ArrayList;

import javafx.scene.Node;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
/**
 * The hardest class in all of eternity - pseudo physics simulated in game world
 *
 * @author Manjari Senthilkumar
 * @version 6/4/2019
 */
public class PhysicsMove
{
    
    //instance variables
    private ArrayList<Node> platforms;
    private boolean canJump;
    private Point2D playervelocity;
       /**
     * @param node arrayList - to build all the differnt things
     */
    public PhysicsMove(ArrayList<Node> build)
    {
        //initialize
        platforms = build;
        canJump = true;
        playervelocity = new Point2D(0,0);
    }
      /**
     * @param distance of movement
     * @param what to move
     * move in X direction
     */
    public void moveX(int value, Node entity)
    {
        //move right while checking for collisions
        boolean movingRight = value > 0;

        for(int i = 0; i < Math.abs(value); i++)
        {
            for(Node platform : platforms)
                if(entity.getBoundsInParent().intersects(platform.getBoundsInParent()))
                    if(movingRight){ //^collision check
                        if(entity.getTranslateX() + 40 == platform.getTranslateX())
                            return;
                    }
                    else
                    if(entity.getTranslateX() == platform.getTranslateX() + 60)
                        return; //don't do anything
            entity.setTranslateX(entity.getTranslateX() + (movingRight ? 1 : -1)); //interpolate
        }
    }
    /**
     * @param distance of movement
     * @param what to move
     * move in Y direction
     */
    public void moveY(int value, Node entity)
    {
        //initialize
        boolean movingDown = value > 0;
        double ty = 0;
        double ty1 = 0;
        Bounds b = null;
        Bounds b1 = null;
        //bounds collision
        b = entity.getBoundsInParent();

        for(int i = 0; i < Math.abs(value); i++){
            ty = entity.getTranslateY();
            b = entity.getBoundsInParent();
        
            for(Node platform : platforms){
              
                b1 = platform.getBoundsInParent();
                ty1 = platform.getTranslateY();
                if(b.intersects(b1))//check collison
                    if(movingDown){
                        if(ty +40 == ty1)
                        {
                            entity.setTranslateY(ty-1);//cleaner look
                            Game.setCanJump(true);//if on ground
                            return;
                        }
                    }
                    else
                    if(ty == ty1 + 60)
                        return;
             }
            entity.setTranslateY(ty + (movingDown ? 1 : - 1));//interpolate
        }
    }
       /**
     * no collision movement
     * @param distance of movement
     * @param what to move
     */
    
    public void moveYNoColl(int value, Node entity)
    {
        //initialize
        boolean movingDown = value > 0;
        double ty = 0;
        double ty1 = 0;
        Bounds b = null;
        Bounds b1 = null;
        
        b = entity.getBoundsInParent();
        //collisions don't matter
        for(int i = 0; i < Math.abs(value); i++){
            ty = entity.getTranslateY();
            b = entity.getBoundsInParent();

            entity.setTranslateY(ty + (movingDown ? 1 : - 1));//interpolate
        }
    }
     /**
     * make player jump
     */
    public void jumpPlayer()
    {
        if(canJump) //set true if on ground
        {
            playervelocity = playervelocity.add(0,-30);
            Game.setCanJump(false);
        }
    }
}
