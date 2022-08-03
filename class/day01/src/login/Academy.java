package login;

import java.util.Objects;
import java.util.Scanner;

public class Academy {
    static Scanner 스캐너 = new Scanner(System.in);
    static User[] user = new User[20];

    public static void main(String[] args) {
        유저초기화();

        while (true){
            int number = 입장();

            if (number == 1) {
                회원가입();
            }
            if (number == 2) {
                로그인();
            }
            if (number == 3) {
                break;
            }

            가입한유저정보확인();
        }

    }

    private static void 로그인() {

    }

    private static void 유저초기화() {
        for (int i = 0; i < user.length; i++) {
            user[i] = new User();
        }
    }

    private static void 회원가입() {
        System.out.print("아이디 >");
        String id = 스캐너.next();

        System.out.print("비밀번호 >");
        String pw = 스캐너.next();

        System.out.print("비밀번호 재입력 >");
        String pw2 = 스캐너.next();

        System.out.print("이름 >");
        String name = 스캐너.next();

        if (Objects.equals(pw, pw2)) {
            // 빈 배열에 유저 넣기
            for (int i = 0; i < user.length; i++) {
                if (user[i].name == null) {
                    user[i].id = id;
                    user[i].pw = pw;
                    user[i].name = name;
                    break;
                }
            }
        }
    }

    static int 입장() {
        System.out.println("원하시는 번호를 입력해주세요. 1. 회원가입 2.로그인 3. 종료");
        int number = 스캐너.nextInt();
        return number;
    }

    static void 가입한유저정보확인() {
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i].name);
        }
    }
}
