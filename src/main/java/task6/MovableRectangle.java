package task6;

public class MovableRectangle extends Rectangle implements Movable{
    //Крайняя левая верхняя точка
    private MovablePoint a;
    //Крайняя правая нижняя точка
    private MovablePoint b;

    public MovableRectangle(double side1, double side2, MovablePoint a, MovablePoint b) {
        super(side1, side2);
        this.a = a;
        this.b = b;
    }
    private void speedComparer(){
        if(a.getXSpeed() != b.getXSpeed())
            a.setXSpeed(b.getXSpeed());
        if(a.getYSpeed() != b.getYSpeed())
            a.setYSpeed(b.getYSpeed());
    }
    @Override
    public void moveUp() {
        a.moveUp();
        b.moveUp();
    }

    @Override
    public void moveDown() {
        a.moveDown();
        b.moveDown();
    }

    @Override
    public void moveLeft() {
        a.moveLeft();
        b.moveLeft();
    }

    @Override
    public void moveRight() {
        a.moveRight();
        b.moveRight();
    }
}
