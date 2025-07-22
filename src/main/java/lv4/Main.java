package lv4;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Menu 객체 생성을 통해 이름 설정
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        Menuitem shackBurger = new Menuitem(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        Menuitem smokeShack = new Menuitem(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        Menuitem cheeseburger = new Menuitem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        Menuitem hamburger = new Menuitem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        Menuitem coke = new Menuitem(1, "ZeroCoke", 2.0, "제로콜라");
        Menuitem sprite = new Menuitem(2, "ZeroCider", 2.0, "제로사이다");

        Menuitem fries = new Menuitem(1, "Fries", 3.0, "감자튀김");
        Menuitem chickNuget = new Menuitem(2, "ChickNuget", 4.5, "너겟");

        Menu burgersMenu = new Menu("Burgers");
        burgersMenu.addMenuItem(shackBurger);
        burgersMenu.addMenuItem(smokeShack);
        burgersMenu.addMenuItem(cheeseburger);
        burgersMenu.addMenuItem(hamburger);

        Menu drinksMenu = new Menu("Drinks");
        drinksMenu.addMenuItem(coke);
        drinksMenu.addMenuItem(sprite);

        Menu sidessMenu = new Menu("Sides");
        sidessMenu.addMenuItem(fries);
        sidessMenu.addMenuItem(chickNuget);

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(Arrays.asList(burgersMenu, drinksMenu, sidessMenu));

        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}