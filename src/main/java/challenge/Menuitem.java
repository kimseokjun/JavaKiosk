package challenge;

public class Menuitem {

    private int no;
    private String name;
    private double price;
    private String description;

    public Menuitem(int no, String name, double price, String description) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

