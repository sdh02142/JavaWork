package ex0825.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
	public ServerExam() {
		try (ServerSocket server = new ServerSocket(8000)) /* AutoCloseable */ {
			while (true) {
				// 대기 상태
				System.out.println("wait for access");
				Socket sk = server.accept(); // Client 접속 대기 - 접속되면 수락되어 Socket 반환

				// 접속된 Client IP 조회
				String ip = sk.getInetAddress().toString();
				System.out.println(ip + "'s access successful");

				// Client's data reading (Using BufferedReader -> fast)
				BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				String clientData = br.readLine();
				System.out.println("data from Client : " + clientData);

				// data transmission to client
				PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
				pw.println("Welcome to Java Server");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ServerExam();
	}
}
