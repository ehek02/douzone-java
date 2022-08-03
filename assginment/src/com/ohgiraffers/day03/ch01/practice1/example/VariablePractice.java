package com.ohgiraffers.day03.ch01.practice1.example;

import java.util.Scanner;

public class VariablePractice {
    Scanner scanner = new Scanner(System.in);

    public void method1() {
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.next();

        System.out.print("나이을 입력하세요 : ");
        int age = scanner.nextInt();

        System.out.print("성별을 입력하세요(남/여) : ");
        String gender = scanner.next();

        System.out.print("키을 입력하세요(cm) : ");
        double height = scanner.nextDouble();

        System.out.println("키 " + height + "인 " + age + "살 " + gender +  "자 " +name+"님 반갑습니다^^");

        scanner.close();
    }

    public void method2() {
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int firstNumber = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int secondNumber = scanner.nextInt();

        System.out.println("\n더하기 결과 : " + (firstNumber+secondNumber));
        System.out.println("빼기 결과 : " + (firstNumber-secondNumber));
        System.out.println("곱하기 결과 : " + (firstNumber*secondNumber));
        System.out.println("나누기 몫 결과 : " + (firstNumber/secondNumber));

        scanner.close();
    }

    public void method3() {
        System.out.println("키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.\n" +
            "* 참고 ( 면적=가로*세로 , 둘레=(가로+세로)*2 )");

        System.out.print("\n가로 : ");
        double width = scanner.nextDouble();

        System.out.print("세로 : ");
        double height = scanner.nextDouble();

        System.out.println("\n면적 : " + (width*height));
        System.out.println("둘레 : " + (width+height)*2);

        scanner.close();
    }

    public void method4() {
        System.out.println("영어 문자열 값을 키보드로 입력 받아 앞의 문자 세 개를 출력하세요.\n" +
            "HINT > charAt(인덱스) 메소드 활용해보기");

        System.out.print("\n문자열을 입력하세요 : ");
        String line = scanner.next();

        System.out.println("\n첫 번째 문자 : " + line.charAt(0));
        System.out.println("두 번째 문자 : " + line.charAt(1));
        System.out.println("세 번째 문자 : " + line.charAt(2));

        scanner.close();
    }
}
