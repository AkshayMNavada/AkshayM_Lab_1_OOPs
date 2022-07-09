public class Rectangle extends Shape{
    int width;
    int length;

    public Rectangle(String color, String type, int width, int length){
        super(color, type);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return this.width * this.length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public void drawShape(){
        System.out.println("Drawing the shape "+ super.type);
    }

    public void display() {
        System.out.println("This is a " + super.color + " colored "+ super.type);
    }
}
