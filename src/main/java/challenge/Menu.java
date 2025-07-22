package challenge;


import java.util.ArrayList;
import java.util.List;

class Menu {
    private String categoryName;
    private List<Menuitem> menuItems;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    public String getCategoryName() { return categoryName; }

    public void addMenuItem(Menuitem item) {
        this.menuItems.add(item);
    }

    public List<Menuitem> getMenuItems() {
        return menuItems;
    }
}
