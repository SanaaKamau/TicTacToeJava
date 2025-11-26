package SceneViews;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PlayerPickView {
    private Scene scene;
    private VBox root;
    private Button twoPlayerButton;
    private Button aiButton;
    private Stage stage;
    
    public PlayerPickView(){

    }
    public Scene getScene(){
        
        return new Scene(new Root());
    }
}
