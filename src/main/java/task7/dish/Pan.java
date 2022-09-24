package task7.dish;

public class Pan extends Dish {
    public Pan(String color, String material, int volume) {
        super(color, material, volume);
    }

    @Override
    public void usage() {
        System.out.println("Используется для приготовления жареной или тушёной пищи");
    }
}
