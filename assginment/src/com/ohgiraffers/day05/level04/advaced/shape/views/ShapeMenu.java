package com.ohgiraffers.day05.level04.advaced.shape.views;

import com.ohgiraffers.day05.level02.normal.student.model.dto.StudentDto;
import com.ohgiraffers.day05.level04.advaced.shape.manager.SquareManager;
import com.ohgiraffers.day05.level04.advaced.shape.manager.TriangleManager;
import com.ohgiraffers.day05.level04.advaced.shape.model.dto.ShapeDto;

import java.util.Scanner;

public class ShapeMenu {
    private final Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("======= 도형계산기 =======\n3. 삼각형\n4. 사각형\n9. 프로그램 종료\n=======================\n계산하려는 도형을 선택하세요 : ");

        while (true) {
        int menuNumber = scanner.nextInt();

            switch (menuNumber) {
                case 3:
                    System.out.print("도형의 높이를 입력하세요 : ");
                    double triangleWidth = scanner.nextDouble();
                    System.out.print("도형의 너비를 입력하세요 : ");
                    double triangleHeight = scanner.nextDouble();
                    triangleMenu(new ShapeDto(3, triangleWidth, triangleHeight));
                    break;
                case 4:
                    System.out.print("도형의 높이를 입력하세요 : ");
                    double squareWidth = scanner.nextDouble();
                    System.out.print("도형의 너비를 입력하세요 : ");
                    double squareHeight = scanner.nextDouble();
                    squareMenu(new ShapeDto(4, squareWidth, squareHeight));
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("계산할 수 없는 도형입니다. 다시 입력하세요");
                    System.out.print("======= 도형계산기 =======\n3. 삼각형\n4. 사각형\n9. 프로그램 종료\n=======================\n계산하려는 도형을 선택하세요 : ");
                    break;
            }
        }

    }

    private void triangleMenu(ShapeDto shape) {
        TriangleManager triangleManager = new TriangleManager();
        System.out.println("======= 삼각형 계산기 =======\n1. 삼각형의 둘레 구하기\n2. 삼각형의 면적 구하기\n3. 선택한 도형 정보 출력하기\n4. 도형의 색상 칠하기\n9. 메인으로 돌아가기\n=======================");

        while (true) {
            System.out.print("메뉴를 선택하세요 : ");
            int menuNumber = scanner.nextInt();

            switch (menuNumber) {
                case 1:
                    triangleManager.calcPerimeter(shape);
                    break;
                case 2:
                    triangleManager.calcArea(shape);
                    break;
                case 3:
                    triangleManager.printShape(shape);
                    break;
                case 4:
                    triangleManager.paintColor(shape, inputColor());
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요.");
                    System.out.print("======= 삼각형 계산기 =======\n1. 삼각형의 둘레 구하기\n2. 삼각형의 면적 구하기\n3. 선택한 도형 정보 출력하기\n4. 도형의 색상 칠하기\n9. 메인으로 돌아가기\n=======================\n메뉴를 선택하세요 : ");
                    break;
            }
        }
    }

    private void squareMenu(ShapeDto shape) {
        SquareManager squareManager = new SquareManager();
        System.out.println("======= 사각형 계산기 =======\n1. 사각형의 둘레 구하기\n2. 사각형의 면적 구하기\n3. 선택한 도형 정보 출력하기\n4. 도형의 색상 칠하기\n9. 메인으로 돌아가기\n=======================");

        while (true) {
            System.out.print("메뉴를 선택하세요 : ");
            int menuNumber = scanner.nextInt();

            switch (menuNumber) {
                case 1:
                    squareManager.calcPerimeter(shape);
                    break;
                case 2:
                    squareManager.calcArea(shape);
                    break;
                case 3:
                    squareManager.printShape(shape);
                    break;
                case 4:
                    squareManager.paintColor(shape, inputColor());
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요.");
                    System.out.print("======= 사각형 계산기 =======\n1. 사각형의 둘레 구하기\n2. 사각형의 면적 구하기\n3. 선택한 도형 정보 출력하기\n4. 도형의 색상 칠하기\n9. 메인으로 돌아가기\n=======================\n메뉴를 선택하세요 : ");
                    break;
            }
        }
    }

    private String inputColor() {
        System.out.print("어떤 색으로 도형을 칠할까요? : ");
        String color = scanner.next();
        System.out.println("선택하신 도형을 " + color + "로 색칠합니다.");
        return color;
    }
}
