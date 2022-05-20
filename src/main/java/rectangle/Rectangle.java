package rectangle;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(){
        this.width = width;
    }
    public double perimeter(){
        return (2*getWidth()) + (2*getLength());
    }
    public double getArea(){
        return length * width;
    }
}
