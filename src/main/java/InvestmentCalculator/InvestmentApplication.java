package InvestmentCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InvestmentApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InvestmentApplication.class.getResource("Investment-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        primaryStage.setTitle("Investment Calculator - (go full screen if your application does not fit :)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
