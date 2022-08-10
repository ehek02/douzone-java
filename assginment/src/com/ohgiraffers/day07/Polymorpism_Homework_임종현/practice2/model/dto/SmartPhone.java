package com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice2.model.dto;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
    public SmartPhone() {
    }
    public abstract void printMaker();
}
