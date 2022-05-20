package MovieAnalyzer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MovieAnalyzerApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MovieAnalyzerApplication.class.getResource("MovieAnalyzer-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 602, 800);
        primaryStage.setTitle("Movie Analyzer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    }
