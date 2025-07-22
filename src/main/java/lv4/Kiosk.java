package lv4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Kiosk {
    private List<Menu> mainMenus;
    private Scanner scanner;

    public Kiosk(List<Menu> mainMenus) {
        this.mainMenus = mainMenus;
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {

            System.out.println("\n[ MAIN MENU ]");
            for (int i = 0; i < mainMenus.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, mainMenus.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료");
            System.out.print("입력: ");


            int mainChoice = -1;
            try {
                mainChoice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.next();
                continue;
            }

            if (mainChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (mainChoice >= 1 && mainChoice <= mainMenus.size()) {

                Menu selectedCategory = mainMenus.get(mainChoice - 1);


                while (true) {
                    System.out.println("[ " + selectedCategory.getCategoryName().toUpperCase() + " MENU ]");
                    List<Menuitem> items = selectedCategory.getMenuItems();
                    for (Menuitem item : items) {
                        System.out.printf("%d. %s | W %.1f | %s\n",
                                item.getNo(), item.getName(), item.getPrice(), item.getDescription());
                    }
                    System.out.println("0. 뒤로가기");
                    System.out.print("입력: ");


                    int itemChoice = -1;
                    try {
                        itemChoice = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                        scanner.next();
                        continue;
                    }

                    if (itemChoice == 0) {
                        System.out.println("메인 메뉴로 돌아갑니다.");
                        break;
                    }


                    Menuitem selectedItem = null;
                    for (Menuitem item : items) { // no 필드를 이용해 검색
                        if (item.getNo() == itemChoice) {
                            selectedItem = item;
                            break;
                        }
                    }

                    if (selectedItem != null) {
                        System.out.printf("선택한 메뉴: %s | W %.1f | %s\n",
                                selectedItem.getName(), selectedItem.getPrice(), selectedItem.getDescription());
                        break;
                    } else {
                        System.out.println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.");
                    }
                }
            } else {
                System.out.println("유효하지 않은 입력입니다. 다시 선택해주세요.");
            }
        }
        scanner.close();
    }
}

