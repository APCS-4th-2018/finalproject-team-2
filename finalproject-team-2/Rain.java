import javafx.scene.shape.Line;
import javafx.scene.paint.*;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.geometry.Point2D;
/**
 * Write a description of class Drop here.
 *
 * @author Manjari
 * @version 06/2/2019
 */
public class Rain 
{
   //position
   private double posX;
   private double posY;
   private int width;
   private int height;
   private int dVel = 1;
   private Point2D vel;
   private Node[] drops = new Node[5];
   private Build phys;
   private PhysicsMove physMove;
   public Rain(Pane groot) throws Exception
   {
       for(int i = 0; i < drops.length; i++)
       {
           posX = Math.random()*720;
           posY = Math.random()*1000-200;
           vel = new Point2D(0,0);
           width = (int)(Math.random()*2+2);
           height = (int)(Math.random()*5+10 );
           drops[i] = Game.createEntity((int)posX, (int)posY, width,height,Color.ALICEBLUE, groot);
       }
        phys = new Build(10,groot,new Point2D(0,0));
        physMove = new PhysicsMove(phys.getPlatform());
       
   }
   
   public void move()
   {
       for(int i = 0; i < drops.length; i++){
       
            fall(); //x does not increase in velocity
            posY = drops[i].getTranslateY()+vel.getY();
            drops[i].setTranslateY(posY);
    }
   }
   private void fall()
   {
       if (vel.getY() < 10 )
           vel = vel.add(0, dVel);
       
       if(posY > 3000)
           posY = Math.random()*1000-200;
           
    }
   /*
    public Point2D getVel()
   {
       return vel;
   }
   */

}
