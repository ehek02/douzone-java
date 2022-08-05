package com.ohgiraffers.day05.level04.advaced.shape.model.dto;

public class ShapeDto {
    private int type;
    private double height;
    private double width;
    private String color;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ShapeDto(int type, double width, double height) {
        this.type = type;
        this.height = height;
        this.width = width;
        this.color = "white";
    }
}
