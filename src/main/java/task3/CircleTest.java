package task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(20);
        circle.lengthCalc();
        circle.squareCalc();
        System.out.printf("Площадь: %s%n", circle.getSquare());
        System.out.printf("Длинна: %s%n", circle.getPerimeter());
        System.out.println(circle.toString());
    }
}
