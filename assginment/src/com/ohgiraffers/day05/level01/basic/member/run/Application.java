package com.ohgiraffers.day05.level01.basic.member.run;

import com.ohgiraffers.day05.level01.basic.member.model.dto.MemberDto;

public class Application {
    public static void main(String[] args) {
        MemberDto dto = new MemberDto();

        System.out.println("id : " + dto.getId());
        System.out.println("pwd : " + dto.getPwd());
        System.out.println("name : " + dto.getName());
        System.out.println("age : " + dto.getAge());
        System.out.println("gender : " + dto.getGender());
        System.out.println("phone : " + dto.getPhone());
        System.out.println("email : " + dto.getEmail());

        dto.setId("user01");
        dto.setPwd("pass01");
        dto.setName("홍길동");
        dto.setAge(20);
        dto.setGender('M');
        dto.setPhone("010-1234-5678");
        dto.setEmail("hong123@greedy.com");

        System.out.println("변경 후 id : " + dto.getId());
        System.out.println("변경 후 pwd : " + dto.getPwd());
        System.out.println("변경 후 name : " + dto.getName());
        System.out.println("변경 후 age : " + dto.getAge());
        System.out.println("변경 후 gender : " + dto.getGender());
        System.out.println("변경 후 phone : " + dto.getPhone());
        System.out.println("변경 후 email : " + dto.getEmail());
    }
}
