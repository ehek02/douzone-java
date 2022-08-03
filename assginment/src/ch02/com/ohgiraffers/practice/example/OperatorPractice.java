package ch02.com.ohgiraffers.practice.example;

import java.util.Scanner;

public class OperatorPractice {
    Scanner scanner = new Scanner(System.in);

    public void practice1() {
        System.out.println("키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.\n");

        System.out.print("정수 : ");
        int number = scanner.nextInt();

        System.out.println((number > 0) ? "양수다" : (number < 0) ? "양수가 아니다" : "0은 입력하지마세요");

        scanner.close();
    }

    public void practice2() {
        System.out.println("키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, \n" +
            "양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.\n");

        System.out.print("정수 : ");
        int number = scanner.nextInt();

        System.out.println((number > 0) ? "양수다" : (number < 0) ? "음수다" : "0이다");

        scanner.close();
    }

    public void practice3() {
        System.out.println("키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.\n");

        System.out.print("정수 : ");
        int number = scanner.nextInt();

        System.out.println((number % 2 == 0) ? "짝수다" : "홀수다");

        scanner.close();
    }

    public void practice4() {
        System.out.println("모든 사람이 사탕을 골고루 나눠가지려고 한다. \n" +
            "인원 수와 사탕 개수를 키보드로 입력 받고\n" +
            "1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.\n");

        System.out.print("인원 수 : ");
        int peopleCount = scanner.nextInt();

        System.out.print("사탕 개수 : ");
        int candyCount = scanner.nextInt();

        System.out.println("\n1인당 사탕 개수 : " + candyCount / peopleCount);
        System.out.println("남는 사탕 개수 : " + candyCount % peopleCount);

        scanner.close();
    }

    public void practice5() {
        System.out.println("키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.\n" +
            "이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.\n");

        System.out.print("이름 : ");
        String name = scanner.next();

        System.out.print("학년(숫자만) : ");
        int grade = scanner.nextInt();

        System.out.print("반(숫자만) : ");
        int group = scanner.nextInt();

        System.out.print("번호(숫자만) : ");
        int number = scanner.nextInt();

        System.out.print("성별(M/F) : ");
        String gender = "";
        char temp = scanner.next().charAt(0);
        System.out.println((temp == 'M') ? "남학생" : (temp == 'F') ? "여학생" : "M/F 만 입력가능합니다.");

        System.out.print("성적(소수점 아래 둘째 자리까지) : ");
        double score = scanner.nextDouble();

        System.out.println(grade+"학년 " + group+"반 " + number+"번 " + name + " " + gender + " 의 성적은 " + score + "이다.");
        scanner.close();
    }

    public void practice6() {
        System.out.println("나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, \n" +
            "성인(19세 초과)인지 출력하세요.\n");

        System.out.print("나이 : ");
        int age = scanner.nextInt();

        System.out.println((age <= 13 && age > 0) ? "어린이" : (age <= 19) ? "청소년" : (age > 19) ? "성인" : "올바른 숫자를 입력해주세요");

        scanner.close();
    }

    public void practice7() {
        System.out.println("국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, \n" +
            "세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.\n" +
            "세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데\n" +
            "세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.\n");

        System.out.print("국어 : ");
        int korean = scanner.nextInt();

        System.out.print("영어 : ");
        int english = scanner.nextInt();

        System.out.print("수학 : ");
        int math = scanner.nextInt();

        int sum = (korean+english+math);
        double avg = (korean+english+math)/3.0;

        System.out.println("\n합계 : " + sum);
        System.out.println("평균 : " + avg);

        System.out.println((korean >= 40 && english >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격");

        scanner.close();
    }

    public void practice8() {
        System.out.println("주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요\n");

        System.out.print("주민번호를 입력하세요(- 포함) : ");
        String input = scanner.next();

        char genderNum = input.split("-")[1].charAt(0);

        System.out.println((genderNum == '1') ? "남자" : "여자");

        scanner.close();
    }

    public void practice9() {
        System.out.println("키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.\n" +
            "그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고\n" +
            "아니면 false를 출력하세요.\n" +
            "(단, 입력할 때 num1은 num2보다 작아야 함)\n");

        System.out.print("정수1 : ");
        int number1 = scanner.nextInt();

        System.out.print("정수2 : ");
        int number2 = scanner.nextInt();

        System.out.print("입력 : ");
        int input = scanner.nextInt();

        System.out.println((input >= number1 || input > number2) ? "true" : "false");

        scanner.close();
    }

    public void practice10() {
        System.out.println("3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.\n");

        System.out.print("입력1 : ");
        int input1 = scanner.nextInt();

        System.out.print("입력2 : ");
        int input2 = scanner.nextInt();

        System.out.print("입력3 : ");
        int input3 = scanner.nextInt();

        System.out.println((input1 == input2 && input2 == input3) ? "true" : "false");

        scanner.close();
    }

    public void practice11() {
        System.out.println("A, B, C 사원의 연봉을 입력 받고 각 사원의 인센티브를 포함한 연봉을 계산하여 출력하고\n" +
            "인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.\n" +
            "(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)\n");

        System.out.print("A사원의 연봉 : ");
        int a = scanner.nextInt();
        double aIncentive = a+a*0.4;

        System.out.print("B사원의 연봉 : ");
        int b = scanner.nextInt();
        double bIncentive = b;

        System.out.print("C사원의 연봉 : ");
        int c = scanner.nextInt();
        double cIncentive = c+c*0.15;


        System.out.println("\nA사원의 인센티브포함 연봉 : " + aIncentive);
        System.out.println((aIncentive >= 3000) ? "3000 이상" : "3000 미만");

        System.out.println("B사원의 인센티브포함 연봉 : " + bIncentive);
        System.out.println((bIncentive >= 3000) ? "3000 이상" : "3000 미만");

        System.out.println("C사원의 인센티브포함 연봉 : " + cIncentive);
        System.out.println((cIncentive >= 3000) ? "3000 이상" : "3000 미만");

        scanner.close();
    }
}
