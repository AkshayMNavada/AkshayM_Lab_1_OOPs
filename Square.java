public class Square extends Shape{
    private int side;

    public Square(String color, String type, int side) {
        super(color, type);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this.side;
    }

    @Override
    public void drawShape(){
        System.out.println("Drawing the shape "+ super.type);
    }

    public void display() {
        System.out.println("This is a " + super.color + " colored "+ super.type);
    }
}
