package ex0825.chat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 키보드 입력을 받아서 상대 측(Client or Server)에게 데이터 전송하는 Thread
 */
public class SendThread extends Thread {
	private Socket sk;
	private String name;

	public SendThread(Socket sk, String name) {
		this.sk = sk;
		this.name = name;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);

		try {
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true/* AutoFlush */);

			while (true) { /* 채팅이 이루어지는 동안 */
				String input = sc.nextLine();
				if (input.equals("exit")) {
					pw.println(input); // 이 method는 server와 client 둘 다 사용하는 상황이므로 어느 한 쪽에서 exit 입력 시, 동시에 상호작용으로
										// while문을 벗어나 프로그램이 종료되도록 작성한 로직
					break;
				}
				pw.println(name + " : " + input);
			}
			System.err.println(name + " : Thread Finished.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.err.println("Program Terminate.");
			System.exit(0);
		}
	}
}
