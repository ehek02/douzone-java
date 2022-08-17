package org.example.network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    /*
     *  클라이언트용 TCP 소켓 프로그래밍 순서
     *
     *  1) 서버의 IP 주소와 서버가 정한 포트 번호를 매개변수로 하여 클라언트용 소켓 객체 생성
     *  2) 서버와의 입출력 스트림 오픈
     *  3) 보조 스트림을 통해 성능 개선
     *  4) 스트림을 통해 읽고 쓰기
     *  5) 통신 종료
     */
    int port = 8500;
    String serverIp = "127.0.0.1";

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try (Socket socket = new Socket(serverIp, port);
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
            System.out.println(socket.getInetAddress() + "에 연결됨.");

            do {
                System.out.print("대화 입력(exit 입력시 종료) : ");
                String msg = sc.next();
                if (msg.equals("exit")) break;

                // send
                pw.println(msg);
                pw.flush();

                // receive
                System.out.println(br.readLine());
            } while (true);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
