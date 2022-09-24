package task2;

import lombok.*;


@Data
@AllArgsConstructor
public class Dog {
    private String name;
    private int age;
    public int toHumanAge(){
        if(age> 10)
            return age * 6;
        return age * 10;
    }

}
