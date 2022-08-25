package com.ohgiraffers.ArrayList_Homework_임종현.controller;

import com.ohgiraffers.ArrayList_Homework_임종현.model.dto.Book;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> bookList = new ArrayList<>();

    public BookManager() {

    }

    public void insertBook(Book book) {
        int lastNo;
        try {
            lastNo = bookList.get((bookList.size()) - 1).getbNo() + 1; // 마지막 도서 번호 +1
        } catch (IndexOutOfBoundsException e) {
            lastNo = 1;
        }
        book.setbNo(lastNo);
        bookList.add(book);
    }

    public int deleteBook(int bNo) {
        for (Book book : bookList) {
            if (book.getbNo() == bNo) {
                bookList.remove(bNo);
                return 1;
            }
        }
        return 0;
    }

    public ArrayList<Book> searchBook(String title) {
        ArrayList<Book> searchList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                searchList.add(book);
            }
        }
        return searchList;
    }

    public ArrayList<Book> selectList() {
        return bookList;
    }
}
