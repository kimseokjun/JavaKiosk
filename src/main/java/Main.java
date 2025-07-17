import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Menuitem> menuItems = new ArrayList<>();
        menuItems.add(new Menuitem("ShackBurger",6900,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new Menuitem("SmokeShack",8900,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new Menuitem("Cheeseburger",6900,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new Menuitem("Hamburger",5400,"비프패티를 기반으로 야채가 들어간 기본버거"));

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료      | 종료");

        Scanner sc = new  Scanner(System.in);

        System.out.print("번호를 입력하세요 : ");
        int choice = sc.nextInt();
    }
}
