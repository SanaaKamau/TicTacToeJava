package SceneViews;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class MainMenuView {
    private Scene scene;
    private VBox root;
    private Button playButton;
    private Button exitButton;
  


    public MainMenuView(){
        
        root = new VBox();
        playButton = new Button("start");
        exitButton = new Button("exit");
        root.getChildren().add(playButton);
        root.getChildren().add(exitButton);
        scene = new Scene(root,600,500);
    }

    public Scene getScene(){
        return scene;
    }
    
}
