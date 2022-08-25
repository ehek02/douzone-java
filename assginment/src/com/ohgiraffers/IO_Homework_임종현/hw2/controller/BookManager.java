package com.ohgiraffers.IO_Homework_임종현.hw2.controller;

import com.ohgiraffers.IO_Homework_임종현.hw2.model.dto.Book;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

public class BookManager {
    protected Scanner sc = new Scanner(System.in);

    public BookManager() {
    }

    public void fileSave() {
        String filename = "books.dat";
        String filePath = "/Users/jonghyun/Desktop/git/ehek02/project/douzone-java/assginment/src/com/ohgiraffers/IO_Homework_임종현_/hw2/files/" +
                filename;
        Book[] bk = new Book[5];

        bk[0] = new Book("C언어", "김씨", 10000, this.setCalendar(2012, 2, 2), 0.1);
        bk[1] = new Book("자바", "이씨", 20000, this.setCalendar(2013, 3, 3), 0.2);
        bk[2] = new Book("C++", "박씨", 30000, this.setCalendar(2014, 4, 4), 0.3);
        bk[3] = new Book("넛지", "서씨", 40000, this.setCalendar(2015, 5, 5), 0.4);
        bk[4] = new Book("개미", "최씨", 50000, this.setCalendar(2016, 6, 6), 0.5);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(bk);
            System.out.println("파일 저장 완료 !");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Calendar setCalendar(int year, int month, int date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, date);
        return calendar;
    }

    public void fileRead() {
        Book[] readBook = new Book[10];
        String filename = "books.dat";
        String filePath = "/Users/jonghyun/Desktop/git/ehek02/project/douzone-java/assginment/src/com/ohgiraffers/IO_Homework_임종현_/hw2/files/" +
                filename;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj;
            while (true) {
                obj = ois.readObject();
                Book[] bk = (Book[]) obj;
                for (Book book : bk) {
                    System.out.println(book.toString());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다");
        } catch (EOFException e) {
            System.out.println("books.dat 읽기 완료!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("class를 찾을 수 없습니다.");
        }
    }

}
