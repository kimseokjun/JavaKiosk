package challenge;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private Menuitem menuitem;
    private int quantity;
    private List<Menuitem> menuitems = new ArrayList<Menuitem>();

    public void addItem(Menuitem item) {
        menuitems.add(item);
    }

    public void showbasket() {
        if (menuitems.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
        } else {
            for (Menuitem item : menuitems) {
                System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getDescription());
            }
        }

    }
    public double gettotalprice() {
        double totalprice = 0;
        for (Menuitem item : menuitems) {
            totalprice += item.getPrice();
        }

        return totalprice;
    }

}
