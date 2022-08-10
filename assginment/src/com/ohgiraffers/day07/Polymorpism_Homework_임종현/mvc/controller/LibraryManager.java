package com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.controller;

import com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.model.dto.AniBook;
import com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.model.dto.Book;
import com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.model.dto.CookBook;
import com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.model.dto.Member;

public class LibraryManager {
    private Member member;
    private Book[] bookList = new Book[5];

    {
        bookList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bookList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bookList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bookList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bookList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member member) {
        this.member = member;
    }

    public Member myInfo() {
        return this.member;
    }

    public Book[] selectAll() {
        return this.bookList;
    }

    public Book[] searchBook(String keyword) {
        Book[] books = new Book[5];

        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (this.bookList[i].getTitle().contains(keyword)) {
                books[count] = bookList[i];
                count++;
            }
        }

        return books;
    }

    public int rentBook(int index) {
        int result = 0;

        // AniBook 나이제한 확인
        if (this.bookList[index] instanceof AniBook) {
            AniBook aniBook = (AniBook) this.bookList[index];
            if (this.member.getAge() < aniBook.getAccessAge()) {
                result = 1;
            }
        }

        // 요리책 쿠폰확인
        if (this.bookList[index] instanceof CookBook) {
            CookBook cookBook = (CookBook) this.bookList[index];
            if (cookBook.isCoupon()) {
                this.member.setCouponCount(this.member.getCouponCount() + 1);
                result = 2;
            }
        }

        return result;
    }
}
