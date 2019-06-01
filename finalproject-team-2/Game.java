import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import java.io.FileInputStream;
import javafx.scene.layout.Pane;

/**
 * Write a description of JavaFX class pleaseWorkFX here.
 *
 * @author Manjari
 * @version 5/27
 */
public class Game extends Application 
{
    private static final int COLUMNS  =   7;
    private static final int COUNT    =  21;
    private int OFFSET_X =  0;
    private int OFFSET_Y =  0;
    private static final int WIDTH    = 37;
    private static final int HEIGHT   = 62;
    private int x = 300, y = 1000 - HEIGHT - 500;
    private SpriteAnimation animation;
    private ImageView sprite, background;
    private ImageView[] floatpps = new ImageView[4];
    private int offsetMaxY = 1561 - 1000;
    private int offsetMinY = 0;
    private int camY;
    public Game() throws Exception
    {
        sprite = convertImageView("/home/jdoe/APCS/game/graphics/imageedit_1_9167375545.png");
        background = convertImageView("/home/jdoe/APCS/game/graphics/Background-temp.jpg");
        floatpps[0] = new Interactable(250,200,58,106,convertImage("/home/jdoe/APCS/game/graphics/front.png"));
        floatpps[1] = new Interactable(110,340,58,106,convertImage("/home/jdoe/APCS/game/graphics/front.png"));
        floatpps[2] = new Interactable(400,150,58,106,convertImage("/home/jdoe/APCS/game/graphics/front.png"));
        animation = new SpriteAnimation(
            sprite,
            Duration.millis(700),
            COUNT, COLUMNS,
            OFFSET_X, OFFSET_Y,
            WIDTH, HEIGHT,x,y
        );
    }

    /**
     * The start method is the main entry point for every JavaFX application. 
     * It is called after the init() method has returned and after 
     * the system is ready for the application to begin running.
     *
     * @param  stage the primary stage for this application.
     */
    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("The Shuffling Man");
        Pane pane = new Pane();

        stage.setWidth(598);
        stage.setHeight(1000);
        background.setViewport(new Rectangle2D(0,561,598,1500));
        sprite.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
        //floatpps.setViewport(new Rectangle2D(0,0,58,106));
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();

        pane.getChildren().add(new Group(background, sprite, floatpps[0], floatpps[1], floatpps[2]));        
        //Scene scene = new Scene(new Group(background, sprite, floatpps[0], floatpps[1], floatpps[2]));
        Scene scene = new Scene(pane, 598, 1000);
        moveOnKeyPress(scene, animation);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    public void moveOnKeyPress(Scene scene, SpriteAnimation animation)
    {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() 
            {
                @Override public void handle(KeyEvent event) {
                    animation.keyPressed(event);
                }
            }
        );
    }

    public static ImageView convertImageView(String file) throws Exception
    {
        FileInputStream input = new FileInputStream(file);
        Image image = new Image(input);
        return  new ImageView(image);
    }

    public static Image convertImage(String file) throws Exception
    {
        FileInputStream input = new FileInputStream(file);
        return new Image(input);
    }
    
    public camY()
    {
        if (camY > offsetMaxY) {camY = offsetMaxY;}
        else
            if(camY < offsetMinY) {camY = 0;}
    }
}
