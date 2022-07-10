public class Square extends Rectangle{

    Square(String color, int side) {
        super(color, side, side);
    }

    @Override
    void display() {
        System.out.println("This is " + super.color + " colored square");
    }

}
