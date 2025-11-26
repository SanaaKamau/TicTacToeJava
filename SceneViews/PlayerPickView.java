package SceneViews;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PlayerPickView {
    private Scene scene;
    private StackPane root;
    private Button twoPlayerButton;
    private Button aiButton;
    private Stage stage;
    
    public PlayerPickView(){
        root = new StackPane();
        scene = new Scene(root,600,500);
        

    }
    public Scene getScene(){
        
        return scene;
    }
}
