package numberGuess;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class NumberGuessController {

    @FXML
    Button btnCheck = new Button();
    @FXML
    TextField txtGuess = new TextField();
    @FXML
    Label lbAlert = new Label();

    @FXML
    VBox vBox = new VBox();

    NumberGuess ng = new NumberGuess();
    int guess = 0;
    int tries = 0;

    public void CheckGuess(){
        guess = Integer.parseInt(txtGuess.getText());
        lbAlert.setText("");

        Label nLabel = new Label();
        Label nLabel2 = new Label();

        if (guess < 9 || guess > 100){
            lbAlert.setTextFill(Color.RED);
            lbAlert.setText("Enter a 2-digit number!");
        }else{
            tries++;
            nLabel.setFont(new Font("Arial", 24));
            nLabel2.setFont(new Font("Arial", 24));

        }
        if (ng.getNumber() == guess){
            lbAlert.setTextFill(Color.GREEN);
            lbAlert.setText("You Won! That's the number!");
            nLabel2.setTextFill(Color.YELLOWGREEN);
            nLabel.setTextFill(Color.YELLOWGREEN);
        }else{
            if (ng.onesCorrect(guess)){
                nLabel2.setTextFill(Color.YELLOWGREEN);
            }else if (ng.onesExist(guess)) {
                nLabel2.setTextFill(Color.ORANGE);
            }else {
                nLabel.setTextFill(Color.BLACK);
            }
            if(ng.tensCorrect(guess)){
                nLabel.setTextFill(Color.YELLOWGREEN);
            }else if (ng.tensExist(guess)) {
                nLabel.setTextFill(Color.ORANGE);
            }else {
                nLabel.setTextFill(Color.BLACK);
            }

            if (tries == 5) {
                lbAlert.setTextFill(Color.RED);
                lbAlert.setText("Game Over!");
                btnCheck.setDisable(true);
            }else {
                lbAlert.setTextFill(Color.BLACK);
                lbAlert.setText("Green: correct number and correct position. \n" + "Orange: Correct number but not in the correct position. \n" + "Black: no match, keep trying!");
            }
        }

        nLabel.setText(guess/ 10 + " ");
        nLabel2.setText(" " + guess % 10);
        HBox hBox = new HBox();
        hBox.getChildren().add(nLabel);
        hBox.getChildren().add(nLabel2);
        vBox.getChildren().add(hBox);

    }
}
