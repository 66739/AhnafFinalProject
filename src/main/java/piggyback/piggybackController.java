package piggyback;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class piggybackController {
    @FXML
    private TextField textPennies, textNickels, textDimes, textQuarters;

    @FXML
    private Label lblAmount;

    piggyback p;

    @FXML
    protected void onCoinsButtonClick(){
        double P = Double.parseDouble(textPennies.getText());
        double N = Double.parseDouble(textNickels.getText());
        double D = Double.parseDouble(textDimes.getText());
        double Q = Double.parseDouble(textQuarters.getText());
        piggyback p = new piggyback(P, N, D, Q);
        double amount = p.getTotalamount();
        lblAmount.setText("$" + amount);
    }
}
