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
 * 
 * This is the Main Game Class. 
 * The start method of this class gets called at the launch of the application. 
 * Start method invokes init Content is where all the graphics content gets initialized
 * Update method gets called by the application periodically to refresh the graphics like updating the player's coordinates
 * */
public class Game extends Application{
    private HashMap<KeyCode, Boolean> keys = new HashMap<KeyCode, Boolean>();

    private ArrayList<Node> platforms = new ArrayList<Node>();
    Build build;
    PhysicsMove phys;
    private static boolean canJump = true;
    Health health;
    boolean dead = false;

    private Pane appRoot = new Pane();
    private Pane gameRoot = new Pane();
    private Pane all = new Pane();
    //player node
    private Node player;
    private Point2D playervelocity = new Point2D(0,0);

    //StartScene
    StartScreen myStart;
    
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
    
    //Scenes
    Scene start, play;
    @Override
    /**
     * This method is called at the launch of the application. This method creates all the scenes and the graphics content within the scene
     * 
     * @param stage Stage object where the scenes are added. 
     */
    public void start(Stage stage) throws Exception
    {
        //stage initializations
        stage.setTitle("wazzup0");
        stage.setWidth(720);
        stage.setHeight(950);
        stage.setResizable(false);
        
        //start scene
        //Button button1= new Button("Go to scene 2");
        //button1.setOnAction(e -> stage.setScene(play));   
        //VBox layout1 = new VBox(20);     
        //layout1.getChildren().addAll( button1);
        //start =  new Scene(layout1, 300, 250);
        myStart = new StartScreen(stage);
        start = myStart.getScene();
        
        //play scene
        initContent();
        
        play = new Scene(appRoot);
        play.setOnKeyPressed(event -> keys.put(event.getCode(), true));
        play.setOnKeyReleased(event -> keys.put(event.getCode(), false));
        
        
        //death scene
        death = new Death(play, stage);
        
        stage.setScene(start);
        stage.show();

        AnimationTimer timer = new AnimationTimer(){
                @Override
                public void handle(long now) 
                {
                    if(stage.getScene().equals(play)) 
                    update();
                }
            };
        timer.start();
    }
      /**
     * This method is called from Start method to initialize some of the graphics contents
     * 
     */
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
        player = createEntity(200,1500,40,40,Color.TRANSPARENT,gameRoot);

        //sprite
        spriteImg = convertImageView("C:\\Users\\Manjari\\Desktop\\platform game\\graphics\\mainSS.png");
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
      /**
     * This method is called periodically to refresh the graphics content such as updating the players position and handling button actions
     * 
     */
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
        if(!health.isAlive() && dead == false) 
        {
            death.show();
            dead = true;
            //stage.setScene(death.getScene());
        }
        for(int i = 0; i < build.getButton().size(); i++){
            build.getButton().get(i).function(player);//add buttons to array 
        }
        phys.moveY((int)playervelocity.getY(), player);

    }
     /**
     * Handler for Key pressed events
     * @ param key code for the keyboard key that was pressed
     */
    private boolean isPressed(KeyCode key)
    {
        //returns what key was pressed on the level1 table, if no key was pressed
        //return false by default
        return keys.getOrDefault(key, false);
    }

     /**
       * Sets a flag that determines whether player can jump. Should be called based on collision rules
       * @param canJump If set to true, player is allowed to jump
     */
    public static void setCanJump(boolean status){canJump = status;}

    /**
     * Adds a vertical velocity to the player to enable him to jump, 
     */
    public void jumpPlayer()
    {
        if(canJump)
        {
            playervelocity = playervelocity.add(0,-30);
            canJump = false;
        }
    }
      /**
      * Creates a retangle object at the given coordinates , size and color and returns the object.  It doesn't add the object to the pane
      * @param x - X coordinate
      * @param y - Y coordinate
      * @param w - Width
      * @param h - Height
      * @return - Rectangle object that was created
     */
    public static Node createStandAloneEntity(int x, int y, int w, int h, Paint fill, Pane root)
    {
        Rectangle entity = new Rectangle(w,h);
        entity.setTranslateX(x);
        entity.setTranslateY(y);
        entity.setFill(fill);

        return entity;
    }
     /**
      * Creates a retangle object at the given coordinates , size and color and returns the object. It also adds the object to the given pane
      * @param x - X coordinate
      * @param y - Y coordinate
      * @param w - Width
      * @param h - Height
      * @param root - Pane to which the object is to be added
      * @ return  Rectangle object that was created
     */

    public static Node createEntity(int x, int y, int w, int h, Paint fill, Pane root)
    {
        Rectangle entity = new Rectangle(w,h);
        entity.setTranslateX(x);
        entity.setTranslateY(y);
        entity.setFill(fill);

        root.getChildren().add(entity);
        return entity;
    }
    /**
     * main mehtod
     */
    public static void main(String[] args){
        launch(args);}
         /**
     * Creates an ImageView from a given image file
     * @param file - path to a file
     * @return ImageView object
     */      
    public static ImageView convertImageView(String file) throws Exception
    {
        FileInputStream input = new FileInputStream(file);
        Image image = new Image(input);
        return  new ImageView(image);
    }
     /**
     * Creates an Image from the given file
     * @param file - Path to a file
     * @return Image object
     */
    public static Image convertImage(String file) throws Exception
    {
        FileInputStream input = new FileInputStream(file);
        return new Image(input);
    }
}
