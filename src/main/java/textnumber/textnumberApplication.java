package textnumber;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class textnumberApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(textnumberApplication.class.getResource("textnumber-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 550);
        primaryStage.setTitle("Textnumber && WordWork");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
