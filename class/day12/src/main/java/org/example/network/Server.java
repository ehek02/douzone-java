package org.example.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    Socket socket;

    public Server(Socket connection) {
        this.socket = connection;
    }

    @Override
    public void run() {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter pw = new PrintWriter(socket.getOutputStream())) {

            // receive
            System.out.println(br.readLine());

            // send
            pw.println("수신되었다. 오버");
            pw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8500)) {
            while (true) {
                System.out.println("연결 대기중 ...");
                Socket connection = serverSocket.accept();

                String connIp = connection.getInetAddress().getHostAddress();
                System.out.println(connIp + "에서 연결 시도.");

                Thread task = new Server(connection);
                task.start();
                System.out.println(connIp + "와 통신 시작");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
