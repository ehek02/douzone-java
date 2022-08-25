package com.ohgiraffers.exception_homework_임종현.hw1.model.dto;

public class Guests {
    private String name;
    private int age;
    private char gender;
    private double height;

    public Guests() {
    }

    public Guests(String name, int age, char gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "이름 : " + name +
                ", 키 : " + height;
    }
}
