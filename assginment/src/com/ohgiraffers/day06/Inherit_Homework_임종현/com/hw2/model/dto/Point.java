package com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw2.model.dto;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.printf("(x, y) : (%d, %d)%n", x, y);
    }
}
