package com.ohgiraffers.day08.controller;

import com.ohgiraffers.day08.domain.dto.Book;

import java.util.ArrayList;

public class BookManager {
    private final ArrayList<Book> bookList = new ArrayList<>();

    public BookManager() {
    }

    public void insertBook(Book book) {
        book.setbNo(bookList.size());
        bookList.add(book);
    }

    public int deleteBook(int bNo) {
        for (Book book : bookList) {
            if (book.getbNo() == bNo) {
                bookList.remove(book);
                return 1;
            }
        }
        return 0;
    }

    public ArrayList<Book> searchBook(String title) {
        ArrayList<Book> searchList = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getTitle().contains(title)) {
                searchList.add(book);
            }
        }

        return searchList;
    }

    public ArrayList<Book> selectList() {
        return bookList;
    }
}
