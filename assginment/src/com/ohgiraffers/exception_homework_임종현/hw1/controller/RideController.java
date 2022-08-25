package com.ohgiraffers.exception_homework_임종현.hw1.controller;

import com.ohgiraffers.exception_homework_임종현.hw1.model.dto.Guests;
import com.ohgiraffers.exception_homework_임종현.hw1.model.dto.RollerCoaster;

public class RideController {
    protected Guests[] gs = new Guests[4];
    protected Guests[] onboard = new Guests[RollerCoaster.PERMINUMBER];;

    public RideController() {
    }

    public void cutGuests() {
        int count = 0;

        gs[0] = new Guests("홍길동", 17, 'M', 120.2);
        gs[1] = new Guests("유관순", 20, 'F', 102.3);
        gs[2] = new Guests("김유신", 23, 'M', 110.4);
        gs[3] = new Guests("김흥부", 21, 'M', 112.5);

        try {
            for (Guests param : gs) {
                if (param.getHeight() > RollerCoaster.CUTHEIGHT) {
                    onboard[count] = param;
                    count++;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("문제가 발생한 해당 배열의 인덱스 번호 : " + e.getMessage());
        } finally {
            System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요.");
            System.out.println("이번 차례 탑승 명단");
            for (Guests param : onboard) {
                System.out.println(param.toString());
            }

            System.out.println("탑승자 요금 : " + (RollerCoaster.PRICE)*(onboard.length));
        }
    }
}
