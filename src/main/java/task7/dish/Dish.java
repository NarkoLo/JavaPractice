package task7.dish;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Dish {
    private String color;
    private String material;
    private int volume;
    public abstract void usage();
}
