package lv3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menuitem> menuItems; // MenuItem을 관리하는 리스트가 필드로 존재합니다.

    public Kiosk(List<Menuitem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start(){    //main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리합니다.

        System.out.println("스낵 메뉴");
        showmenu();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            try {
                System.out.print("원하는 메뉴의 번호를 입력해주세요 : ");
                int choice = sc.nextInt();
                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                chooseFood(choice, menuItems);
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine();
            }
        }
    }

    public void showmenu(){
        for (Menuitem menuitem : menuItems) {
            System.out.println(menuitem.getNo() + " " + menuitem.getName() + " " +menuitem.getPrice() + " " + menuitem.getDescription());
        }
    }


    public void chooseFood(int choice, List<Menuitem> menuitem) {
        for (Menuitem choiceitem : menuitem) {
            if(choiceitem.getNo()==choice){
                System.out.println(choiceitem.getNo() + " " + choiceitem.getName() + " " +choiceitem.getPrice() + " " + choiceitem.getDescription());
            }
        }
    }
}
