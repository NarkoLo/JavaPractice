package task5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class MovablePoint implements Movable {
    private int x, y, ySpeed, xSpeed;
    @Override
    public void moveUp() {
        x+=xSpeed;
    }

    @Override
    public void moveDown() {
        x-=xSpeed;
    }

    @Override
    public void moveLeft() {
        y-=ySpeed;
    }

    @Override
    public void moveRight() {
        y+=ySpeed;
    }
}
