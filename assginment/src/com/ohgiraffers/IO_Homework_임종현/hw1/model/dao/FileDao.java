package com.ohgiraffers.IO_Homework_임종현.hw1.model.dao;

import java.io.*;
import java.util.Scanner;

public class FileDao {
    protected Scanner sc = new Scanner(System.in);

    public FileDao() {
    }

    public void fileSave() {
        StringBuilder sb = new StringBuilder();

        while (true) {
            System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
            String input = sc.next();

            if (input.equals("exit")) {
                System.out.println("저장하시겠습니까? (y/n)");
                char yn = sc.next().charAt(0);
                if (yn == 'y' || yn == 'Y') {
                    System.out.print("저장할 파일명을 입력해주세요 : ");
                    String filename = sc.next();
                    String filePath = "/Users/jonghyun/Desktop/git/ehek02/project/douzone-java/assginment/src/com/ohgiraffers/IO_Homework_임종현_hw1/files/" +
                            filename + ".txt";
                    try  {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
                        bw.write(sb.toString());
                        bw.flush();
                        bw.close();

                        System.out.println(filename + ".txt 파일에 성공적으로 저장하였습니다.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                System.out.println("다시 메뉴로 돌아갑니다");
                break;
            }

            sb.append(input);
            sb.append("\n");
        }
    }

    public void fileOpen() {
        System.out.print("열기 할 파일명 : ");
        String openFilename = sc.next();
        String filePath = "/Users/jonghyun/Desktop/git/ehek02/project/douzone-java/assginment/src/com/ohgiraffers/IO_Homework_임종현_hw1/files/" +
                openFilename + ".txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("존재하는 파일이 없습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileEdit() {
        System.out.print("수정 할 파일 명 : ");
        String editFilename = sc.next();
        String filePath = "/Users/jonghyun/Desktop/git/ehek02/project/douzone-java/assginment/src/com/ohgiraffers/IO_Homework_임종현_hw1/files/" +
                editFilename + ".txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            StringBuilder sb = new StringBuilder();

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }


            while (true) {
                System.out.print("파일에 추가할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
                String input = sc.next();
                if (input.equals("exit")) {
                    System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
                    char yn = sc.next().charAt(0);
                    if (yn == 'y' || yn == 'Y') {
                        bw.write(sb.toString());
                        bw.flush();
                        System.out.println("입력받은 " + editFilename + ".txt 파일의 내용이 변경되었습니다.");
                    }
                    break;
                }

                sb.append(input);
                sb.append("\n");
            }


            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
