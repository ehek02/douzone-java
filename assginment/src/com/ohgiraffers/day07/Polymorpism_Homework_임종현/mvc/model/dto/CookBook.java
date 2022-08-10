package com.ohgiraffers.day07.Polymorpism_Homework_임종현.mvc.model.dto;

public class CookBook extends Book {
    private boolean coupon;

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CookBook{" +
                "coupon=" + coupon +
                '}';
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
}
