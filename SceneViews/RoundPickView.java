package SceneViews;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;

public class RoundPickView {
    private Stage stage;
    private Rectangle box;
    private int numRounds;
    private Button incrementButton;
    private Button decrementButton;
    private Button backButton;
    
    public RoundPickView(Stage stage){
        this.stage = stage;
        
        numRounds = 1;


    }
    public void increment(){
        if(numRounds<10){
            numRounds++;
        }
    }
    public void decrement(){
        if(numRounds>=2){
            numRounds--;
        }

    }

}
