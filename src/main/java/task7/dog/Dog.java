package task7.dog;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public abstract class Dog {
    private String name;
    private int age;
    public int toHumanAge(){
        if(age> 10)
            return age * 6;
        return age * 10;
    }
    public abstract void bark();
}
