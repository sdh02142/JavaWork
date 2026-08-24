package ex0824;

import java.util.Random;

public class ThreadExam {

	public static void main(String[] args) {
		System.out.println("===== main start =====");
		Thread th1 = new NumberThread("th1");
		Thread th2 = new NumberThread("th2");
		AlphaThread th3 = new AlphaThread();
		
//		th1.run();
//		th2.run();
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("===== main end =====");
	}

}

class NumberThread extends Thread{
	int sum;
	
	public NumberThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		Random r = new Random();
		for(int i = 0; i <= 100; i++) {
			System.out.println(super.getName() + " ==> " + i);
			sum += i;
			
			int no = r.nextInt(100); // 0 ~ 99
			
			try {
				Thread.sleep(no); // no 초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(super.getName() + " End");
	}
}

class AlphaThread extends Thread{
	@Override
	public void run() {
//		Random r = new Random();
		Thread th = Thread.currentThread();
		for(char c = 'A'; c <= 'z'; c++) {
			System.out.println(th.getName() + " ==> " + c);

			
//			int no = r.nextInt(100); // 0 ~ 99
//			
//			try {
//				Thread.sleep(no); // no 초 대기
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			th.yield();
		}
		System.out.println(th.getName() + " End");
	}
}