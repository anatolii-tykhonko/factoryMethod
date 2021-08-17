import java.util.ArrayList;
import java.util.List;

public class CreateProduct {
    private static List<String> militaryProducts;
    static {
        militaryProducts = new ArrayList<>();
        militaryProducts.add("rocket");
        militaryProducts.add("gun");
        militaryProducts.add("ammo");
        militaryProducts.add("kevlar");
        militaryProducts.add("panzer");
    }

    public static Product create(String name, double price) {
        if(militaryProducts.contains(name)){
            return new MilitaryProduct(name, price);
        } else {
            return new CivilProduct(name, price);
        }
    }
}
