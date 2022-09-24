package task3;

import lombok.Getter;
import lombok.Setter;
import task2.Shape;
@Setter
@Getter
public class Circle extends Shape {
    private double radius;
    public void lengthCalc(){
        this.setPerimeter(2*Math.PI*radius);
    }
    public void squareCalc(){
        this.setSquare(Math.PI*Math.pow(radius,2));
    }

}
