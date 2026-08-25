package ex0825.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatExam {
	ServerSocket server;

	public ServerChatExam() {
		try {
			server = new ServerSocket(8001);

			System.out.println("wait for client's access.");
			Socket sk = server.accept();

			System.out.println(sk.getInetAddress() + "'s access successful.");

			// sending Thread
			new SendThread(sk, "[Server]").start();
			
			// receiving Thread
			new Thread(/*Thread의 매개변수 자료형인 Runnable [interface] 내에는 run() method 밖에 없으므로 람다 사용 가능*/()->{
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
					
					while (true) {
						String readData = br.readLine();
						
						if (readData.equals("exit")) break;
						
						System.out.println(readData);
					}
					System.err.println("[Server] : Receiving Thread Finished.");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					System.exit(0);
				}
			}).start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ServerChatExam();
	}
}
