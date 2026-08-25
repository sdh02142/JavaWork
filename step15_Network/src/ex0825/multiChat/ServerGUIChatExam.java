package ex0825.multiChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerGUIChatExam {
	List<ClientSocketThread> list = new ArrayList<>();
	Socket sk;
	
	public ServerGUIChatExam() {
		try (ServerSocket server = new ServerSocket(8002)) {
			while (true) {
				System.out.println("Client is waiting for access.");
				sk = server.accept();
				
				ClientSocketThread cst = new ClientSocketThread(); // 접속한 Client가 Thread로 들어오고, 생성자를 만나 pw, br 완성됨.
				cst.start();
				
				list.add(cst);
				
				System.out.println(sk.getInetAddress() + "'s access successful.");
				System.out.println("현재 접속 인원 : " + list.size() + "명");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // Constructor End
	
	/**
	 * 모든 Client에게 data 전송하는 method
	 * */
	public void sendMessage(String message) {
		for(ClientSocketThread cst : list) {
			cst.pw.println(message);
		}
	} // Inner method sendMessage() End
	
	/**
	 * 접속한 Client의 Socket을 Thread로 만들어서 관리
	 * */
	class ClientSocketThread extends Thread{
		PrintWriter pw;
		BufferedReader br;
		String nickName;
		int isduplicate = 0;
		
		ClientSocketThread () {
			try {
				pw = new PrintWriter(sk.getOutputStream(), true);
				br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			// Client로부터 받은 data를 읽어서 접속한 모든 Client들에게 전송함.
			try {
				nickName = br.readLine(); // nickName 대기
				
				// 중복 nickName 탐지
				
				for(ClientSocketThread cst1 : list) {
					if(cst1.nickName.equals(nickName)) {
						isduplicate++;
						if(isduplicate >= 2) {
							throw new DoubleException();
						}
					}
				}
				
				// nickName을 접속한 모든 Client에게 전송.
				sendMessage("[ " + nickName + " ] 입장");
				
				while (true) {
					String inputData = br.readLine();
					sendMessage("[ " + nickName + " ] : " + inputData);
				}
			} catch (DoubleException e) {
				this.pw.println("ExIt");
				list.remove(this);
				
				// console 출력
				System.err.println(sk.getInetAddress() + "'s access denied : " + nickName + " <- nickName duplicated");
				System.out.println("현재 인원 : " + list.size() +"명");
			} catch (Exception e) {
				//e.printStackTrace();
				// 현재 Thread에서 오류가 발생했으므로 해당 Thread를 list에서 제거 및 다른 접속 중인 Thread들에게 퇴장 알림.
				list.remove(this);
				
				// 남은 Client들에게 퇴장 알림.
				sendMessage("[ " + nickName + " ] 퇴장");
				
				// console 출력
				System.out.println("[ " + nickName + " ] 퇴장 => 현재 인원 : " + list.size() +"명");
			}
		}
	} // Inner class ClientSocketThread End
	
	public static void main(String[] args) {
		new ServerGUIChatExam();
	}

}
