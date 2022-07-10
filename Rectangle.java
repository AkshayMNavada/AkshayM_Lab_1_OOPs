public class Rectangle extends Shape{

    int length, width;

    Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return this.length * this.width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    void display() {
        System.out.println("This is " + super.color + " colored rectangle");
    }
}
