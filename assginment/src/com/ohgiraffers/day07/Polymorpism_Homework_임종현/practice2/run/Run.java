package com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice2.run;

import com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice2.model.dto.GalaxyNote9;
import com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice2.model.dto.SmartPhone;
import com.ohgiraffers.day07.Polymorpism_Homework_임종현.practice2.model.dto.V40;

public class Run {
    public static void main(String[] args) {
        SmartPhone[] smartPhones = new SmartPhone[2];

        smartPhones[0] = new GalaxyNote9();
        smartPhones[1] = new V40();

        for (SmartPhone smartPhone : smartPhones) {
            smartPhone.printMaker();
            smartPhone.makeaCall();
            smartPhone.takeaCall();
            smartPhone.touch();
            smartPhone.charge();
            smartPhone.picture();
            System.out.println();
        }

    }
}
