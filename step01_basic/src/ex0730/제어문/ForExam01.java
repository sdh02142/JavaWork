package ex0730.제어문;

public class ForExam01 {

	public static void main(String[] args) {
		//1. 1~ 100가지 한줄로 출력
		for(int i = 1; i<=100; i++) {
			System.out.print(i);
		}
		
		System.out.println();

		//2. A ~Z 까지 한줄로 출력
//		for(int i = 0; i<=25; i++) {
//			char d = 'A';
//			d = (char)(d+i);
//			System.out.print(d);
//			
//		}
		for(char d = 'A'; d <= 'Z'; d++) {
			System.out.print(d);
		}
		
		System.out.println();
		
		//3. 1~ 10 까지 합 구해서 
		int t = 0;
		for(int i = 1; i<=10; i++) {
			t += i;
			if(i == 10)System.out.print(t);
		}
		
		System.out.println();
		
		//4. 1 ~ 100 사이의 7의 배수만 출력
		for(int i = 1; i<=100; i++) {
			if(i%7 == 0) System.out.print(i);
		}
		
		System.out.println();
		
		//5. 100 ~ 1 사이의 5 의 배수만 출력
		for(int i = 100; i>0; i--) {
			if(i%5 == 0) System.out.print(i);
		}
	}

}
