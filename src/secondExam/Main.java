package secondExam;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 20);
        Square square = new Square(9);

        System.out.println("==================================");
        System.out.println("Rectangle with Area: " + rectangle.getArea());
        System.out.println("Rectangle with  Perimeter: " + rectangle.getPerimeter());
        System.out.println("Square with  Area: " + square.getArea());
        System.out.println("Square with Perimeter: " + square.getPerimeter());
    }
}