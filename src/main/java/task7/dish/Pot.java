package task7.dish;

public class Pot extends Dish {
    public Pot(String color, String material, int volume) {
        super(color, material, volume);
    }

    @Override
    public void usage() {
        System.out.println("Используется для приготовления варёной пищи");
    }
}
