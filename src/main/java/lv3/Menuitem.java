package lv3;

public class Menuitem {

    private int no;
    private String name;
    private int price;
    private String description;

    public Menuitem(int no, String name, int price, String description) {
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

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
