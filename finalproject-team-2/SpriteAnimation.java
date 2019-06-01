import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class SpriteAnimation extends Transition {

    private final ImageView imageView;
    private final int count;
    private final int columns;
    private final int offsetX;
    private final int offsetY;
    private final int width;
    private final int height;
    private int posX;
    private int posY;
    private int dx, dy;
    private int lastIndex;
    private int vel;
    public SpriteAnimation(
            ImageView imageView, 
            Duration duration, 
            int count,   int columns,
            int offsetX, int offsetY,
            int width,   int height,
            int x,       int y) {
        this.imageView = imageView;
        this.count     = count;
        this.columns   = columns;
        this.offsetX   = offsetX;
        this.offsetY   = offsetY;
        this.width     = width;
        this.height    = height;
        vel            = 5;
        setX(x);
        setY(y);
        setCycleDuration(duration);
        setInterpolator(Interpolator.LINEAR);
    }

    protected void interpolate(double k) {
        final int index = Math.min((int) Math.floor(k * count), count - 1);
        if (index != lastIndex) {
            final int x = (index % columns) * width  + offsetX;
            final int y = (index / columns) * height + offsetY;
            imageView.setViewport(new Rectangle2D(x, y, width, height));
            lastIndex = index;
        }
    }
    public int getOffsetX(){return offsetX;}
    public int getOffsetY(){return offsetY;}
    public int getVel(){return vel;}
    public void setVel(int vel){this.vel = vel;}
    public void setX(int x)
    {
        imageView.setX(x);
        posX = x;
    }
    public void setY(int y)
    {
        imageView.setY(y);
        posY = y;
    }

    public int getX() {
        
        return posX;
    }

    public int getY() {
        
        return posY;
    }
    
    public int getWidth() {
        
        return width;
    }
    
    public int getHeight() {
        
        return height;
    }    

    public void keyPressed(KeyEvent e) {
        //Gravity grav = new Gravity(this);
        switch (e.getCode()) {
                        case UP:    setY(getY() - vel); break;
                        case RIGHT: setX(getX() + vel); break;
                        case DOWN:  setY(getY() + vel); break;
                        //case DOWN:  grav.fall();        break;
                        case LEFT:  setX(getX() - vel); break;
                    }
    }

    
}