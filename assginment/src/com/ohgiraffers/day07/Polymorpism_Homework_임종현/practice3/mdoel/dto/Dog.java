package com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice3.mdoel.dto;

public class Dog extends Animal {
    public static final String PLACE = "애견카페";
    private int weight;

    public Dog() {

    }

    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    @Override
    public void speak() {
        System.out.println(super.toString() +
                "몸무게는 " + weight + "kg 입니다.");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
