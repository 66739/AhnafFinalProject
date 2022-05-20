package rectangle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RectangleController {

    @FXML
    private TextField textLength, textWidth;

    @FXML private Label lblArea, lblPerimeter;

    Rectangle r;

    @FXML
    protected  void onAreaButtonClick(){
        double length = Double.parseDouble(textLength.getText());
        double width = Double.parseDouble(textWidth.getText());
        Rectangle r = new Rectangle(length, width);
        double area = r.getArea();
        lblArea.setText("Area: " + area);
    }
    @FXML
    protected  void onPerimeterButtonClick(){
        double length = Double.parseDouble(textLength.getText());
        double width = Double.parseDouble(textWidth.getText());
        Rectangle r = new Rectangle(length, width);
        double perimeter = r.perimeter();
        lblPerimeter.setText("Perimeter: " + perimeter);

    }
}
