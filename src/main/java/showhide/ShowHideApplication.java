package showhide;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import rectangle.RectangleApplication;

import java.io.IOException;

public class ShowHideApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ShowHideApplication.class.getResource("showhide-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        primaryStage.setTitle("SHOW | HIDE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
