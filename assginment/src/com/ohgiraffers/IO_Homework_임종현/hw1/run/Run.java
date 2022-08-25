package com.ohgiraffers.IO_Homework_임종현.hw1.run;


import com.ohgiraffers.IO_Homework_임종현.hw1.model.dao.FileDao;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileDao fd = new FileDao();

        while (true) {
            System.out.print("****** MyNote ******\n1. 노트 새로 만들기\n2. 노트 열기" +
                    "\n3. 노트 열어서 수정하기\n4. 끝내기\n번호를 입력하세요 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    fd.fileSave();
                    break;
                case 2:
                    fd.fileOpen();
                    break;
                case 3:
                    fd.fileEdit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("올바른 메뉴번호를 입력하세요");
                    break;
            }

        }
    }
}
