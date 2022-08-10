package com.ohgiraffers.day08.view;

import com.ohgiraffers.day08.controller.BookManager;
import com.ohgiraffers.day08.domain.dto.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private final Scanner sc = new Scanner(System.in);
    private final BookManager bm = new BookManager();

    public BookMenu() {

    }

    public void mainMenu() {
        while (true) {
            System.out.print("*** 도서관리 프로그램 ***\n1. 새 도서 추가\n2. 도서 삭제\n3. 도서 검색 출력" +
                    "\n4. 전체 출력\n0. 끝내기\n메뉴 번호 선택 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    insertBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    selectList();
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("올바른 메뉴번호를 선택하세요.");
                    break;
            }

        }
    }

    public void insertBook() {
        System.out.print("도서 제목 : ");
        String title = sc.next();
        System.out.print("도서 장르(1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        System.out.print("도서 저자 : ");
        String author = sc.next();

        bm.insertBook(new Book(title, category, author));
    }

    public void deleteBook() {
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();

        int result = bm.deleteBook(bNo);

        switch (result) {
            case 1:
                System.out.println("성공적으로 삭제");
                break;
            case 0:
                System.out.println("삭제할 도서가 존재하지 않습니다.");
                break;
            default:
                System.out.println("알 수 없는 오류입니다.");
                break;
        }
    }

    public void searchBook() {
        System.out.print("도서 제목 : ");
        String title = sc.next();

        ArrayList<Book> searchList = bm.searchBook(title);

        if (searchList == null) {
            System.out.println("검색 결과가 존재하지 않습니다.");
            return;
        }

        for (Book book : searchList) {
            System.out.println(book.toString());
        }

    }

    public void selectList() {
        ArrayList<Book> bookList = bm.selectList();

        if (bookList == null) {
            System.out.println("도서 목록이 존재하지 않습니다.");
            return;
        }

        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

}
