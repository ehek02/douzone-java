package com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice3.mdoel.dto;

public abstract class Animal {
    private String name;
    private String kinds;

    protected Animal() {

    }

    protected Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    public abstract void speak();

    @Override
    public String toString() {
        return "저의 이름은 " + name + "이고 종류는 " + kinds + "입니다.";
    }
}
