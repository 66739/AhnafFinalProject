package piggyback;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class piggybackApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(piggybackApplication.class.getResource("piggyback.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        primaryStage.setTitle("Pennies | Nickels | Dimes | Quarters");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
