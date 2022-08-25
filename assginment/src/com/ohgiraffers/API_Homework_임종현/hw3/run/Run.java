package com.ohgiraffers.API_Homework_임종현.hw3.run;

import com.ohgiraffers.API_Homework_임종현.hw3.contoller.SetDate;

public class Run {
    public static void main(String[] args) {
        SetDate tw1 = new SetDate();
        System.out.println(tw1.todayPrint());
        System.out.println(tw1.setDay());
    }
}
