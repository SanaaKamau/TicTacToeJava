package SceneViews;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.geometry.Pos;

public class MainMenuView {
    private Scene scene;
    private VBox root;
    private Button playButton;
    private Button exitButton;
    private Stage stage;
  
    public MainMenuView(Stage stage){
        
        root = new VBox();

        playButton = new Button("start");      
        exitButton = new Button("exit");
        buttonBehaviour();

        root.getChildren().add(playButton);
        root.getChildren().add(exitButton);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setSpacing(25);
        scene = new Scene(root,600,500);
    }

    public Scene getScene(){
        return scene;
    }

    private void buttonBehaviour(){
        playButton = new Button("start");      
        exitButton = new Button("exit");
        playButton.setOnAction(e -> {
            PlayerPickView playerPicker = new PlayerPickView();
            stage.setScene(playerPicker.getScene());
        });



        
    }
    
}
