package com.ohgiraffers.day07.API_Homework_임종현.hw1.view;

import com.ohgiraffers.day07.API_Homework_임종현.hw1.controller.TokenController;

import java.util.Scanner;

public class TokenMenu {
    private Scanner scanner = new Scanner(System.in);
    private TokenController tc = new TokenController();

    public void mainMenu() {
        while (true) {
            System.out.print("1. 지정 문자열\n2. 입력 문자\n9. 프로그램 끝내기\n메뉴번호 : ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    tokenMenu();
                    break;
                case 2:
                    inputMenu();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }
    }

    public void tokenMenu() {
        String str = "J a v a P r o g r a m";
        System.out.println("토큰 처리 전 글자 : " + str);
        System.out.println("토큰 처리 전 개수 : " + str.length());

        String afterToken = tc.afterToken(str);
        System.out.println("토큰 처리 후 글자 : " + afterToken);
        System.out.println("토큰 처리 후 개수 : " + afterToken.length());
        System.out.println("모두 대문자로 변환 : " + afterToken.toUpperCase());
    }

    public void inputMenu() {
        System.out.print("문자열을 입력하세요 : ");
        String inputString = scanner.next();
        System.out.println("첫글자 대문자 : " + tc.firstCap(inputString));

        System.out.print("찾을 문자 하나 입력하세요 : ");
        char inputChar = scanner.next().charAt(0);
        System.out.println(inputChar + " 문자가 들어간 갯수 " + tc.findChar(inputString, inputChar));
    }
}
