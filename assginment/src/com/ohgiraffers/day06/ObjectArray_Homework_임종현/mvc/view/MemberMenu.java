package com.ohgiraffers.day06.ObjectArray_Homework_임종현.mvc.view;

import com.ohgiraffers.day06.ObjectArray_Homework_임종현.mvc.controller.MemberController;
import com.ohgiraffers.day06.ObjectArray_Homework_임종현.mvc.model.dto.Member;

import java.util.Scanner;

public class MemberMenu {
    private MemberController mc = new MemberController();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        while (true) {
            System.out.print("===== 회원 관라 메뉴 =====\n1. 신규 회원 등록\n2. 회원 정보 검색\n3. 회원 정보 수정\n" +
                    "4. 회원 정보 삭제\n5. 회원 정보 출력\n6. 회원 정보 정렬\n9. 프로그램 종료\n입력 >");
            int index = sc.nextInt();

            switch (index) {
                case 1:
                    insertMember();
                    break;
                case 2:
                    searchMember();
                    break;
                case 3:
                    updateMember();
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                     printAllMember();
                    break;
                case 6:
                    sortMember();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("올바른 숫자 입력요망");
                    break;
            }
        }
    }

    public void insertMember() {
        if (mc.getMemberCount() > MemberController.SIZE) {
            return;
        }

        System.out.print("아이디 입력 : ");
        String userId = sc.next();

        Member member = mc.checkId(userId);

        // 중복일 때,
        if (member != null) {
            System.out.println("동일한 아이디 존재합니다. 회원가입 실패");
        } else {
            System.out.print("비밀번호 입력 : ");
            String pwd = sc.next();
            System.out.print("이름 입력 : ");
            String name = sc.next();
            System.out.print("나이 입력 : ");
            int age = sc.nextInt();
            System.out.print("성별 입력 : ");
            char gender = sc.next().charAt(0);
            System.out.print("이메일 입력 : ");
            String email = sc.next();

            member = new Member(userId, pwd, name, age, gender, email);
            mc.insertMember(member);

            System.out.println("성공적으로 회원등록이 되었습니다.");
        }
    }

    public void searchMember() {
        while (true) {
            System.out.println("===== 회원 정보 검색 =====\n1. 아이디로 검색하기\n2. 이름으로 검색하기\n3. 이메일로 검색하기\n9. 이전 메뉴로");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            if (menu == 9) {
                break;
            }

            System.out.print("검색 내용 : ");
            String search = sc.next();

            Member member = mc.searchMember(menu, search);

            if (member == null) {
                System.out.println("회원정보가 존재하지 않습니다.");
            } else {
                member.information();
            }

        }
    }

    public void updateMember() {
        while (true) {
            System.out.println("===== 회원 정보 수정 =====\n1. 비밀번호 수정\n2. 이름 수정\n3. 이메일 수정\n9. 이전 메뉴로");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            if (menu == 9) {
                break;
            }

            System.out.print("변경할 회원 아이디 : ");
            String modifyId = sc.next();

            Member member = mc.checkId(modifyId);
            if (member == null) {
                System.out.println("변경할 회원이 존재하지 않습니다.");
            } else {
                System.out.print("변경내용 입력 : ");
                String update = sc.next();

                mc.updateMember(member,menu, update);

                System.out.println("회원정보가 변경되었습니다.");
            }

        }
    }

    public void deleteMember() {
        System.out.print("삭제할 회원 아이디 : ");
        String userId = sc.next();

        Member member = mc.checkId(userId);

        if (member == null) {
            System.out.println("삭제할 회원이 존재하지 않습니다.");
        } else {
            System.out.print("정말 삭제하시겠습니까? (y/n) : ");
            char yn = sc.next().charAt(0);
            if (yn == 'y' || yn == 'Y') {
                mc.deleteMember(userId);
                System.out.println("회원정보가 삭제되었습니다.");
            }
        }
    }

    public void printAllMember() {
        Member[] members = mc.getMembers();

        for (Member member : members) {
            if (member == null) {
                break;
            }

            System.out.println(member.information());
        }
    }

    public void sortMember() {
        Member[] sortMembers = null;

        while (true) {
            System.out.println("===== 회원 정보 정렬 =====\n1. 아이디 오름차순 정렬\n2. 아이디 오름차순 정렬\n3. 나이 오름차순 정렬" +
                    "\n4. 나이 내림차순 정렬\n5. 성별 내림차순 정렬(남여순)\n9. 이전 메뉴로");

            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    sortMembers = mc.sortIdAsc();
                    break;
                case 2:
                    sortMembers = mc.sortIdDesc();
                    break;
                case 3:
                    sortMembers = mc.sortAgeAsc();
                    break;
                case 4:
                    sortMembers = mc.sortAgeDesc();
                    break;
                case 5:
                    sortMembers = mc.sortGenderDesc();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("올바른 번호를 입력해주세요.");
                    break;
            }

            if (sortMembers == null) {
                System.out.println("멤버가 존재하지 않습니다.");
                return;
            }

            for (Member member : sortMembers) {
                if (member == null) {
                    break;
                }
                System.out.println(member.information());
            }
        }
    }

}
