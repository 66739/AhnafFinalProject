package showhide2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class showhide2Application extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(showhide2Application.class.getResource("showhide2-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);

        primaryStage.setTitle("SHOW||HIDE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
