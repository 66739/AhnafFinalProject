package numberGuess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NumberGuessApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NumberGuessApplication.class.getResource("NumberGuess-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage.setTitle("Number Guess");
        Stage.setScene(scene);
        Stage.show();

    }
}
