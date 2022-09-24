package task7;

import task7.furniture.*;

public class FurnitureTest {
    public static void main(String[] args) {
        Furniture chair = new Chair("Деревяха вишнёвая","Деревянно-вишнёвый", 20000,"Вишнёвое Сидалище");
        Furniture sofa = new Sofa("Золото эры тёмных технологий и слёзы бедных псайкеров", "Имперский золотой", Integer.MAX_VALUE,"Золотой трон");
        Furniture table = new Table("Пластик", "Желтеющий белый",Integer.MIN_VALUE, "Картонка" );
        FurnitureShop shop = new FurnitureShop("Pres F", "Где-то");
        shop.addProduct(chair);
        shop.addProduct(sofa);
        shop.addProduct(table);
        shop.showCatalog();
        shop.buy("Золотой трон");
        shop.showCatalog();
    }
}
