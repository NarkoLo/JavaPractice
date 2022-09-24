package task7.furniture;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Furniture {
    String material;
    String color;
    int price;
    String name;

    @Override
    public String toString() {
        return String.format("Название: %s  Материал: %s  Цвет: %s  Цена: %d", name,material,color,price);
    }

    public abstract void usage();
}
