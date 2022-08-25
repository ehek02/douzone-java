package org.example.network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    int port = 8500;
    String serverIp = "192.168.0.176";

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    @Override
    public void run() {
        try (Scanner sc = new Scanner(System.in);
             Socket socket = new Socket(serverIp, port);
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
