package ex0730.제어문;

public class WhileExam01 {

	public static void main(String[] args) {
		//1. 1~ 100가지 한줄로 출력
//				for(int i = 1; i<=100; i++) {
//					System.out.print(i);
//				}
		boolean a = true;
		int num = 1;
		while(a) {
			System.out.print(num + " ");
			if (num >= 100) a = false;
			num += 1;
		}
				
				System.out.println();

				//2. A ~Z 까지 한줄로 출력
//				for(int i = 0; i<=25; i++) {
//					char d = 'A';
//					d = (char)(d+i);
//					System.out.print(d);
//					
//				}
//				for(char d = 'A'; d <= 'Z'; d++) {
//					System.out.print(d);
//				}
				a = true;
				char charA = 'A';
				while(a) {
					System.out.print((char)charA + " ");
					if (charA >= 'Z') a = false;
					charA++;
				}
				
				System.out.println();
				
				//3. 1~ 10 까지 합 구해서 
				a = true;
				int init = 0;
				int t = 1;
//				for(int i = 1; i<=10; i++) {
//					t += i;
//					if(i == 10)System.out.print(t);
//				}
				while(a) {
					init += t;
					if (t >= 10) a = false;
					t++;
				}
				System.out.println(init);
				
				//4. 1 ~ 100 사이의 7의 배수만 출력
//				for(int i = 1; i<=100; i++) {
//					if(i%7 == 0) System.out.print(i);
//				}
				a = true;
				init = 1;
				while(a) {
					if(init%7 == 0) System.out.print(init);
					else if (init >= 100) a = false;
					init++;
				}
				
				System.out.println();
				
				//5. 100 ~ 1 사이의 5 의 배수만 출력
//				for(int i = 100; i>0; i--) {
//					if(i%5 == 0) System.out.print(i);
//				}
				a = true;
				init = 1;
				while(a) {
					if(init%5 == 0) System.out.print(init);
					else if (init >= 100) a = false;
					init++;
				}
				
				System.out.println();
				//1.  1 ~ 100가지 10행 10열로 출력 (for문 안에 for문이용)
//				for(int i = 0; i<10; i++) {
//					for(int j = 1; j <= 10; j++) {
//						System.out.print(i*10+j);
//					}
//					System.out.println();
//				}
				a = true;
				boolean b = true;
				init = 0;
				int initSec = 1;
				while(a) {
					while(b) {
						System.out.print(init*10+initSec + " ");
						if (initSec >= 10) {
							initSec = 1;
							break;
						}
						initSec++;
					}
					b = true;
					if (init >= 9) a = false;
					init++;
					System.out.println();
				}
				
				System.out.println();
				//2. 1 ~ 100가지 10행 10열로 출력 (for문 안에  if문이용)
//				for(int i = 1; i <= 100; i++) {
//					if(i%10 == 1 && i >= 10) System.out.println();
//					System.out.print(i);
//				}
//				
//				System.out.println();
				a = true;
				init = 1;
				while(a) {
					if(init%10 == 1 && init >= 10) {
						System.out.println();
					} else if (init >= 100) a = false;
					System.out.print(init + " ");
					init++;
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
//				for(int i = 1; i<=9; i++) {
//					for(int j = 2; j<=9; j++) {
//						System.out.print(j + "*" + i + "=" + (i*j) + " ");
//					}
//					System.out.println();
//				}
				a = true;
				b = true;
				init = 1;
				initSec = 2;
				while(a) {
					while(b) {
						System.out.print(initSec + "*" + init + "=" + (init*initSec) + " ");
						if (initSec >= 9) {
							initSec = 2;
							break;
						}
						initSec++;
					}
					if (init >= 9) a = false;
					init++;
					System.out.println();
				}
	}

}
