package task4;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends Rectangle{


    @Override
    public void perimeterCalc() {
        this.setPerimeter(getSide1()*4);
    }

    @Override
    public void areaCalc() {
        this.setArea(Math.pow(getSide1(),2));
    }
}
