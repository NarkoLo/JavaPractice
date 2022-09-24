package task5;

public class MovableCircle extends Circle implements Movable{

    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(radius);
        center = new MovablePoint(x,y,ySpeed,xSpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();

    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
