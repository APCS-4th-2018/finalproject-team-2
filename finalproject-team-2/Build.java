import java.util.ArrayList;

import javafx.scene.shape.Rectangle;
import javafx.scene.Node;
import javafx.scene.paint.*;
import javafx.scene.layout.Pane;
import javafx.scene.image.*;

import javafx.geometry.Point2D;
/**
 *  This class constructs all the objects based on LevelData
 *  LevelData contains information about the type of objects to buid at various X,Y coordinates
 *
 * @author Manjari Senthilkumar
 * @version 06/02/2019
 */

public class Build
{
    private double gForce;
    private ArrayList<Node> platforms = new ArrayList<Node>();
    private double levelWidth;
    private double levelHeight;
    private boolean canJump;
    private double vel;
    private Point2D playervelocity;
    //Interactable objects
    private Lift lift;
    private End  end;
    private Ladder ladder;
    private Portal portal;
    private Charge charge;
    private ArrayList<Button> butt = new ArrayList<Button>();
       /**
     * Constructor for Build Class
     * @param g - gravityForce
     * @param root  - Game root pane
     * @param playerVelocity - Initial velocity of the player
     */
    public Build(double g, Pane root, Point2D playervelocity) throws Exception
    {
        //initialize physcs stuff
        gForce = g;
        vel = 0;
        this.playervelocity = playervelocity;
        levelWidth = LevelData.getLevel1()[0].length()*60;
        levelHeight = LevelData.getLevel1().length*60;
        
        //initialize diff entities
        for(int i = 0; i < LevelData.getLevel1().length; i++){
            String line = LevelData.getLevel1()[i];
            for(int j = 0; j < line.length(); j++)
                switch(line.charAt(j)){
                    case '0':
                    break;
                    
                    case '1':
                    Node platform = Game.createEntity(j*60, i*60, 60, 60, Color.TRANSPARENT,root);
                    ImageView block = Game.convertImageView("graphics\\block2.png");
                    block.setX(j*60);
                    block.setY(i*60);
                    root.getChildren().add(block);
                    platforms.add(platform);
                    break;
                    
                    case '2':
                    lift = new Lift(root, j, i);
                    butt.add(new LiftButton(j*60, i*60, lift, root));
                    platforms.add(lift.getNode());
                    break;
                    
                    case '3':
                    ladder = new Ladder(root, j , i,Game.convertImageView("graphics\\ladder3.png"));
                    butt.add(new LadderButton(j*60, i*60, root, ladder));
                    break;
                    
                    case '4' :
                    portal = new Portal(root, j , i,Game.convertImageView("graphics\\protal.png")); 
                    butt.add(new PortalButton(root, portal));
                    platforms.add(portal.getNode());
                    break;
                    
                    case '5':
                    charge = new Charge(root, j, i);
                    butt.add(new ChargeButton( j*60, i*60, root, charge));
                    platforms.add(charge.getNode());
                    default:
                    break;
                    
                    case '7' :
                    end = new End(root, j, i);
                    butt.add(new EndButton(j*60, i*60, end, root));
                    //platforms.add(end.getNode());
                    break;
                    
                
                }
        }
    }
     /**
     * Returns the list of platform objects in the scene
     * @return ArrayList of platform objects
     */
    public ArrayList<Node> getPlatform(){return platforms;}
    /**
     * Returns the list of button objects in the scene
     * @return ArrayList of button objects
     */
    public ArrayList<Button> getButton(){return butt;}
   
}
