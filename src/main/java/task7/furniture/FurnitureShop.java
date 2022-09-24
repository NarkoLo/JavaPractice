package task7.furniture;

import lombok.*;
import task7.furniture.Furniture;

import java.util.ArrayList;
import java.util.Objects;

@ToString

public class FurnitureShop {
    private ArrayList<Furniture> catalog;
    @Getter
    @Setter
    private  String name;
    @Getter
    @Setter
    private String address;
    public FurnitureShop(String name, String address){
        this.name = name;
        this.address = address;
        catalog = new ArrayList<>();
    }
    public void addProduct(Furniture newProduct){
        catalog.add(newProduct);
    }
    public void buy(String name){
        catalog.removeIf(fur -> Objects.equals(fur.getName(), name));
    }
    public void showCatalog(){
        catalog.forEach(fur -> System.out.println(fur.toString()));
    }
}
