public class MilitaryProduct implements Product {
    private String name;
    private Double price;

    public MilitaryProduct(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return "Military product: " + name;
    }

    @Override
    public Double getPrice() {
        if(price <= 0){
            return 0.0;
        }
        return price;
    }
}
