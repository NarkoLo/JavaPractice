package task6;

import lombok.Getter;
import lombok.Setter;
import task4.Shape;

@Getter
@Setter
public class Rectangle extends Shape {
    private double side1, side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void areaCalc() {
        this.setArea(side1*side2);
    }

    @Override
    public void perimeterCalc() {
        this.setPerimeter(side1*2 + side2*2);
    }
}
