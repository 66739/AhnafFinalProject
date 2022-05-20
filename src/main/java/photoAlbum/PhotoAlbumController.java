package photoAlbum;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class PhotoAlbumController {
    @FXML
    ImageView imageView = new ImageView();

    PhotoAlbum photoAlbum = new PhotoAlbum();

    @FXML
    public void btnNext(){
        imageView.setImage(photoAlbum.getNextImage());
    }

    @FXML
    public void btnBack(){
        imageView.setImage(photoAlbum.getBackImage());
    }
}
