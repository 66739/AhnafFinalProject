package showhide2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class showhide2Controller {
    @FXML
    private Label lblShowHide;

    @FXML
    private Button btnShowHide;

    @FXML
    private ImageView ImageView = new ImageView();

    public void showImage(){
        File file = new File("/Users/66739/IdeaProjects/demo1/src/main/resources/showhide2/2200582-200.png");
        Image image = new Image(file.toURI().toString());
        ImageView.setImage(image);
    }

    @FXML
    protected void onButtonShowHideClick(){
        if (btnShowHide.getText().equals("HIDE")){
            btnShowHide.setText("SHOW");
            lblShowHide.setText("...");
            ImageView.setVisible(false);
        } else {
            btnShowHide.setText("HIDE");
            lblShowHide.setText("Hey YOU!");
            showImage();
            ImageView.setVisible(true);
        }
    }
}
