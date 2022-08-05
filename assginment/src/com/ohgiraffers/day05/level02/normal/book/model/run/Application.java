package com.ohgiraffers.day05.level02.normal.book.model.run;

import com.ohgiraffers.day05.level02.normal.book.model.dto.BookDto;

public class Application {
    public static void main(String[] args) {
        BookDto dto1 = new BookDto();
        BookDto dto2 = new BookDto("자바의 정석", "도우출판", "남궁성");
        BookDto dto3 = new BookDto("홍길동전", "활빈당", "허균", 500000, 0.5);

        dto1.printInformation();
        dto2.printInformation();
        dto3.printInformation();
    }
}
