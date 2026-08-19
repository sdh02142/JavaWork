package ex0730.ch04;

/**
 * @author 주우진
 * 날짜 : 2026-07-30
 * 주제 : 별 그리기
 * */

public class Star {

	public static void main(String[] args) {
		for(int i = 1; i <= 24; i++) {
			//int count = i%6;
			if(i%6 == 0) {
				System.out.println("****************************");
			} else if (i<6) {
				for(int j = 1; j <= i%6 ; j++) {
					System.out.print("★");
				}
				System.out.println();
			} else if (i<12) {
				for(int j = 6 - i%6; j >= 1 ; j--) {
					System.out.print("★");
				}
				System.out.println();
			} else if (i<18) {
				for(int j = 5 - i%6; j >= 1 ; j--) {
					System.out.print(" ");
				}
				for(int k = 1; k <= i%6 ; k++) {
					System.out.print("★");
				}
				System.out.println();
			} else if (i<24) {
				for(int k = 2; k <= i%6 ; k++) {
					System.out.print(" ");
				}
				for(int j = 6 - i%6; j >= 1 ; j--) {
					System.out.print("★");
				}
				System.out.println();
			}
		}
	}

}
