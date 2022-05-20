package RestaurantMenu;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;


public class RestaurantMenuController {
    @FXML
    private TextArea txtAreaList;
    @FXML
    private Label lblPrice, theDate_;
    @FXML
    private CheckBox chkPizza, chkFries, chkDrink;
    @FXML
    private ToggleGroup Pizza, Drink, Fries;
    @FXML
    private RadioButton radPizzaSmall, radDrinkSmall, radFriesSmall, radPizzaMedium, radDrinkMedium, radFriesMedium, radPizzaLarge, radDrinkLarge, radFriesLarge;
    @FXML
    private DatePicker date;

    String foodType = "", foodSize = "";
    double price = 0;
    RestaurantMenu r1;


    public void Food() {
        foodType = "";
        chkPizza.setText("Pizza");
        chkDrink.setText("Drinks");
        chkFries.setText("Fries");
        if (chkPizza.isSelected()) {
            foodType += chkPizza.getText() + "\n";
        }
        TextAreaList();
        if (chkDrink.isSelected()) {
            foodType += chkDrink.getText() + "\n";
        }
        TextAreaList();
        if (chkFries.isSelected()) {
            foodType += chkFries.getText() + "\n";
        }
        TextAreaList();
    }

    public void radioGroup(){
        foodSize = "";
        radPizzaSmall.setUserData("Small(13.0)");
        radDrinkSmall.setUserData("Small(1.5)");
        radFriesSmall.setUserData("Small(1.0)");
        radPizzaMedium.setUserData("Medium(15.5)");
        radDrinkMedium.setUserData("Medium(2.0)");
        radFriesMedium.setUserData("Medium(1.5)");
        radPizzaLarge.setUserData("Large(17.0)");
        radDrinkLarge.setUserData("Large(2.5)");
        radFriesLarge.setUserData("Large(2.0)");

        if (Pizza.getSelectedToggle() != null){
            foodSize += "Size for Pizza: " + Pizza.getSelectedToggle().getUserData().toString() + "\n";
            TextAreaList();
        }else if (Pizza.getSelectedToggle() == null){
            foodSize += "";
            TextAreaList();
        }

        if (Drink.getSelectedToggle() != null){
            foodSize += "Size for Drinks: " + Drink.getSelectedToggle().getUserData().toString() + "\n";
            TextAreaList();
        }

        if (Fries.getSelectedToggle() != null){
            foodSize += "Size for Fries: " + Fries.getSelectedToggle().getUserData().toString()  + "\n";
            TextAreaList();
        } else if (Fries.getSelectedToggle() == null){
            foodSize += "";
            TextAreaList();
        }
    }

    public void pricing(){
        price = 0;

        radPizzaSmall.setUserData(13.0);
        radPizzaLarge.setUserData(17.0);
        radPizzaMedium.setUserData(15.5);

        radDrinkSmall.setUserData(1.5);
        radDrinkMedium.setUserData(2.0);
        radDrinkLarge.setUserData(2.5);

        radFriesSmall.setUserData(1.0);
        radFriesMedium.setUserData(1.5);
        radFriesLarge.setUserData(2.0);

        if (radPizzaSmall.isSelected()){
            price += (double) (radPizzaSmall.getUserData());
            TextAreaList();
        }
        if (radDrinkSmall.isSelected()){
            price += (double) (radDrinkSmall.getUserData());
            TextAreaList();
        }
        if (radFriesSmall.isSelected()){
            price += (double) (radFriesSmall.getUserData());
            TextAreaList();
        }
        if (radPizzaMedium.isSelected()){
            price += (double) (radPizzaMedium.getUserData());
            TextAreaList();
        }
        if (radDrinkMedium.isSelected()){
            price += (double) (radDrinkMedium.getUserData());
            TextAreaList();
        }
        if (radFriesMedium.isSelected()){
            price += (double) (radFriesMedium.getUserData());
            TextAreaList();
        }
        if (radPizzaLarge.isSelected()){
            price += (double) (radPizzaLarge.getUserData());
            TextAreaList();
        }
        if (radDrinkLarge.isSelected()){
            price += (double) (radDrinkLarge.getUserData());
            TextAreaList();
        }
        if (radFriesLarge.isSelected()){
            price += (double) (radFriesLarge.getUserData());
            TextAreaList();
        }
    }

    public void TextAreaList(){
        if (foodType != null){
            this.r1 = new RestaurantMenu(foodType, foodSize, price);
        }
        if (foodSize != null){
            this.r1 = new RestaurantMenu(foodType, foodSize, price);
        }
        txtAreaList.setText(this.r1.toString());
    }

    public String totalPrice(){
        LocalDate theDate = date.getValue();
        String dateString = theDate.toString();
        String dateValue = dateString;
        String delivery = "Normal delivery time";

        if (price >= 15.0 && (dateValue.equals("2022-06-07") == true || dateValue.equals("2022-12-14") == true)){
            price += 5;
            delivery = "Delivery will take 10 minutes longer than usual, today is a holiday + delivery fee";
            return "Price: $" + price + "\n" + delivery;
        } else if ((dateValue.equals("2022-06-07") == true || dateValue.equals("2022-12-14") == true)) {
            delivery = "Delivery will take 5 minutes longer than usual, today is a holiday";
            return "Price: $" + price + "\n" + delivery;
        } else return  "Price: $" + price + "\n" + delivery;
    }

    @FXML
    public void onPizzaCheck(){
        Food();
    }
    @FXML
    public void onDrinkCheck(){
        Food();
    }
    @FXML
    public void onFriesCheck(){
        Food();
    }
    @FXML
    public void onSmallPizzaClick(){
        radioGroup();
        pricing();
    }
    @FXML
    public void onSmallDrinkClick(){
        radioGroup();
        pricing();
    }
    @FXML
    public void onSmallFriesClick(){
        radioGroup();
        pricing();
    }
    @FXML
    public void onMediumPizzaClick(){
        radioGroup();
        pricing();
    }
    @FXML
    public void onMediumDrinkClick(){
        radioGroup();
        pricing();
    }
    @FXML
    public void onMediumFriesClick(){
        radioGroup();
        pricing();
    }
    @FXML
    public void onLargePizzaClick(){
        radioGroup();
        pricing();
    }
    @FXML
    public void onLargeDrinkClick(){
        radioGroup();
        pricing();
    }
    @FXML
    public void onLargeFriesClick(){
        radioGroup();
        pricing();
    }
    @FXML
    public void onTotalPriceButtonClick(){
        lblPrice.setText(totalPrice());
        LocalDate theDate = date.getValue();
        theDate_.setText(theDate.toString());
    }
}
