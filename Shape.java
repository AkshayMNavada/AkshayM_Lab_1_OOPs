public class Shape {
    String color;

    Shape(String color){
        this.color = color;
    }

    double calculateArea(){
        return 0;
    }

    double calculatePerimeter(){
        return 0;
    }

    void display(){
        System.out.println("This is " + this.color + " colored shape");
    }
}
