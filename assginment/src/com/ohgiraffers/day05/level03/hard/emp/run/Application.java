package com.ohgiraffers.day05.level03.hard.emp.run;

import com.ohgiraffers.day05.level03.hard.emp.model.dto.EmployeeDto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDto dto = new EmployeeDto();
        Scanner scanner = new Scanner(System.in);

        System.out.print("번호 : ");
        dto.setNumber(scanner.nextInt());

        System.out.print("이름 : ");
        dto.setName(scanner.next());

        System.out.print("부서 : ");
        dto.setDept(scanner.next());

        System.out.print("직책 : ");
        dto.setJob(scanner.next());

        System.out.print("나이 : ");
        dto.setAge(scanner.nextInt());

        System.out.print("성별 : ");
        dto.setGender(scanner.next().charAt(0));

        System.out.print("월급 : ");
        dto.setSalary(scanner.nextInt());

        System.out.print("보너스포인트 : ");
        dto.setBonusPoint(scanner.nextDouble());

        System.out.print("휴대폰 : ");
        dto.setPhone(scanner.next());
        System.out.print("주소 : ");
        scanner.nextLine();
        dto.setAddress(scanner.nextLine());

        System.out.println(dto.getNumber());
        System.out.println(dto.getName());
        System.out.println(dto.getDept());
        System.out.println(dto.getJob());
        System.out.println(dto.getAge());
        System.out.println(dto.getGender());
        System.out.println(dto.getSalary());
        System.out.println(dto.getBonusPoint());
        System.out.println(dto.getPhone());
        System.out.println(dto.getAddress());
    }
}
