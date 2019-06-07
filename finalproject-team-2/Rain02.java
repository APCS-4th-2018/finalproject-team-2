import javafx.scene.layout.Pane;
/**
 * Write a description of class Rain02 here.
 *
 * @author Manjari Senthilkumar
 * @version 6/3/2019
 */
public class Rain02 

{
    private Drop d;
    
    /**
     * sets the specific detail about the rain 
     */
    public Rain02(Pane root)
    {
        d = new Drop(360,1000,2,10,root);
    }
    
    /**
     * make the rain to fall to the ground
     */
    public void fall(){d.fall();}
}
