package com.ohgiraffers.day07.API_Homework_임종현.hw3.contoller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

import static java.util.Calendar.getInstance;

public class SetDate {
    public SetDate() {
    }

    public String todayPrint() {
        Calendar now = getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        return year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초 ";
    }

    public String setDay() {
        int year = 2011;
        int month = 3;
        int day = 21;

        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayOfMonth = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);

        return year + "년 " + month + "월 " + day + "일 " + dayOfMonth;
    }
}
