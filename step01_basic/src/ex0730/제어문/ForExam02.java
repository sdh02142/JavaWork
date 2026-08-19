package ex0730.제어문;

public class ForExam02 {

	public static void main(String[] args) {
		//1.  1 ~ 100가지 10행 10열로 출력 (for문 안에 for문이용)
				for(int i = 0; i<10; i++) {
					for(int j = 1; j <= 10; j++) {
						System.out.print(i*10+j);
					}
					System.out.println();
				}
				
				System.out.println();
				//2. 1 ~ 100가지 10행 10열로 출력 (for문 안에  if문이용)
				for(int i = 1; i <= 100; i++) {
					if(i%10 == 1 && i >= 10) System.out.println();
					System.out.print(i);
				}
				
				System.out.println();
				System.out.println();
				//3. 구구단 출력  -  for 문안에 for문이용
				/*
						 * 
						 *  2*1=2  3*1=3 ..... 9*1=9
						 *  2*2=4  3*2=4  4*2=4
						 *  2*3=6
						 *  ..
						 *  
						 *  2*9=18              9*9=81
						 * 
						 * */
				for(int i = 1; i<=9; i++) {
					for(int j = 2; j<=9; j++) {
						System.out.print(j + "*" + i + "=" + (i*j) + " ");
					}
					System.out.println();
				}
	}

}
