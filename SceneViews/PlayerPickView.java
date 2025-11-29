package SceneViews;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PlayerPickView {
    private Scene scene;
    private Scene MainMenu;
    private StackPane root;
    private Button twoPlayerButton;
    private Button onePlayerButton;
    private Button backButton;
    private Stage stage;
    private Boolean multiplayer;

    
    public PlayerPickView(Stage stage,Scene MainMenu){
        root = new StackPane();
        this.stage = stage;
        this.MainMenu = MainMenu;

        twoPlayerButton = new Button("2 Players");
        onePlayerButton = new Button("1 Player");
        backButton = new Button("Back");

        scene = new Scene(root,600,500);
        

    }
    public Scene getScene(){
        
        return scene;
    }
    public void buttonBehaviour(){
        backButton.setOnAction(e -> {
            stage.setScene(MainMenu);
        });
        onePlayerButton.setOnAction(e -> {
            multiplayer = false;
            //stage.setScene()

        });
        twoPlayerButton.setOnAction(e -> {
            multiplayer = true;
        });

    }
}
