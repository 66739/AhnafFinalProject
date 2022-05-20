package textnumber;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class textnumberController {
    @FXML
    private TextField txtInput;

    @FXML
    private TextArea txtOutput;

    @FXML
    private TextField txtWord;

    @FXML
    private TextArea txtWordDisplay;

    textnumberClass i;
    String display;
    WordWork ww;

    public textnumberController(){
        txtInput =  new TextField();
        txtOutput = new TextArea();
        txtWord = new TextField();
        i = new textnumberClass();
        ww = new WordWork();
        display = "";
    }
    @FXML
    protected void onReverseTextClick(){
        if (!txtInput.getText().isEmpty()){
            display = i.textBackwards(txtInput.getText());
        } else {
            display = "Enter a text or a number";
        }
        txtOutput.setText(display);
    }

    @FXML
    protected void onCountVowelClick(){
        if (!txtInput.getText().isEmpty()){
            int count = i.countVowels(txtInput.getText());
            display = "There are " + count + " vowels in " + txtInput.getText();
        } else {
            display = "Enter a text or a number";
        }
        txtOutput.setText(display);
    }

    @FXML
    protected void onDigitSumClick(){
        boolean isNumber = i.isNumber(txtInput.getText());

        if (isNumber && !txtInput.getText().isEmpty()) {
            int num = Integer.valueOf(txtInput.getText());
            int sum = i.digitSum(num);
            display = "The sum of all the digits for " + num + " is " + sum;
        } else {
            display = "You did NOT enter a number";
        }
        txtOutput.setText(display);
    }

    @FXML
    protected void onResetClick(){
        txtInput.setText("");
        txtOutput.setText("");
    }

    @FXML
    protected void onWordWorkClick(ActionEvent event) throws IOException {
        Parent wordWork = FXMLLoader.load(getClass().getResource("wordwork-view.fxml"));
        Scene scene = new Scene(wordWork);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Word Work");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onOpenTextNumberClick(ActionEvent event) throws IOException{
        Parent wordWork = FXMLLoader.load(getClass().getResource("textnumber-view.fxml"));
        Scene scene = new Scene(wordWork);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Text Number");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onLetterBoxClick(){
        if (!txtWord.getText().isEmpty()){
            TextInputDialog dialog1 = new TextInputDialog();
            dialog1.setTitle("Rows");
            dialog1.setHeaderText("Number of rows");
            dialog1.setContentText("Please enter number of rows");
            Optional<String> row = dialog1.showAndWait();

            int rowNum = 0;
            if (row.isPresent()){
                rowNum = Integer.parseInt(row.get());
            }

            TextInputDialog dialog2 = new TextInputDialog();
            dialog2.setTitle("Columns");
            dialog2.setHeaderText("Number of columns");
            dialog2.setContentText("Please enter number of columns");
            Optional<String> col = dialog2.showAndWait();

            int colNum = 0;
            if (col.isPresent()){
                colNum = Integer.parseInt(col.get());
            }

            String box = ww.printRectLetters(txtWord.getText(), rowNum, colNum);
            display = box;
        }
        txtWordDisplay.setText(display);
    }

    public void onWWReset(){
        txtWord.setText("");
        txtWordDisplay.setText("");
    }

    public void onSingleWordClick(){
        if (!txtWord.getText().isEmpty()) {
            String alt = ww.makeSingleWord(txtWord.getText());
            display = "Alternate Text: " + alt;
        }
        txtWordDisplay.setText(display);
    }

    public void onPalindromeClick(){
        if (!txtWord.getText().isEmpty()) {
            boolean isPalindrome = ww.isPalindrome(txtWord.getText());
            display = "Is it a Palindrome?: " + isPalindrome;
        }
        txtWordDisplay.setText(display);
    }

    public void onAlternateTextClick(){
        if (!txtWord.getText().isEmpty()) {
            String text = ww.createAlternateText(txtWord.getText());
            display = "Is it a Palindrome?: " + text;
        }
        txtWordDisplay.setText(display);
    }


}
