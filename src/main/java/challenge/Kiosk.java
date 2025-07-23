package challenge;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Kiosk {
    private List<Menu> mainMenus;
    private Scanner scanner;
    Basket basket = new Basket();
    public Kiosk(List<Menu> mainMenus) {
        this.mainMenus = mainMenus;
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {

            displayMainMenu();


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
                        System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
                        inputbasket(selectedItem);
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

    private void displayMainMenu() {
        System.out.println("\n[ MAIN MENU ]");
        for (int i = 0; i < mainMenus.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, mainMenus.get(i).getCategoryName());
        }
        System.out.println("0. 종료      | 종료");
        System.out.print("입력: ");
    }

    private void inputbasket(Menuitem menuitem) {

        System.out.println("위메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인                    2. 취소");
        try{
            int check = scanner.nextInt();
            if (check == 1) {
                System.out.println(menuitem.getName() + "이 장바구니에 추가되었습니다.");
                basket.addItem(menuitem);

                if(!basket.isEmpty()){
                    showordermenu();
                }
            }else if (check == 2) {
                System.out.println("추가를 취소하셨습니다.");
                basket.showbasket();
                if(!basket.isEmpty()){
                    showordermenu();
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Error : " +"정수를 입력해주세요");
        }

    }

    private void showordermenu(){
        System.out.println("\n[ ORDER MENU ]");
        System.out.println("4. Orders         | 장바구니를 확인후 주문합니다.");
        System.out.println("5. Cancle         | 진행중인 주문을 취소합니다.");
        try{
            int check = scanner.nextInt();
            if (check == 4) {
                System.out.println("아래와 같이 주문하시겠습니까?\n");
                System.out.println("[ Orders ]");
                basket.showbasket();
                orderormenu();
            }else if (check == 5) {
                return;
            }else{
                throw new IllegalArgumentException("허용되지 않은 숫자 입니다.");
            }
        }catch(InputMismatchException e){
            System.out.println("Error : " +"정수를 입력해주세요");
        }catch (IllegalArgumentException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    private void orderormenu(){
        System.out.println("1. 주문          2. 메뉴판");
        try{
            int check = scanner.nextInt();
            if (check == 1) {
                System.out.println("\n주문이 완료되었습니다." + "금액은 W" + basket.gettotalprice() + "입니다.");

            }else if (check == 2) {
                return;
            }
        }catch(InputMismatchException e){
            System.out.println("Error : " + "정수를 입력해주세요");
        }catch (IllegalArgumentException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

}

