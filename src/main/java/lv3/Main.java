package lv3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Menuitem> menuitems = new ArrayList<>();
        menuitems.add(new Menuitem(1,"ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuitems.add(new Menuitem(2,"SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuitems.add(new Menuitem(3,"Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuitems.add(new Menuitem(4,"Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));


        Kiosk kiosk = new Kiosk(menuitems);
     /*   - [ ]  `List<MenuItem> menuItems` 는 `Kiosk` 클래스 생성자를 통해 값을 할당합니다.
                - [ ]  `Kiosk` 객체를 생성하고 사용하는 `main` 함수에서 객체를 생성할 때 값을 넘겨줍니다.*/
        kiosk.start();
    }

}

