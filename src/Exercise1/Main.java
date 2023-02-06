package Exercise1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 7);
        Square square = new Square(34);

        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Area of square: " + square.getArea());
    }
}
