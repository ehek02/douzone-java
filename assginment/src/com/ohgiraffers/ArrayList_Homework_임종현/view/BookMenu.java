package com.ohgiraffers.ArrayList_Homework_임종현.view;

import com.ohgiraffers.ArrayList_Homework_임종현.controller.BookManager;
import com.ohgiraffers.ArrayList_Homework_임종현.model.dto.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void mainMenu() {
        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***\n1. 새 도서 추가\n2. 도서 삭제" +
                    "\n3. 도서 검색 출력\n4. 전체 출력\n0. 끝내기");
            System.out.print("메뉴 번호 선택 : ");
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
                    return;
                default:
                    System.out.println("올바른 메뉴번호를 입력하세요.");
                    break;
            }
        }
    }

    public void insertBook() {
        System.out.print("도서 제목 : ");
        String title = sc.next();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        System.out.print("도서 저자 : ");
        String author = sc.next();

        Book book = new Book(title, category, author);
        bm.insertBook(book);
    }

    public void deleteBook() {
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        int result = bm.deleteBook(bNo);

        if (result == 1) {
            System.out.println("성공적으로 삭제");
        } else if (result == 0) {
            System.out.println("삭제할 도서가 존재하지 않습니다.");
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
