package com.ohgiraffers.day05.level04.advaced.shape.manager;

import com.ohgiraffers.day05.level04.advaced.shape.model.dto.ShapeDto;

public class TriangleManager {
    public void calcPerimeter(ShapeDto shape) {
        System.out.println("삼각형의 둘레는 " +
                (double)Math.round(
                        (shape.getWidth() +
                        shape.getHeight() +
                        Math.sqrt(Math.pow(shape.getWidth(), 2) + Math.pow(shape.getHeight(), 2)))*100
                )/100 + "입니다.\n=======================");
    }

    public void calcArea(ShapeDto shape) {
        System.out.println("삼각형의 넓이는 " + (shape.getWidth()*shape.getHeight())/2 + "입니다.\n=======================");
    }

    public void printShape(ShapeDto shape) {
        System.out.println("도형 타입 : 삼각형");
        System.out.println("높이 : " + shape.getHeight());
        System.out.println("너비 : " + shape.getWidth());
        System.out.println("색상 : " + shape.getColor());
        System.out.println("=======================");
    }

    public void paintColor(ShapeDto shape, String color) {
        shape.setColor(color);
    }
}
