import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
public class Interactable extends ImageView
{
    int width;
    int height;
    
    /**
     * pass Image + data about image and it sets it up in the right
     */
    public Interactable(int x, int y, int w, int h, Image obj) throws Exception
    {
       super(obj);
       this.setViewport(new Rectangle2D(0,0, w, h));
       width = w;
       height = h;
       this.setX(x);
       this.setY(y);
    }
    
    public Rectangle2D getBounds(){return new Rectangle2D(this.getX(), this.getY(), width, height);}
}