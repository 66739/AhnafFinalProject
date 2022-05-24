package MovieAnalyzer;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MovieAnalyzerController implements Initializable {
    int index = 0;

    @FXML
    private TableView<MovieAnalyzer> table;

    @FXML
    private TableColumn<MovieAnalyzer, String> NameColumn = new TableColumn<MovieAnalyzer, String>();

    @FXML
    private TableColumn<MovieAnalyzer, String> GenreColumn = new TableColumn<MovieAnalyzer, String>();

    @FXML
    private TableColumn<MovieAnalyzer, String> DirectorColumn = new TableColumn<MovieAnalyzer, String>();

    @FXML
    private TableColumn<MovieAnalyzer, Integer> LengthColumn = new TableColumn<MovieAnalyzer, Integer>();

    @FXML
    private TableColumn<MovieAnalyzer, Double> RatingColumn = new TableColumn<MovieAnalyzer, Double>();

    @FXML
    private TextField txtName, txtRating, txtLength, txtDirector;

    @FXML
    private Label lblGenre, lblTitle, lblAnswer, lblWarning;

    @FXML
    private RadioButton rbSciFi, rbRomance, rbCrime, rbDrama, rbAction;


    static MovieAnalyzer[] ma = new MovieAnalyzer[100];

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NameColumn.setCellValueFactory(new PropertyValueFactory<MovieAnalyzer, String>("name"));
        GenreColumn.setCellValueFactory(new PropertyValueFactory<MovieAnalyzer, String>("genre"));
        DirectorColumn.setCellValueFactory(new PropertyValueFactory<MovieAnalyzer, String>("director"));
        RatingColumn.setCellValueFactory(new PropertyValueFactory<MovieAnalyzer, Double>("rating"));
        LengthColumn.setCellValueFactory(new PropertyValueFactory<MovieAnalyzer, Integer>("length"));
    }

    public void getGenre(ActionEvent event) {
        if (rbAction.isSelected()) {
            lblGenre.setText(rbAction.getText());
        } else if (rbSciFi.isSelected()) {
            lblGenre.setText(rbSciFi.getText());
        } else if (rbRomance.isSelected()) {
            lblGenre.setText(rbRomance.getText());
        } else if (rbCrime.isSelected()) {
            lblGenre.setText(rbCrime.getText());
        } else if (rbDrama.isSelected()) {
            lblGenre.setText(rbDrama.getText());
        }
    }

    @FXML
    protected void onEnterClick(ActionEvent event) {
        MovieAnalyzer movieAnalyzer = new MovieAnalyzer(txtName.getText(), lblGenre.getText(), txtDirector.getText(),
                Double.parseDouble(txtRating.getText()), Integer.parseInt(txtLength.getText()));
        if (index < ma.length){
            ma[index] = movieAnalyzer;
            index++;
        }
        ObservableList<MovieAnalyzer> movieAnalyzers = table.getItems();
        movieAnalyzers.add(movieAnalyzer);
        table.setItems(movieAnalyzers);
    }

    public MovieAnalyzer[] getMa() {
        return ma;
    }

    @FXML
    protected void onOpenAnalyzerClick(ActionEvent event) throws IOException {
        Parent MovieAnalyzer = FXMLLoader.load(getClass().getResource("Analyzer-view.fxml"));
        Scene scene = new Scene(MovieAnalyzer);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Analyzer");
        stage.setScene(scene);
        stage.show();
    }

    public int count() {
        int count = 0;
        for (int i = 0; i < ma.length; i++) {
            if (ma[i] != null) {
                count++;
            }
        }
        return count;
    }

    @FXML
    protected void onBestRateClick() {
        int count = count();

        MovieAnalyzer best = ma[0];
        if (best == null){
            lblTitle.setText("Your Best Rated Movie");
            lblAnswer.setText("You didn't add any movies to your list?");
        }
        for (int i = 0; i < count; i++) {
            if ((ma[i] != null && best != null) && (ma[i].getRating() > best.getRating())) {
                best = ma[i];
            }
        }


        lblTitle.setText("Your Best Rated Movie");
        lblAnswer.setText(best.getName());
    }

    @FXML
    protected void onDirectorClick() {
        int count = count();

        MovieAnalyzer best = ma[0];
        if (best == null){
            lblTitle.setText("Your Favourite Director");
            lblAnswer.setText("You didn't add any movies to your list?");
        }
        for (int i = 0; i < count; i++) {
            if ((ma[i] != null && best != null) && (ma[i].getRating() > best.getRating())) {
                best = ma[i];
            }
        }
        lblTitle.setText("Your Favourite Director");
        lblAnswer.setText(best.getDirector());
    }

    @FXML
    protected void onLongestMovieClick() {
        int count = count();

        MovieAnalyzer Longest = ma[0];
        if (Longest == null){
            lblTitle.setText("Your Longest Movie");
            lblAnswer.setText("You didn't add any movies to your list?");
        }
        for (int i = 0; i < count; i++) {
            if ((ma[i] != null && Longest != null) && (ma[i].getLength() > Longest.getLength())) {
                Longest = ma[i];
            }
        }
        lblTitle.setText("Your Longest Movie");
        lblAnswer.setText(Longest.getName() + " with " + Longest.getLength() + " minutes!");
    }


    @FXML
    protected void onLowestRatedClick(){
        int count = count();

        MovieAnalyzer lowest = ma[0];
        if (lowest == null){
            lblTitle.setText("Your Lowest Rated Movie");
            lblAnswer.setText("You didn't add any movies to your list?");
        }
        for (int i = 0; i < count; i++) {
            if ((ma[i] != null && lowest != null) && (ma[i].getRating() < lowest.getRating())) {
                lowest = ma[i];
            }
        }

        lblTitle.setText("Your Lowest Rated Movie");
        lblAnswer.setText(lowest.getName());
    }


    @FXML
    protected void onWorthItClick(){
        int count = count();

        MovieAnalyzer starting = ma[0];
        if (starting == null){
            lblTitle.setText("Your Most Worth It Movie");
            lblAnswer.setText("You didn't add any movies to your list?");
        }
        for (int i = 0; i < count; i++) {
            if ((ma[i].getRatio() < starting.getRatio())){
                starting = ma[i];
            }
        }
        lblTitle.setText("Your Most Worth It Movie");
        lblAnswer.setText(starting.getName());
    }

    @FXML
    protected void onLeastWorthToWatch(){
        int count = count();

        MovieAnalyzer starting = ma[0];
        if (starting == null){
            lblTitle.setText("Your Least Worth It Movie");
            lblAnswer.setText("You didn't add any movies to your list?");
        }
        for (int i = 0; i < count; i++) {
            if ((ma[i].getRatio() > starting.getRatio())){
                starting = ma[i];
            }
        }
        lblTitle.setText("Your Least Worth It Movie");
        lblAnswer.setText(starting.getName());
    }

    @FXML
    protected void onMainMenuClick(ActionEvent event) throws IOException {
        Parent MovieAnalyzer = FXMLLoader.load(getClass().getResource("MovieAnalyzer-view.fxml"));
        Scene scene = new Scene(MovieAnalyzer);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Analyzer");
        stage.setScene(scene);
        stage.show();
    }


}
