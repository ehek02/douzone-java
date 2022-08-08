package com.ohgiraffers.day06.ObjectArray_Homework_임종현.hw2.run;

import com.ohgiraffers.day06.ObjectArray_Homework_임종현.hw2.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        int count = 0;

        while (true) {
            System.out.println(count+1 + "째 학생 등록입니다.");

            System.out.print("학년 입력 : ");
            int grade = scanner.nextInt();
            System.out.print("반 입력 : ");
            int classroom = scanner.nextInt();
            System.out.print("이름 입력 : ");
            String name = scanner.next();
            System.out.print("국어점수 입력 : ");
            int kor = scanner.nextInt();
            System.out.print("영어점수 입력 : ");
            int eng = scanner.nextInt();
            System.out.print("수학점수 입력 : ");
            int math = scanner.nextInt();

            students[count] = new Student(grade, classroom, name, kor, eng, math);
            System.out.println("============================");
            System.out.print("계속 추가하시겠습니까?(y/n) : ");
            char replay = scanner.next().charAt(0);
            if (replay == 'n') {
                break;
            }

            count++;
        }

        for (Student student : students) {
            System.out.println(student.information());
        }
    }
}
