package ex0729.제어문;

public class SwitchExam02 {
	public static void main(String[] args) {
		int i = (int)(Math.random()*12 + 1);
		System.out.println(i);
		
//		switch (i) {
//		case 4, 6, 9, 11:
//			System.out.println(30);
//		    break;
//		case 2:
//			System.out.println(28);
//			break;
//		default : System.out.println(31);
//		}
		
//		int endDay = switch (i) {
//		case 4, 6, 9, 11 -> { yield 30; }
//		case 2 -> 28;
//		default -> 31;
//		};
		
		int endDay = 31;
		if (i == 2) endDay = 28;
		else if (i == 4 || i == 6 || i == 9 || i == 11) endDay = 30;
		System.out.println(endDay);
	}
}
