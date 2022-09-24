package task5;

import lombok.Getter;
import lombok.Setter;
import task4.Shape;


@Setter
@Getter

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void perimeterCalc() {
        this.setPerimeter(2*Math.PI*radius);
    }

    @Override
    public void areaCalc() {
        this.setArea(Math.PI*Math.pow(radius,2));
    }
}
