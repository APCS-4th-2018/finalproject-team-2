import javafx.scene.layout.Pane;
import javafx.scene.image.*;
/**
 * Write a description of class Health here.
 *
 * @author Manjari Senthilkumar
 * @version 6/5/2019
// */
public class Health
{

    ImageView barimgV;
    public Health(Pane root) throws Exception
    {
        barimgV = Game.convertImageView("healthbar.png");
        barimgV.setX(160);
        barimgV.setY(100);
        barimgV.setPreserveRatio(true);
        barimgV.setFitWidth(200);
        barimgV.setFitHeight(20);
        
        root.getChildren().add(barimgV);
    }
    public void update()
    {}
}
