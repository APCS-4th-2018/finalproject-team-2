import java.util.ArrayList;

import javafx.scene.Node;

import javafx.geometry.Point2D;
/**
 * Write a description of class PhysicsMove here.
 *
 * @author Manjari Senthilkumar
 * @version 6/4/2019
 */
public class PhysicsMove
{
    private ArrayList<Node> platforms;
    private boolean canJump;
    private Point2D playervelocity;
    public PhysicsMove(ArrayList<Node> build)
    {
        platforms = build;
        canJump = true;
        playervelocity = new Point2D(0,0);
    }
    public void moveX(int value, Node entity)
    {
        boolean movingRight = value > 0;

        for(int i = 0; i < Math.abs(value); i++)
        {
            for(Node platform : platforms)
                if(entity.getBoundsInParent().intersects(platform.getBoundsInParent()))
                    if(movingRight){
                        if(entity.getTranslateX() + 40 == platform.getTranslateX())
                            return;
                    }
                    else
                    if(entity.getTranslateX() == platform.getTranslateX() + 60)
                        return;
            entity.setTranslateX(entity.getTranslateX() + (movingRight ? 1 : -1));
        }
    }
    public void moveY(int value, Node entity)
    {
        boolean movingDown = value > 0;

        for(int i = 0; i < Math.abs(value); i++){
            for(Node platform : platforms)
                if(entity.getBoundsInParent().intersects(platform.getBoundsInParent()))
                    if(movingDown){
                        if(entity.getTranslateY() +40 == platform.getTranslateY())
                        {
                            entity.setTranslateY(entity.getTranslateY()-1);
                            Game.setCanJump(true);
                            return;
                        }
                    }
                    else
                    if(entity.getTranslateY() == platform.getTranslateY() + 60)
                        return;
            //gravity
            entity.setTranslateY(entity.getTranslateY() + (movingDown ? 1 : - 1));
        }
    }

    public void jumpPlayer()
    {
        if(canJump)
        {
            playervelocity = playervelocity.add(0,-30);
            Game.setCanJump(false);
        }
    }
}
