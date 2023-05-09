package kr.ac.sahmyook;

import java.util.Scanner;

public class Bread {
    Scanner sc = new Scanner(System.in);
    boolean isOn;
    private int temperature;
    private int count;
    private int state = 0;

    public void startCooking() {
        if (isOn) {
            System.out.println("이미 오븐이 켜져 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("오븐이 켜졌습니다. 빵이 구워집니다.");
        }
    }

    public void setTemperature() {
        if (isOn && count == 0) {
            System.out.print("오븐 온도를 설정 해 주세요 : ");
            this.temperature = sc.nextInt();
            System.out.println(this.temperature + "ºC 로 설정되었습니다.");
            count++;
        } else if (isOn && count != 0) {
            System.out.println("이미 조리가 시작되었습니다.");
        } else {
            System.out.println("오븐을 먼저 켜주세요");
        }
    }

    public void upTemperature() {
        if (isOn && count == 0) {
            System.out.println("먼저 온도 설정부터 해주세요");
        } else if (isOn && count != 0) {
            this.temperature += 10;
            state += (temperature / 20);
            System.out.println("온도를 10ºC 올렸습니다. 현재 온도는 " + temperature + "ºC 입니다.");
            System.out.println("빵이 " + state + "% 구워졌습니다.");
            count++;
        } else {
            System.out.println("오븐을 먼저 켜주세요");
        }
    }

    public void staying() {
        if (isOn && count == 0) {
            System.out.print("먼저 온도 설정부터 해주세요");
        } else if (isOn && count != 0) {
            state += (temperature / 20);
            System.out.println("빵이 구워지며 맛있는 냄새가 납니다. 현재 온도는 " + temperature + "ºC 입니다." );
            System.out.println("빵이 " + state + "% 구워졌습니다.");
            count++;
        } else {
            System.out.println("아무 일도 일어나지 않았다");
        }
    }

    public void downTemperature() {
        if (isOn && count == 0) {
            System.out.println("먼저 온도 설정부터 해주세요");
        } else if (isOn && count != 0) {
            this.temperature -= 10;
            state += (temperature / 20);
            System.out.println("온도를 10ºC 내렸습니다. 현재 온도는 " + temperature + "ºC 입니다.");
            System.out.println("빵이 " + state + "% 구워졌습니다.");
            count++;
        } else {
            System.out.println("오븐을 먼저 켜주세요");
        }
    }

    public void stopCooking() {
        if (isOn && state > 110) {
            System.out.println("빵이 " + count + "분 만에 " + state + "% 구워졌습니다.");
            System.out.println("빵이 타버렸습니다. 다시 도전해보세요");
            isOn = false;
        } else if (isOn && state >= 100) {
            System.out.println("빵이 " + count + "분 만에 " + state + "% 구워졌습니다.");
            System.out.println("빵이 맛있게 구워졌습니다. 훌륭합니다!");
            isOn = false;
        } else if (isOn) {
            System.out.println("빵이 " + count + "분 만에" + state + "% 구워졌습니다.");
            System.out.println("밀가루 반죽 맛이 나네요. 대단합니다!");
            isOn = false;
        } else {
            System.out.println("오븐 먼저 켜주세요");
        }
    }
}
