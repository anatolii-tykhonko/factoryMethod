import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product = CreateProduct.create("bread", 1.0);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
