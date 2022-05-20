package ignSelector;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ignSelectorApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ignSelectorApplication.class.getResource("ignSelector.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        primaryStage.setTitle("hi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
