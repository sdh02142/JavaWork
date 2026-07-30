package ex0730.scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// 키보드 입력 받기
		Scanner sc = new Scanner(System.in); // 자동 import -> Ctrl + Shift + O
		
		while(true) {
			System.out.println();
			
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			int total = kor + eng + math;
			double avg = total / 3.0;
			
			/*class 사용 없이 소수점 표기 제한해보기*/
			avg = avg - avg%0.01;
		}
	}

}
