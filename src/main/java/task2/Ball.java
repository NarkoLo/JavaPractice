package task2;

import lombok.Data;

@Data
public class Ball {
    private String color;
    private TypeOfBall type;
    private double diameter;

    public enum TypeOfBall {
        Football,
        Basketball,
        Volleyball,
        Handball,
        Tennis,
        Rugby,
        WaterPolo,
        Baseball
    }
}

