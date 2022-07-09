public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Green","rectangle",2,4);
        System.out.println("Area of rectangle is " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle is " + rectangle.calculatePerimeter());
        rectangle.drawShape();
        rectangle.display();
        System.out.println();

        Square square = new Square("Yellow","square",5);
        System.out.println("Area of square is " + square.calculateArea());
        System.out.println("Perimeter of square is " + square.calculatePerimeter());
        square.drawShape();
        square.display();
        System.out.println();

        Circle circle = new Circle("Red","circle",6);
        System.out.println("Area of circle is " + circle.calculateArea());
        System.out.println("Perimeter of circle is " + circle.calculatePerimeter());
        circle.drawShape();
        circle.display();
    }
}
