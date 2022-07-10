public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Green",3);
        System.out.println("Area of circle is : " + circle.calculateArea());
        System.out.println("Perimeter of circle is : " + circle.calculatePerimeter());
        circle.display();
        System.out.println();

        Triangle triangle = new Triangle("Yellow",4,5);
        System.out.println("Area of triangle is : " + triangle.calculateArea());
        System.out.println("Perimeter of triangle is : " + triangle.calculatePerimeter());
        triangle.display();
        System.out.println();

        Rectangle rectangle = new Rectangle("Red",6,7);
        System.out.println("Area of rectangle is : " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle is : " + rectangle.calculatePerimeter());
        rectangle.display();
        System.out.println();

        Square square = new Square("Blue",8);
        System.out.println("Area of square is : " + square.calculateArea());
        System.out.println("Perimeter of square is : " + square.calculatePerimeter());
        square.display();
    }
}
