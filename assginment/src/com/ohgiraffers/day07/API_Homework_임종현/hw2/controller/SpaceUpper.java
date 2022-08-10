package com.ohgiraffers.day07.API_Homework_임종현.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
    public SpaceUpper() {
    }

    public void spaceToUpper() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("영어를 입력하시오(띄어쓰기 포함) : ");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            char[] arr = tokenizer.nextToken().toCharArray();
            arr[0] = Character.toUpperCase(arr[0]);
            sb.append(arr);
            sb.append(" ");
        }

        System.out.println(sb);
        scanner.close();
    }
}
