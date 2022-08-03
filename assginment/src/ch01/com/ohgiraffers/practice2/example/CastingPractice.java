package ch01.com.ohgiraffers.practice2.example;

import java.util.Scanner;

public class CastingPractice {
    Scanner scanner = new Scanner(System.in);

    public void method1() {
        System.out.println("키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 유니코드 값을 출력하세요.");

        System.out.print("\n문자 : ");
        char c = scanner.next().charAt(0);
        System.out.println((int) c);

        scanner.close();
    }

    public void method2() {
        System.out.println("실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.\n" +
            "이 때 총점과 평균은 정수형으로 처리하세요.");

        System.out.print("국어 : ");
        double korean = scanner.nextDouble();

        System.out.print("영어 : ");
        double english = scanner.nextDouble();

        System.out.print("수학 : ");
        double math = scanner.nextDouble();

        System.out.println("\n총점 : " + (int) (korean+english+math));
        System.out.print("평균 : " + (int) (korean+english+math) / 3);

        scanner.close();
    }

    public void method3() {
        System.out.println("선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여\n" +
            "주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.\n");

        int iNum1 = 10;
        int iNum2 = 4;
        float fNum = 3.0f;
        double dNum = 2.5;
        char ch = 'A';

        System.out.println( iNum1 - iNum2 *2); // 2
        System.out.println( (int) dNum ); // 2
        System.out.println( iNum2 * dNum ); // 10.0
        System.out.println( (double) iNum1 ); // 10.0
        System.out.println( (double) iNum1 / iNum2 ); // 2.5
        System.out.println( dNum ); // 2.5
        System.out.println( (int) fNum ); // 3
        System.out.println(  (int) (iNum1 / fNum) ); // 3
        System.out.println( iNum1 / fNum );// 3.3333333
        System.out.println( (double) iNum1 / fNum ); // 3.333333333333335
        System.out.println( (int) ch ); // 65
        System.out.println( ch + iNum1 ); // 75
        System.out.println( (char) (ch + iNum1) ); // 'K'
    }
}
