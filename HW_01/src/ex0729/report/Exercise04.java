package ex0729.report;

/**
 * @author 주우진
 * 날짜 : 2026-07-29
 * 주제 : chapter 03 04번
 * */

public class Exercise04 {

	public static void main(String[] args) {
		boolean a = true;
		while (a) {
			int b = (int)(Math.random()*6+1);
			int c = (int)(Math.random()*6+1);
			
			System.out.println("(" + b + ", " + c + ")");
			
			if(b + c == 5) {
				a = false;
			}
		}
	}

}
