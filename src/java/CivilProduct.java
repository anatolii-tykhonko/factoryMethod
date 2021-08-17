public class CivilProduct implements Product{
    private String name;
    private Double price;

    public CivilProduct(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return "Civil product: " + name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
