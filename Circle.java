public class Circle extends Shape{
    private int radius;
    final double PI = 3.14;

    public Circle(String color, String type, int radius){
        super(color,type);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public void drawShape() {
        super.drawShape();
    }

    public void display() {
        System.out.println("This is a " + super.color + " colored "+ super.type);
    }
}
