package task4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Shape{
    private double side1, side2;

    @Override
    public void areaCalc() {
        this.setArea(side1*side2);
    }

    @Override
    public void perimeterCalc() {
        this.setPerimeter(side1*2 + side2*2);
    }
}
