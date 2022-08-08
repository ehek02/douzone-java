package com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw1.run;


import com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw1.model.dto.Employee;
import com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw1.model.dto.Student;

import java.text.Format;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (Student student : students) {
            System.out.println(student.information());
        }

        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        int count = 0;

        while (true) {
            System.out.print("이름 입력 : ");
            String name = scanner.next();
            System.out.print("나이 입력 : ");
            int age = scanner.nextInt();
            System.out.print("신장 입력 : ");
            double height = scanner.nextDouble();
            System.out.print("몸무게 입력 : ");
            double weight = scanner.nextDouble();
            System.out.print("급여 입력 : ");
            int salary = scanner.nextInt();
            System.out.print("부서 입력 : ");
            String dept = scanner.next();

            employees[count] = new Employee(name, age, height, weight, salary, dept);

            System.out.print("계속 추가하시겠습니까?(y/n) : ");
            char replay = scanner.next().charAt(0);
            if (replay == 'n') {
                break;
            }

            count++;
        }

        for (Employee employee : employees) {
            System.out.println(employee.information());
        }
    }
}
