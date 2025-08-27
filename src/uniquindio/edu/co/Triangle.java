package uniquindio.edu.co;

public class Triangle implements Shape {
    public final double base;
    public final double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return (base * height)/2;
    }
}
