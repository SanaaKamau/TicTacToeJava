package SceneViews;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.application.Platform;
import javafx.geometry.Insets;

public class MainMenuView {
    private Scene scene;
    private VBox root;
    private Button playButton;
    private Button exitButton;
    private Stage stage;
  
    public MainMenuView(Stage stage){
        
        root = new VBox();
        this.stage = stage;

        playButton = new Button("start");      
        exitButton = new Button("exit");
        buttonBehaviour();

        root.getChildren().add(playButton);
        root.getChildren().add(exitButton);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setSpacing(25);
        root.setPadding(new Insets(10));
        scene = new Scene(root,600,500);
    }

    public Scene getScene(){
        return scene;
    }

    private void buttonBehaviour(){
        
        playButton.setOnAction(e -> {
            PlayerPickView playerPicker = new PlayerPickView(this.stage);
            stage.setScene(playerPicker.getScene());
        });
        exitButton.setOnAction(e -> {          
           Platform.exit();
        });      
    }
    
}
