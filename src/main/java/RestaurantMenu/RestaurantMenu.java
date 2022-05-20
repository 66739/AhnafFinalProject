package RestaurantMenu;

public class RestaurantMenu {
    private String foodType;
    private String foodSize;
    private double price;
    private String Date;

    public RestaurantMenu(String typeFood, String sizeFood, double price){
        this.foodSize = sizeFood;
        this.foodType = typeFood;
        this.price = price;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodSize() {
        return foodSize;
    }

    public void setFoodSize(String foodSize) {
        this.foodSize = foodSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString(){
        return getFoodType() + "" + getFoodSize() + "" + "$" + getPrice();
    }
}
