import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
    private Scene startScreen;
    private Scene playerPickScreen;
    private Scene roundPickScreen;
    private Scene gameScreen;
    private Scene gameOverScreen;

    public void init(){
        
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("TicTacToe Start");
        stage.show();
        
        
    }

    public static void main(String[] args) {
        launch(args);
        
    }
}