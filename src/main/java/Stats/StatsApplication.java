package Stats;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import photoAlbum.PhotoAlbumApplication;

import java.io.IOException;

public class StatsApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StatsApplication.class.getResource("Stats-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        primaryStage.setTitle("Stats");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
