package task7.furniture;

public class Sofa extends Furniture {
    public Sofa(String material, String color, int price, String name) {
        super(material, color, price, name);
    }

    @Override
    public void usage() {
        System.out.println("Служу диванным войскам верой и правдой");
    }
}
