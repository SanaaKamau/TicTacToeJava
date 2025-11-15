import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX Window");
        stage.show();
        
        
    }

    public static void main(String[] args) {
        launch(args);
       
    }
}