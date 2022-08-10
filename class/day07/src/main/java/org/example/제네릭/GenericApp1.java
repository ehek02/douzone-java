package org.example.제네릭;

import org.example.제네릭.domain.GenericTest;

public class GenericApp1 {
    public static void main(String[] args) {
        GenericTest genericTest = new GenericTest();
        genericTest.setValue(1);
        genericTest.setValue("val");

        GenericTest<Integer> genericTest1 = new GenericTest<>();
        genericTest1.setValue(10);
        System.out.println(genericTest1.getValue());
        System.out.println(genericTest1.getValue() instanceof Integer);

        
    }
}
