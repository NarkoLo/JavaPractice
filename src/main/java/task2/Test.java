package task2;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setPerimeter(100);
        shape.setSquare(2000);
        System.out.println(shape.toString());

        Ball ball = new Ball();
        ball.setType(Ball.TypeOfBall.Football);
        ball.setDiameter(20);
        ball.setColor("Green");
        System.out.println(ball.toString());

        Book book = new Book();
        book.setTitle("Маленький принц");
        book.setColor("Blue");
        book.setAuthor("Антуан де Суент-Экзюпери");
        book.setNumOfPages(96);
        System.out.println(book.toString());


    }
}
