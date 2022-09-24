package task4;

import lombok.Data;

@Data
public abstract class Shape {
    private double area;
    private double perimeter;
    public abstract void perimeterCalc();
    public abstract void areaCalc();
}
