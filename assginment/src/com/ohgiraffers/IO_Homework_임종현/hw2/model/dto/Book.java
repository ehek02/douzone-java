package com.ohgiraffers.IO_Homework_임종현.hw2.model.dto;

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Serializable {
    private String title;
    private String author;
    private int price;
    private Calendar dates;
    private double discountRate;

    public Book() {
    }

    public Book(String title, String author, int price, Calendar dates, double discountRate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.dates = dates;
        this.discountRate = discountRate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Calendar getDates() {
        return dates;
    }

    public void setDates(Calendar dates) {
        this.dates = dates;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return title + " " +
                author + " " +
                price + " " +
                dates.get(Calendar.YEAR) + "년 " + dates.get(Calendar.MONTH) + "월 " + dates.get(Calendar.DAY_OF_MONTH) + "일 출간 " +
                discountRate;
    }
}
