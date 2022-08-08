package com.ohgiraffers.day06.ObjectArray_Homework_임종현.mvc.controller;

import com.ohgiraffers.day06.Inherit_Homework_임종현.com.hw1.model.dto.Student;
import com.ohgiraffers.day06.ObjectArray_Homework_임종현.mvc.model.dto.Member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MemberController {
    public static int SIZE = 10;
    private int memberCount;
    private Member[] members = new Member[SIZE];

    {
        members[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
        members[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
        members[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
        members[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
        members[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
        memberCount = 5;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public Member[] getMembers() {
        return members;
    }

    public Member checkId(String userid) {
        Member member;


        for (Member param : members) {
            if (param == null) {
                break;
            }

            if (param.getUserId().equals(userid)) {
                member = new Member(param.getUserId(), param.getUserPwd(), param.getName(), param.getAge(), param.getGender(), param.getEmail());
                return member;
            }
        }

        return null;
    }

    public void insertMember(Member member) {
        members[memberCount] = member;
        memberCount++;
    }

    public Member searchMember(int menu, String search) {
        Member searchMember = null;

        switch (menu) {
            case 1:
                for (Member member : members) {
                    if (member == null) {
                        break;
                    }

                    if (member.getUserId().equals(search)) {
                        searchMember = new Member(member.getUserId(), member.getUserPwd(), member.getName(), member.getAge(), member.getGender(), member.getEmail());
                    }
                }
                break;
            case 2:
                for (Member member : members) {
                    if (member == null) {
                        break;
                    }

                    if (member.getName().equals(search)) {
                        searchMember = new Member(member.getUserId(), member.getUserPwd(), member.getName(), member.getAge(), member.getGender(), member.getEmail());
                    }
                }
                break;
            case 3:
                for (Member member : members) {
                    if (member == null) {
                        break;
                    }

                    if (member.getEmail().equals(search)) {
                        searchMember = new Member(member.getUserId(), member.getUserPwd(), member.getName(), member.getAge(), member.getGender(), member.getEmail());
                    }
                }
                break;
        }

        return searchMember;
    }

    public void updateMember(Member member, int menu, String update) {
        switch (menu) {
            case 1:
                member.setUserPwd(update);
                for (int i = 0; i < members.length; i++) {
                    if (members[i] == null) {
                        break;
                    }
                    if (member.getUserId().equals(members[i].getUserId())) {
                        members[i] = member;
                    }
                }
                break;
            case 2:
                member.setName(update);
                for (int i = 0; i < members.length; i++) {
                    if (members[i] == null) {
                        break;
                    }
                    if (member.getUserId().equals(members[i].getUserId())) {
                        members[i] = member;
                    }
                }
                break;
            case 3:
                member.setEmail(update);
                for (int i = 0; i < members.length; i++) {
                    if (members[i] == null) {
                        break;
                    }
                    if (member.getUserId().equals(members[i].getUserId())) {
                        members[i] = member;
                    }
                }
                break;
        }
    }

    public void deleteMember(String userId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getUserId().equals(userId)) {
                members[i] = null; // 삭제

                // 땡기기
                for (int j = i; j < members.length-1; j++) {
                    members[j] = members[j+1];
                }

                memberCount--;
            }
        }
    }

    public Member[] sortIdAsc() {
        Member[] copy = members.clone();

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == null) {
                break;
            }

            for (int j = 0; j < i; j++) {
                if (copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
                    Member temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }

        return copy;
    }

    public Member[] sortIdDesc() {
        Member[] copy = members.clone();

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == null) {
                break;
            }

            for (int j = 0; j < i; j++) {
                if (copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
                    Member temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }

        return copy;
    }

    public Member[] sortAgeAsc() {
        Member[] copy = members.clone();

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == null) {
                break;
            }

            for (int j = 0; j < i; j++) {
                if (copy[i].getAge() < copy[j].getAge()) {
                    Member temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }

        return copy;
    }

    public Member[] sortAgeDesc() {
        Member[] copy = members.clone();

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == null) {
                break;
            }

            for (int j = 0; j < i; j++) {
                if (copy[i].getAge() > copy[j].getAge()) {
                    Member temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }

        return copy;
    }

    public Member[] sortGenderDesc() {
        Member[] copy = members.clone();

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == null) {
                break;
            }

            for (int j = 0; j < i; j++) {
                if (copy[i].getGender() > copy[j].getGender()) {
                    Member temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }

        return copy;
    }

}
