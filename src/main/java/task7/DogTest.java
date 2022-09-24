package task7;

import task7.dog.Chihuahua;
import task7.dog.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog chihu = new Chihuahua("devil", 1000);
        chihu.bark();
        Dog labra = new Chihuahua("Good Boy",2);
        labra.bark();
    }
}
