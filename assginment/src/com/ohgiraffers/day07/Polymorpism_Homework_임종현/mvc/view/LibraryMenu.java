package com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.view;

import com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.controller.LibraryManager;
import com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.model.dto.Book;
import com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    private Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름 입력 : ");
        String name = scanner.next();
        System.out.print("나이 입력 : ");
        int age = scanner.nextInt();
        System.out.print("성별 입력 : ");
        char gender = scanner.next().charAt(0);

        lm.insertMember(new Member(name, age, gender));

        while (true) {
            System.out.println("===== 메뉴 =====\n1. 마이페이지\n2. 도서 전체 조회" +
                    "\n3. 도서 검색\n4. 도서 대여하기\n0. 프로그램 종료하기");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    Member member = lm.myInfo();
                    System.out.println(member.toString());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바른 메뉴번호를 입력해주세요.");
                    break;
            }
        }
    }

    public void selectAll() {
        Book[] books = lm.selectAll();
        for (int i = 0; i < books.length; i++) {
            System.out.println(i + "번 도서 : " + books[i].toString());
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = scanner.next();

        Book[] books = lm.searchBook(keyword);

        for (Book book : books) {
            if (book == null) {
                break;
            }
            System.out.println(book);
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int num = scanner.nextInt();
        int result = lm.rentBook(num);

        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요");
                break;
            default:
                System.out.println("알 수 없는 오류입니다.");
                break;
        }
    }
}
