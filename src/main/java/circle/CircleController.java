package circle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CircleController {
    @FXML
    private TextField textRadius;

    @FXML
    private Label lblArea, lblCircumference;

    Circle c;

    @FXML
    protected void onCircleAreaButtonClick(){
        double radius = Double.parseDouble(textRadius.getText());
        Circle r = new Circle(radius);
        double area = r.getArea();
        lblArea.setText("Area: " + area);
    }
    @FXML
    protected void onCirclePerimeterButtonClick(){
        double radius = Double.parseDouble(textRadius.getText());
        Circle r = new Circle(radius);
        double circumference = r.getCircumference();
        lblCircumference.setText("Circumference: " + circumference);
    }
}
