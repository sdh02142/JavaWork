package ex0824;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIThreadExam extends JFrame {

	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);

	JButton btn1 = new JButton("click");
	boolean b = true;

	public GUIThreadExam() {
		super("title");

		// JFrame의 레이아웃(배치도) 변경
		super.setLayout(new FlowLayout());

		// component를 JFrame 위에 올리기
		Container con = super.getContentPane();

		con.add(btn1);
		con.add(text1);
		con.add(text2);

		// 창 보이기
		super.setVisible(true);

		// 창 크기 설정
		super.setSize(500, 400);
		super.setLocationRelativeTo(null);

		// x 버튼 클릭 시, 프로그램 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 스레드 시작
		new GetTimeThread().start(); // title 시계 표출
		
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//			}
//		}).start(); // 1 ~ 1000
		
		new Thread(() ->{
			for(int i = 0; i<=1000; i++) {
				text1.setText(i+"");
				try {
					Thread.sleep((int)(Math.random()*100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
//		btn1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		
		btn1.addActionListener((e)->{
			System.out.println(b);
			if(b) {
				b = false;
				new Thread(() ->{
					for(char c = 'A'; c<='z'; c++) {
						text2.setText(c+"");
						try {
							Thread.sleep((int)(Math.random()*100));
						} catch (InterruptedException err) {
							err.printStackTrace();
						}
					}
					b = true;
				}).start();
			}
		});
	}

	public static void main(String[] args) {
		new GUIThreadExam();
	}

	// 현재 시간을 구해서 JFrame title에 1초마다 시간 갱신하는 스레드
	class GetTimeThread extends Thread {

		@Override
		public void run() {
			while (true) {
				Calendar now = Calendar.getInstance();

				int y = now.get(Calendar.YEAR);
				int m = now.get(Calendar.MONTH) + 1;
				int d = now.get(Calendar.DATE);

				int h = now.get(Calendar.HOUR);
				int min = now.get(Calendar.MINUTE);
				int s = now.get(Calendar.SECOND);

				StringBuilder sb = new StringBuilder();
				sb.append(y);
				sb.append("-");

				sb.append(m);
				sb.append("-");

				sb.append(d);
				sb.append(" ");

				sb.append(h);
				sb.append(":");

				sb.append(min);
				sb.append(":");

				sb.append(s);

				// JFrame의 title에 시계 넣기(Inner class에서 Outer class 접근)
				GUIThreadExam.this.setTitle(sb.toString());
				try {
					Thread.sleep(1000); // 1초 일시정지
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
/**
 * class A{
 * 		new B(this).test();
 * 
 * 		public void test2() {};
 * }
 * 
 * class B{
 * 		A a;
 * 
 * 		public B(A a){
 * 			this a = a;
 * 		}
 * 
 * 		public void test(){
 * 			a.test2();
 * 		}
 * }
 * */