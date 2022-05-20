package texteditor;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;

public class TextEditorController {
    @FXML
    private TextArea txtAreaPad;

    TextEditorApplication app = new TextEditorApplication();

    @FXML
    protected void OnCloseItemClick(){
        Platform.exit();
    }
    @FXML
    protected void onDeleteItemClick(){
        txtAreaPad.setText("");
    }
    @FXML
    protected void onCitationItemClick(){
        app.getHostServices().showDocument("https://www.easybib.com/mla/source");
    }
    @FXML
    protected void onSearchItemClick(){
        app.getHostServices().showDocument("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
}
