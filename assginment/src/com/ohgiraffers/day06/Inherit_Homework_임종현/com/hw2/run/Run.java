package com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw2.run;

import com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw2.model.dto.Circle;
import com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw2.model.dto.Rectangle;

public class Run {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        Rectangle[] rectangles = new Rectangle[2];

        circles[0] = new Circle(1, 2, 3);
        circles[1] = new Circle(3, 3, 4);

        rectangles[0] = new Rectangle(-1, -2, 5, 2);
        rectangles[1] = new Rectangle(-2, 5, 2, 8);

        for (Circle circle : circles) {
            circle.draw();
        }

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
    }
}
