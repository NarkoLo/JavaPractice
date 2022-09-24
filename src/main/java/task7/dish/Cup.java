package task7.dish;

public class Cup extends Dish {

    public Cup(String color, String material, int volume) {
        super(color, material, volume);
    }

    @Override
    public void usage() {
        System.out.println("Используется для подачи напитка");
    }
}
