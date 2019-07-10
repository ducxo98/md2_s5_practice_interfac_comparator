public class Circle {
    private double radius=10.0;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius()
                + ", Area = " + getArea();
    }
}
