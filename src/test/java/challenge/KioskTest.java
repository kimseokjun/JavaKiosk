package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;




class KioskTest {

    Scanner sc = new Scanner(System.in);

    @Test
    @DisplayName("4,5가 아닌 숫자를 입력")
    public void showordermenu(){
        System.out.println("\n[ ORDER MENU ]");
        System.out.println("4. Orders         | 장바구니를 확인후 주문합니다.");
        System.out.println("5. Cancle         | 진행중인 주문을 취소합니다.");
        try{
            int check = 10;
            if (check == 4) {
                System.out.println("아래와 같이 주문하시겠습니까?");
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


}