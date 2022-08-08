package com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw2.model.dto;

public class Circle extends Point {
    private int radius;

    public Circle() {

    }

    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("===== circle =====");
        super.draw();
        System.out.printf("면적 : %.1f%n", (Math.PI*radius*radius));
        System.out.printf("둘레 : %.1f%n", (Math.PI*radius*2));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
