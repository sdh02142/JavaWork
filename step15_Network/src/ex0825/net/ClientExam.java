package ex0825.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {
	public ClientExam() {
		try (Socket sk = new Socket("192.168.0.20", 8000);) {
			// data transmission to server
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			pw.println("Try to access Server");

			// Server's data reading (Using BufferedReader -> fast)
			BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			String serverData = br.readLine();
			System.out.println("data from Server : " + serverData);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ClientExam();
	}

}
