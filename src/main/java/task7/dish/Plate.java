package task7.dish;

public class Plate extends Dish {

    public Plate(String color, String material, int volume) {
        super(color, material, volume);
    }

    @Override
    public void usage() {
        System.out.println("Используется для подачи еды");
    }
}
