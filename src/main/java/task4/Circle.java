package task4;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Circle extends Shape {
    private double radius;

    @Override
    public void perimeterCalc() {
        this.setPerimeter(2*Math.PI*radius);
    }

    @Override
    public void areaCalc() {
        this.setArea(Math.PI*Math.pow(radius,2));
    }
}
