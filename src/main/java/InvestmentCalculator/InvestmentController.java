package InvestmentCalculator;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InvestmentController {

    @FXML
    private TextField textDeposit, textCompounding, textInterest, textDesiredAmount, textDesiredTime;

    @FXML
    private Label lblTime, lblNeededDeposit;

    Investment i;

    @FXML
    protected void onButtonTimeClick(){
        double deposit = Double.parseDouble(textDeposit.getText());
        int compoundingPeriods = Integer.parseInt(textCompounding.getText());
        double interest = Double.parseDouble(textInterest.getText());
        double desiredAmount = Double.parseDouble(textDesiredAmount.getText());
        Investment i = new Investment(deposit, compoundingPeriods, interest, desiredAmount);
        double time = i.getTime();
        lblTime.setText(" = " + time + " years");
    }
    @FXML
    private void onButtonNeededDepositClick() {
        double deposit = Double.parseDouble(textDeposit.getText());
        double timeInput = Double.parseDouble(textDesiredTime.getText());
        int compoundingPeriods = Integer.parseInt(textCompounding.getText());
        double interest = Double.parseDouble(textInterest.getText());
        double desiredAmount = Double.parseDouble(textDesiredAmount.getText());
        Investment i2 = new Investment(deposit, compoundingPeriods, interest, desiredAmount);
        double amount = i2.getNeededDeposit(timeInput);
        lblNeededDeposit.setText(" = $" + amount);
    }
    InvestmentApplication app = new InvestmentApplication();

    @FXML
    protected void OnCloseItemClicker(){
        Platform.exit();
    }
    @FXML
    protected void onSpeechButtonClick(){
        app.getHostServices().showDocument("https://www.youtube.com/watch?v=yRr0_gJ-3mI");
    }
    @FXML
    protected void onPrincipalButtonClick(){
        app.getHostServices().showDocument("https://www.cibc.com/en/personal-banking/investments/retirement-planning/six-principles.html");
    }
}
