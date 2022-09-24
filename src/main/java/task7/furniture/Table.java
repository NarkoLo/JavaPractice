package task7.furniture;

public class Table extends Furniture {
    public Table(String material, String color, int price, String name) {
        super(material, color, price, name);
    }

    @Override
    public void usage() {
        System.out.println("За мной айтишники проводят большинство своей жизни");
    }
}
