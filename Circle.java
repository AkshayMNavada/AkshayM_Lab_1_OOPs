public class Circle extends Shape {

    int radius;
    final double PI = 3.14;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return PI * Math.pow(this.radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    void display() {
        System.out.println("This is " + super.color + " colored circle");
    }
}
