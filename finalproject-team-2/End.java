import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.scene.image.*;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;

/**
 * End class - end scene/stage
 *
 * @author Manjari Senthilkumar
 * @version 06/03/2019
 */
public class End
{
    private Node platform;
    private Stage stage;
    private Scene endScene;
    private Scene play;
    private Scene bgSc;
    private ImageView bgImg;
    private Pane endPane = new Pane();

    /**
     * Constructor for objects of class Lift
     */
    public End(Pane root, int j, int i) throws Exception
    {
        //platform = Game.createEntity(j*60, i*60, 150, 40, Color.WHITE, root);
        platform = Game.convertImageView("graphics\\end.jpg");
        platform.setTranslateX(j*60);
        platform.setTranslateY(i*60);
        root.getChildren().add(platform);
    }
    /**
     * accessor
     * @return platform node - jewel node
     */
    public Node getNode(){return platform;}
    /**
     * show end scene
     */
    public void show() 
    {

        stage = new Stage();

        //Label label = new Label("Congrats you died! lol");
        Button button1= new Button("Congratulations... You made my day");
        button1.setOnAction(e -> Platform.exit());   

        //VBox layout1 = new VBox(20);     
        //layout1.getChildren().addAll( button1);
        //endScene = new Scene(layout1);
        endScene = getScene();

        stage.setScene(endScene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
    /**
     * accessor
     * @return end Scene
     */
    public Scene getScene() 
    {
        String file = "graphics\\endScreen.png";
        try {
            bgImg = Game.convertImageView(file);
        } catch (java.lang.Exception e) {
            System.out.println("File not found " + file);
        }
        
        //Label label = new Label("Congrats you died! lol");
        Button button1= new Button("Congratulations... You made my day\n\n Press to Exit");
        button1.setOnAction(e -> Platform.exit());   
        button1.relocate(40, 40);
        
        endPane.getChildren().addAll(bgImg, button1);
        bgSc = new Scene(endPane);
        return bgSc;
    }
}
