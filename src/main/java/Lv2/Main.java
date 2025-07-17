package Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Menuitem> menuItems = new ArrayList<>();
        menuItems.add(new Menuitem(1,"ShackBurger",6900,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new Menuitem(2,"SmokeShack",8900,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new Menuitem(3,"Cheeseburger",6900,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new Menuitem(4,"Hamburger",5400,"비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new  Scanner(System.in);


        for (Menuitem menuitem : menuItems) {
            System.out.println(menuitem.getNo() + " " + menuitem.getName() + " " +menuitem.getPrice() + " " + menuitem.getDescription());
        }


        while(true){
            try{
                System.out.print("원하는 메뉴의 번호를 입력해주세요 : ");
                int choice = sc.nextInt();
                if(choice == 0){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                chooseFood(choice,menuItems);
            }catch (Exception e){
                System.out.println("잘못입력하셨습니다.");
                sc.nextLine();
            }
        }
    }

    public static void chooseFood(int choice,List<Menuitem> menuitem) {
        for (Menuitem choiceitem : menuitem) {
            if(choiceitem.getNo()==choice){
                System.out.println(choiceitem.getNo() + " " + choiceitem.getName() + " " +choiceitem.getPrice() + " " + choiceitem.getDescription());
            }
        }
    }
}

