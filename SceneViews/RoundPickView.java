package SceneViews;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;

public class RoundPickView {
    private Boolean multiplayer;
    private Stage stage;
    private Scene scene;
    private Rectangle roundRect;
    private StackPane root;
    private StackPane roundNumberPane;
    private VBox cornerBox;
    private VBox arrowBox;
    private HBox centerBox;
    private Label numberLabel;
    private int numRounds;
    private Button incrementButton;
    private Button decrementButton;
    private Button backButton;
    
    public RoundPickView(Stage stage){
        this.stage = stage;


        root = new StackPane();
        roundNumberPane = new StackPane();
        numberLabel = new Label("1");
        cornerBox = new VBox(); 
        arrowBox = new VBox();
        centerBox = new HBox();

        roundRect = new Rectangle(50,50);
        roundRect.setFill(Color.LIGHTPINK);

        incrementButton = new Button("\u25B2");
        decrementButton = new Button("\u25BE");
        backButton = new Button("Back");
        buttonBehaviour();

         roundNumberPane.getChildren().addAll(roundRect, numberLabel);
         StackPane.setAlignment(numberLabel, Pos.CENTER);
         arrowBox.getChildren().addAll(incrementButton,decrementButton);
         cornerBox.getChildren().add(backButton);
         centerBox.getChildren().addAll(roundNumberPane,arrowBox);
         
         root.getChildren().addAll(cornerBox,centerBox);
         
        

         scene = new Scene(root,600,500); 

        numRounds = 1;


    }
    private void buttonBehaviour(){
         backButton.setOnAction(e -> {
            PlayerPickView playerPicker = new PlayerPickView(stage);
            stage.setScene(playerPicker.getScene());
            }
        );
        incrementButton.setOnAction(e ->{
            increment();
        }
        );
        decrementButton.setOnAction(e ->{
            decrement();
        }
        );
         

    }
    private void increment(){
        if(numRounds<10){
            numRounds++;
            numberLabel.setText(Integer.toString(numRounds));
            
        }
    }
    private void decrement(){
        if(numRounds>=2){
            numRounds--;
            numberLabel.setText(Integer.toString(numRounds));
        }

    }
    public Scene getScene(){
        return scene;
    }
    public void setMultiplayer(Boolean multi){
        multiplayer = multi;
    }

}
