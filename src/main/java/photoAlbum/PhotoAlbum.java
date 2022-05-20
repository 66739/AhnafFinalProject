package photoAlbum;

import javafx.scene.image.Image;

import java.io.File;

public class PhotoAlbum {
    private File[] files;
    private Image[] images;
    int index;

    public PhotoAlbum(){
        files =  new File[4];
        images =  new Image[4];
        index = 0;
        setFilesandImages();
    }

    public void setFilesandImages(){
        files[0] =  new File("src/main/resources/photoAlbum/king_of_clubs2.png");
        files[1] =  new File("src/main/resources/photoAlbum/king_of_diamonds2.png");
        files[2] =  new File("src/main/resources/photoAlbum/king_of_hearts2.png");
        files[3] =  new File("src/main/resources/photoAlbum/king_of_spades2.png");

        for (int i = 0; i < images.length; i++) {
            images[i] = new Image(files[i].toURI().toString());
        }
    }

    public Image getNextImage(){
        Image image = images[0];
        if (index < images.length){
            image = images[index];
            index++;
            if (index >= images.length){
                index = images.length -1;
            }
        }
        return image;
    }

    public Image getBackImage(){
        Image image = images[images.length -1];
        if (index <= images.length){
            image = images[index - 1];
            index--;
            if (index <= 0){
                index = 1;
            }
        }
        return image;
    }
}
