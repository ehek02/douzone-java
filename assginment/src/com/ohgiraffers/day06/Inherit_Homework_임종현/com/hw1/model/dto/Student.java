package com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw1.model.dto;

public class Student extends Person{
    private int grade;
    private String major;

    public Student() {
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String information() {
        return super.information() +
                ", " + this.grade +
                ", " + this.major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
