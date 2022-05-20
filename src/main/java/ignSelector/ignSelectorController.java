package ignSelector;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ignSelectorController {

    @FXML
    private Label lblign;

    @FXML
    protected void onRandomButtonClick(){
        lblign.setText("ItszNever - ign: nxvxr");
    }
}
