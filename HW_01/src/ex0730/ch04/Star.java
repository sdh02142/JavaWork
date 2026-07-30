package ex0730.ch04;

public class Star {

	public static void main(String[] args) {
		for(int i = 1; i <= 24; i++) {
			int count = i%6;
			if(count == 0) {
				System.out.println("****************************");
			} else if (i<6) {
				for(int j = 1; j <= count ; j++) {
					System.out.print("★");
				}
				System.out.println();
			} else if (i<12) {
				for(int j = 6 - count; j >= 1 ; j--) {
					System.out.print("★");
				}
				System.out.println();
			} else if (i<18) {
				for(int j = 5 - count; j >= 1 ; j--) {
					System.out.print(" ");
				}
				for(int k = 1; k <= count ; k++) {
					System.out.print("★");
				}
				System.out.println();
			} else if (i<24) {
				for(int k = 2; k <= count ; k++) {
					System.out.print(" ");
				}
				for(int j = 6 - count; j >= 1 ; j--) {
					System.out.print("★");
				}
				System.out.println();
			}
		}
	}

}
