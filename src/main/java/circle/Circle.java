package circle;

public class Circle {
    double radius;

    public Circle(double Theradius){
        this.radius = Theradius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }
    public double getCircumference(){
        double circumference = 2 * Math.PI * getRadius();
        return circumference;
    }
}
