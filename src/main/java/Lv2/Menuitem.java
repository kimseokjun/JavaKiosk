package Lv2;

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

    public void setNo(int no) {
        this.no = no;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
