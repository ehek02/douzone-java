package com.ohgiraffers.day05.level02.normal.student.model.run;

import com.ohgiraffers.day05.level02.normal.student.model.dto.StudentDto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDto dto = new StudentDto();
        Scanner scanner = new Scanner(System.in);

        System.out.print("학년 : ");
        dto.setGrade(scanner.nextInt());

        System.out.print("반 : ");
        dto.setClassroom(scanner.nextInt());

        System.out.print("이름 : ");
        dto.setName(scanner.next());

        System.out.print("키 : ");
        dto.setHeight(scanner.nextDouble());

        System.out.print("성별 : ");
        dto.setGender(scanner.next().charAt(0));

        dto.printInformation();
    }
}
