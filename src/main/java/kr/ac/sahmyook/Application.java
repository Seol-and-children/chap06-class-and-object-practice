package kr.ac.sahmyook;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chef chef = new Chef();

        do {
            System.out.println("========== 빵 굽기 프로그램 ==========");
            System.out.println("1. 오븐 켜고 빵 넣기");
            System.out.println("2. 온도 설정하기");
            System.out.println("3. 온도 올리기");
            System.out.println("4. 가만히 기다리기");
            System.out.println("5. 온도 내리기");
            System.out.println("6. 빵 꺼내고 오븐 끄기");
            System.out.println("9. 프로그램 종료");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    chef.turnOn();
                    break;
                case 2:
                    chef.setTemperature();
                    break;
                case 3:
                    chef.upTemperature();
                    break;
                case 4:
                    chef.staying();
                    break;
                case 5:
                    chef.downTemperature();
                    break;
                case 6:
                    chef.turnOff();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요");
            }
        } while (true);
    }
}