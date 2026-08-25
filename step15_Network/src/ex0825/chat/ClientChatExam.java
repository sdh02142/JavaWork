package ex0825.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientChatExam {
	public ClientChatExam() {
		try {
			Socket sk = new Socket("192.168.0.7", 8001);
			
			// sending Thread
			new SendThread(sk, "[Client]").start();
			
			// receiving Thread
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
						
						while (true) {
							String readData = br.readLine();
							
							if (readData.equals("exit")) break;
							
							System.out.println(readData);
						}
						System.err.println("[Client] : Receiving Thread Finished.");
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						System.exit(0);
					}
				}
			}).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ClientChatExam();
	}
}
