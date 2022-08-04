package array;

import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[5];
        double sum = 0;

        for (int i = 0; i < input.length; i++) {
            System.out.print(i+1 + "번째 학생 점수 입력 : ");
            input[i] = scanner.nextInt();
            sum += input[i];
        }

        double avg = sum / input.length;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
