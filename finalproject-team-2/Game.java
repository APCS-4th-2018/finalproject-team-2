import java.util.ArrayList;
import java.util.HashMap;

import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.*;
import javafx.scene.Group;
import javafx.scene.control.Button;

import javafx.geometry.Rectangle2D;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
/**
 * @author Manjari Senthilkumar
 * @version 5/31/2019
 */
public class Game extends Application{
    private HashMap<KeyCode, Boolean> keys = new HashMap<KeyCode, Boolean>();

    private ArrayList<Node> platforms = new ArrayList<Node>();
    Build build;
    PhysicsMove phys;
    private static boolean canJump = true;
    Health health;

    private Pane appRoot = new Pane();
    private Pane gameRoot = new Pane();
    private Pane all = new Pane();
    //player node
    private Node player;
    private Point2D playervelocity = new Point2D(0,0);

    //player sprite
    Sprite sprite;
    ImageView spriteImg;

    //Rain 
    Rain[] rain = new Rain[5];
    
    //size data
    private int levelWidth;
    private int levelHeight;
    
    //stage
    private Death death;
    //private Play play;
    
    //Scenes
    Scene start, play;
    @Override
    public void start(Stage stage) throws Exception
    {
        //stage initializations
        stage.setTitle("wazzup0");
        stage.setWidth(720);
        stage.setHeight(950);
        stage.setResizable(false);
        
        //start scene
        Button button1= new Button("Go to scene 2");
        button1.setOnAction(e -> stage.setScene(play));   
        VBox layout1 = new VBox(20);     
        layout1.getChildren().addAll( button1);
        start =  new Scene(layout1, 300, 250);
        
        initContent();
        
        play = new Scene(appRoot);
        play.setOnKeyPressed(event -> keys.put(event.getCode(), true));
        play.setOnKeyReleased(event -> keys.put(event.getCode(), false));
        
        
        
        stage.setScene(start);
        
        stage.show();

        AnimationTimer timer = new AnimationTimer(){
                @Override
                public void handle(long now){update();}
            };
        timer.start();
    }

    private void initContent() throws Exception
    {
        //background
        Rectangle bg = new Rectangle(720,3000);

        ImageView bgImg = convertImageView("C:\\Users\\Manjari\\Desktop\\platform game\\graphics\\gvzpafno.png");
        //Image patt = convertImage("https://drive.google.com/uc?id=1DJbhQwFR6bxv3fBlOdJZ6vhudywLVRsN");
        //bgImg.setViewport(new Rectangle2D(0,800,720,1800));
        gameRoot.getChildren().add(bgImg);
        //Rain
        //rain = new Rain(gameRoot);
        for(int i = 0; i < rain.length; i++)
            rain[i] = new Rain(gameRoot);
        build = new Build(10,gameRoot, playervelocity);
        phys = new PhysicsMove(build.getPlatform());
        
        //cam
        String line;
        levelWidth = LevelData.getLevel1()[0].length()*60;
        levelHeight = LevelData.getLevel1().length*60;
        //sprite control box
        player = createEntity(90,1500,40,40,Color.TRANSPARENT,gameRoot);

        //sprite
        spriteImg = convertImageView("C:\\Users\\Manjari\\Desktop\\platform game\\graphics\\imageedit_1_9167375545.png");
        spriteImg.setViewport(new Rectangle2D(0,0,37,62));
        sprite = new Sprite(
            spriteImg,
            Duration.millis(700),
            21,7,0,0,37,62,0,0);
        //count, col, offsetx, offsety, widt, height, x, y
        sprite.setCycleCount(Animation.INDEFINITE);
        sprite.play();
        gameRoot.getChildren().add(spriteImg);

        //cam follow
        player.translateXProperty().addListener((obs, old, newValue) -> {
                int offset = newValue.intValue();
                if(offset > 640 && offset < levelWidth - 640){
                    gameRoot.setLayoutX(-(offset - 640));
                }
            });
        player.translateYProperty().addListener((obs, old, newValue) -> {
                int offset = newValue.intValue();
                if(offset > 60 && offset < levelHeight - 120){
                    gameRoot.setLayoutY(-(offset - 800));
                }
            });
        health = new Health(gameRoot);
        
        appRoot.getChildren().addAll(gameRoot);
        
    }

    private void update()
    {

        //getTranslate computes layoutX - current X position and
        //sprite follows node
        sprite.setTranslateX(player.getTranslateX());
        sprite.setTranslateY(player.getTranslateY());

        if(isPressed(KeyCode.UP) && player.getTranslateY() >= 5)
            jumpPlayer();
        if(isPressed(KeyCode.LEFT) && player.getTranslateX() >= 5)
            phys.moveX(-5, player);
        if(isPressed(KeyCode.RIGHT) && player.getTranslateX() + 40 <= levelWidth - 5)
            phys.moveX(5, player);
        if(playervelocity.getY() < 10)
            playervelocity = playervelocity.add(0,1); //x does not increase in velocity
        for(int i = 0; i < rain.length; i++)
            rain[i].move();
           
        health.update(player);    

        for(int i = 0; i < build.getButton().size(); i++){
            build.getButton().get(i).function(player);//add buttons to array 
        }
        phys.moveY((int)playervelocity.getY(), player);

    }

    private boolean isPressed(KeyCode key)
    {
        //returns what key was pressed on the level1 table, if no key was pressed
        //return false by default
        return keys.getOrDefault(key, false);
    }

    public static void setCanJump(boolean status){canJump = status;}

  
    public void jumpPlayer()
    {
        if(canJump)
        {
            playervelocity = playervelocity.add(0,-30);
            canJump = false;
        }
    }

    public static Node createStandAloneEntity(int x, int y, int w, int h, Paint fill, Pane root)
    {
        Rectangle entity = new Rectangle(w,h);
        entity.setTranslateX(x);
        entity.setTranslateY(y);
        entity.setFill(fill);

        return entity;
    }

    public static Node createEntity(int x, int y, int w, int h, Paint fill, Pane root)
    {
        Rectangle entity = new Rectangle(w,h);
        entity.setTranslateX(x);
        entity.setTranslateY(y);
        entity.setFill(fill);

        root.getChildren().add(entity);
        return entity;
    }

    public static void main(String[] args){
        launch(args);}

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
}
