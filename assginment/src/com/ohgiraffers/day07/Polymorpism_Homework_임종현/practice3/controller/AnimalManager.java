package com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice3.controller;

import com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice3.mdoel.dto.Animal;
import com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice3.mdoel.dto.Cat;
import com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice3.mdoel.dto.Dog;

public class AnimalManager {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("뽀삐", "포메라니안", 5);
        animals[1] = new Cat("뭉치", "러시안블루", "친구집", "black");
        animals[2] = new Dog("뽀삐", "포메라니안", 5);
        animals[3] = new Cat("뭉치", "러시안블루", "친구집", "black");
        animals[4] = new Dog("뽀삐", "포메라니안", 5);

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
