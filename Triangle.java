public class Triangle extends Shape {
    int height, base;

    Triangle(String color, int height, int base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    double calculateArea() {
        return this.height * this.base;
    }

    @Override
    double calculatePerimeter() {
        return (this.height + this.base) + Math.sqrt(this.height ^ 2 + this.base ^ 2);
    }

    @Override
    void display() {
        System.out.println("This is " + super.color + " colored triangle");
    }
}
