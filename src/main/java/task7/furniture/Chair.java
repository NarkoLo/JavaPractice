package task7.furniture;

public class Chair extends Furniture {
    public Chair(String material, String color, int price, String name) {
        super(material, color, price, name);
    }

    @Override
    public void usage() {
        System.out.println("На мне, неожиданно СИДЯТ");
    }
}
