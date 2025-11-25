import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import SceneViews.MainMenuView;

public class Main extends Application {


    public void init(){
        
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("TicTacToe Start");
        MainMenuView mainMenu = new MainMenuView();
        stage.setScene(mainMenu.getScene());
        stage.show();
        
        
    }

    public static void main(String[] args) {
        launch(args);
        
    }
}