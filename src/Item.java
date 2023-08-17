public class Item {
    private static int counter = 1;
    private int id;
    private String name;
    private double price;

    public Item(String name, double price) {
        this.id = counter++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id = " + this.id + ", name = " + this.name + ";";
    }
}
