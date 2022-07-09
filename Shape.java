public class Shape {
    String color;
    String type;

    public Shape(String color, String type){
        this.color = color;
        this.type = type;
    }

    public double calculateArea(){
        return 0;
    }

    public double calculatePerimeter(){
        return 0;
    }

    public void drawShape(){
        System.out.println("Drawing the shape "+ this.type);
    }
}
