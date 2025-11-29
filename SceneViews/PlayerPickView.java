package SceneViews;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PlayerPickView {
    private Scene scene;
    private StackPane root;
    private VBox playerBox;
    private Button twoPlayerButton;
    private Button onePlayerButton;
    private Button backButton;
    private Stage stage;
    private Boolean multiplayer;

    
    public PlayerPickView(Stage stage){
       
        this.stage = stage;
        playerBox = new VBox();
        root = new StackPane();
        twoPlayerButton = new Button("2 Players");
        onePlayerButton = new Button("1 Player");
        playerBox.getChildren().addAll(onePlayerButton,twoPlayerButton);
        backButton = new Button("Back");
        root.getChildren().addAll(backButton,playerBox);

        scene = new Scene(root,600,500);
        

    }
    public Scene getScene(){
        
        return scene;
    }
    public void buttonBehaviour(){
        backButton.setOnAction(e -> {
            MainMenuView MainMenu = new MainMenuView(stage);
            stage.setScene(MainMenu.getScene());
        });
        onePlayerButton.setOnAction(e -> {
            multiplayer = false;
            RoundPickView roundPickView = new RoundPickView(stage);
            roundPickView.setMultiplayer(multiplayer);
            stage.setScene(roundPickView.getScene());

        });
        twoPlayerButton.setOnAction(e -> {
            multiplayer = true;
            RoundPickView roundPickView = new RoundPickView(stage);
            roundPickView.setMultiplayer(multiplayer);
            stage.setScene(roundPickView.getScene());
        });

    }
}
