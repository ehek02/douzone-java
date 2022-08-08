package com.ohgiraffers.day06.ObjectArray_Homework_임종현.hw1.run;

import com.ohgiraffers.day06.ObjectArray_Homework_임종현.hw1.model.dto.Employee;

import java.text.Format;

public class Run {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee();
        employees[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        employees[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for (Employee employee : employees) {
            System.out.println("emp[" + employee.getEmpNo() + "] : " + employee.information());
        }
        System.out.println("============================================================================");

        employees[0].setEmpNo(0);
        employees[0].setEmpName("김말똥");
        employees[0].setDept("영업부");
        employees[0].setJob("팀장");
        employees[0].setAge(30);
        employees[0].setGender('M');
        employees[0].setSalary(3000000);
        employees[0].setBonusPoint(0.2);
        employees[0].setPhone("01055559999");
        employees[0].setAddress("전라도 광주");

        employees[1].setDept("기획부");
        employees[1].setJob("부장");
        employees[1].setSalary(4000000);
        employees[1].setBonusPoint(0.3);

        for (int i = 0; i < employees.length-1; i++) {
            System.out.println("emp[" + employees[i].getEmpNo() + "] : " + employees[i].information());
        }

        System.out.println("============================================================================");
        for (Employee employee : employees) {
            int bonus = (int) ((employee.getSalary() * employee.getBonusPoint()) * 12);
            int salary = employee.getSalary() * 12;
            System.out.println(employee.getEmpName() + "의 연봉 : " + (salary+bonus) + "원");
        }

        System.out.println("============================================================================");

        int bonus = 0;
        int salary = 0;
        for (Employee employee : employees) {
            bonus += (int) ((employee.getSalary() * employee.getBonusPoint()) * 12);
            salary += employee.getSalary() * 12;
        }
        int avg = (salary+bonus) / 3;
        System.out.println("직원들의 연봉의 평균 : " + avg+ "원");
    }
}
