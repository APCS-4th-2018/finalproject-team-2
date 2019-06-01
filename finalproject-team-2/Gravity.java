import javafx.util.Duration;
/**
 * Write a description of class Gravity here.
 *
 * @author Manjari
 * @version 5/27
 */
public class Gravity
{
    private final int JUMP_VEL = -10;
    private final int GRAV = 5;
    private SpriteAnimation mySprite;
    private double time;
    private int dx, dy;
    private boolean falling, jumping;
    private double vel;
    public Gravity(SpriteAnimation sprite)
    {
        mySprite = sprite;
        time = 0.0;
        x = sprite.getX();
        y = sprite.getY();
    }
    
    public void fall()
    {
        while(y != 1000) //later create a isGrounded method to replace this
        {
            vel += GRAV*time;
            y += 0.5*vel*time;
            mySprite.setY(y);
            time+= 0.001;
        }
    }
    public void jump(){}
}
