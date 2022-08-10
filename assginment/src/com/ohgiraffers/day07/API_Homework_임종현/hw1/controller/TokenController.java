package com.ohgiraffers.day07.API_Homework_임종현.hw1.controller;

public class TokenController {
    public String afterToken(String str) {
        return str.replaceAll(" ", "");
    }

    public String firstCap(String input) {
        char[] arr = input.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }

    public int findChar(String input, char one) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == one) {
                count++;
            }
        }
        return count;
    }
}
