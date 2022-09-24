package task7;

import task7.dish.*;

import java.util.ArrayList;
import java.util.Comparator;


public class DishTest {
    public static void main(String[] args) {
        Cup cup = new Cup("Red","Ceramics", 300);
        Plate plate = new Plate("Blue", "Ceramics", 200);
        Pan pan = new Pan("Black","Metal", 4000);
        Pot pot = new Pot("Chugun","Metal", 3000);
        ArrayList<Dish> ass = new ArrayList<>(){{
            add(cup);
            add(plate);
            add(pan);
            add(pot);
        }};
       ass.stream().sorted(Comparator.comparingInt(Dish::getVolume)).forEach(x -> System.out.printf("Цвет: %s\nМатериал: %s\nОбъём: %d \n %n",x.getColor(),x.getMaterial(),x.getVolume()));
       ass.forEach(Dish::usage);
    }
}
