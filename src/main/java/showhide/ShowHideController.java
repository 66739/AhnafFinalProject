package showhide;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class ShowHideController{

    @FXML
    private Label lblMessage;

    @FXML
    protected void onShowButtonClick(){
        lblMessage.setText("Halo temanku yang cantik!");
    }
    @FXML
    protected void onHideButtonClick(){
        lblMessage.setText("...");
    }
}
